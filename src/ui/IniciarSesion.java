package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import componentesVisuales.BotonAnimacion;
import logic.Tienda;

import java.awt.Cursor;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import Inicializar.Usuarios;
import Inicializar.autenticacion;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class IniciarSesion extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPaneInicio = new JPanel();
	private JPasswordField txtPassword;
	private JTextField txtUsario;
	private Tienda tienda;


	public IniciarSesion(final Tienda tiendaDatos) {
		this.tienda=tiendaDatos;
		setBounds(0,0, 600, 500);
		setUndecorated(true);
		contentPaneInicio.setBorder(new EmptyBorder(5, 5, 600, 500));
		setContentPane(contentPaneInicio);
		contentPaneInicio.setLayout(null);
		// setLocationByPlatform(isCursorSet());
		setLocationRelativeTo(null);

		JPanel fondoIzquie = new JPanel();
		fondoIzquie.setBackground(new Color(222, 222, 222));
		fondoIzquie.setBounds(0, 0, 300, 500);
		contentPaneInicio.add(fondoIzquie);
		fondoIzquie.setLayout(null);

		JPanel panel_1 = new JPanel();


		panel_1.setBackground(new Color(222, 222, 222));
		panel_1.setBorder(null);
		panel_1.setBounds(0, 0, 597, 25);
		fondoIzquie.add(panel_1);
		panel_1.setLayout(null);

		JButton cerrarBTN = new JButton("X");
		cerrarBTN.setBounds(0, 0, 22, 23);
		panel_1.add(cerrarBTN);
		cerrarBTN.setBackground(new Color(222, 222, 222));
		cerrarBTN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cerrarBTN.setBorder(null);
		cerrarBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{cerrarBTN}));

		cerrarBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 230, 268, 18);
		fondoIzquie.add(separator_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(22, 304, 268, 2);
		fondoIzquie.add(separator);

		BotonAnimacion btnmcnIniciarSesin = new BotonAnimacion();
		btnmcnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						String nombreUsuario= txtUsario.getText().trim();
						String contraseña= new String (txtPassword.getPassword());
						autenticacion auntenticar= new autenticacion();
						Usuarios usuario= auntenticar.verificausuario(nombreUsuario, contraseña);
						if(usuario!=null) {
							Principal frame = new Principal(tienda,IniciarSesion.this);
							frame.setVisible(true);
							setVisible(false);
							txtUsario.setText("");
							txtPassword.setText("");
						}else {
							//JOptionPane.showConfirmDialog(null,"Usuario Incorrecto");
							JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
						}
					}
				});
			}
		});
		btnmcnIniciarSesin.setFont(new Font("Arial", Font.BOLD, 16));
		btnmcnIniciarSesin.setText("Aceptar");
		btnmcnIniciarSesin.setText("Iniciar Sesión");
		btnmcnIniciarSesin.setBounds(68, 441, 151, 35);
		fondoIzquie.add(btnmcnIniciarSesin);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(22, 285, 268, 18);
		fondoIzquie.add(txtPassword);
		txtPassword.setBorder(null);
		txtPassword.setBackground(null);

		txtUsario = new JTextField();
		txtUsario.setBounds(22, 215, 268, 13);
		fondoIzquie.add(txtUsario);
		txtUsario.setColumns(10);
		txtUsario.setBorder(null);
		txtUsario.setBackground(null);

		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 261, 89, 18);
		fondoIzquie.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(22, 187, 67, 18);
		fondoIzquie.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Inicio de Sesión");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(53, 35, 189, 25);
		fondoIzquie.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("    ¿Nuevo Usario?");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Registro dialog = new Registro(IniciarSesion.this);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
				setVisible(false);

			}
		});
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setBounds(68, 372, 174, 13);
		fondoIzquie.add(lblNewLabel_3);

		JLabel labelFondo = new JLabel();
		labelFondo.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoInicio.png"));
		labelFondo.setBounds(243, 0, 357, 500);
		contentPaneInicio.add(labelFondo);

	}
}