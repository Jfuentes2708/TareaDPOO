package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import componentesVisuales.BotonAnimacion;
import java.awt.Cursor;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.LineBorder;

public class Registro extends JDialog {
	

	private static final long serialVersionUID = 1L;
	private final JPanel contentPaneInicio = new JPanel();
	private JPasswordField txtPassword;
	private JTextField txtUsario;
	private JTextField txtNombreUsuario;
	
	/**
	 * Launch the application.
	 */

	public Registro() {
		setBounds(0,0, 600, 500);
		setUndecorated(true);
		contentPaneInicio.setBorder(new EmptyBorder(5, 5, 600, 500));
		setContentPane(contentPaneInicio);
		contentPaneInicio.setLayout(null);
		setLocationByPlatform(isCursorSet());

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
		separator_1.setBounds(22, 149, 268, 18);
		fondoIzquie.add(separator_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(22, 373, 268, 2);
		fondoIzquie.add(separator);

		BotonAnimacion btnmcnRegistro = new BotonAnimacion();
		btnmcnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		 btnmcnRegistro.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		 btnmcnRegistro.setText("Aceptar");
		 btnmcnRegistro.setText("Registrar");
		 btnmcnRegistro.setBounds(68, 441, 151, 35);
		fondoIzquie.add( btnmcnRegistro);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(22, 354, 268, 18);
		fondoIzquie.add(txtPassword);
		txtPassword.setBorder(null);
		txtPassword.setBackground(null);

		txtUsario = new JTextField();
		txtUsario.setBounds(22, 259, 268, 13);
		fondoIzquie.add(txtUsario);
		txtUsario.setColumns(10);
		txtUsario.setBorder(null);
		txtUsario.setBackground(null);

		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 330, 89, 18);
		fondoIzquie.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre y Apellidos");
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(22, 106, 151, 18);
		fondoIzquie.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Registrar");
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(53, 35, 189, 25);
		fondoIzquie.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre de Usuario");
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(22, 195, 151, 13);
		fondoIzquie.add(lblNewLabel_3);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(27, 230, 249, 19);
		fondoIzquie.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);

		JLabel labelFondo = new JLabel();
		labelFondo.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoInicio.png"));
		labelFondo.setBounds(243, 0, 357, 500);
		contentPaneInicio.add(labelFondo);

	}
}