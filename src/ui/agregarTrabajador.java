package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import componentesVisuales.BotonAnimacion;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class agregarTrabajador extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nombreTXT;
	private JTextField ciTXT;
	private JTextField apellidoTXT;


	public agregarTrabajador() {
		setBounds(100, 100, 600, 500);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 600, 500);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		//setLocationByPlatform(isCursorSet());
		setUndecorated(true);
		setLocationRelativeTo(null);

		apellidoTXT = new JTextField();
		apellidoTXT.setColumns(10);
		apellidoTXT.setBounds(256, 97, 140, 19);
		contentPanel.add(apellidoTXT);

		JLabel label_apellidos = new JLabel(" Apellidos");
		label_apellidos.setForeground(new Color(8, 6, 7));
		label_apellidos.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		label_apellidos.setBounds(135, 99, 82, 13);
		contentPanel.add(label_apellidos);

		BotonAnimacion borrarBT = new BotonAnimacion();
		borrarBT.setText("Borrar");

		borrarBT.setBounds(315, 447, 97, 23);
		contentPanel.add(borrarBT);


		BotonAnimacion btnAgregar = new BotonAnimacion();
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.setText("Agregar");
		btnAgregar.setBounds(124, 445, 93, 26);
		contentPanel.add(btnAgregar);

		JButton cerrarBTN = new JButton("X");
		cerrarBTN.setForeground(new Color(8, 6, 7));
		cerrarBTN.setBounds(0, 0, 22, 23);
		contentPanel.add(cerrarBTN);
		cerrarBTN.setBackground(new Color(19, 45, 109));
		cerrarBTN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cerrarBTN.setBorder(null);
		cerrarBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		cerrarBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JLabel lblNewLabel_6 = new JLabel("Datos Trabajor");
		lblNewLabel_6.setForeground(new Color(8, 6, 7));
		lblNewLabel_6.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
		lblNewLabel_6.setBounds(188, 0, 208, 35);
		contentPanel.add(lblNewLabel_6);

		JSpinner salarioBas = new JSpinner();
		salarioBas.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char a= e.getKeyChar();
				if(a<'0'|| a>'9')e.consume();

			}
		});
		
		salarioBas.setBounds(256, 323, 138, 19);

		contentPanel.add(salarioBas);

		JLabel lblNewLabel_1 = new JLabel("Nombre ");
		lblNewLabel_1.setForeground(new Color(8, 6, 7));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(135, 60, 82, 13);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("No Identidad");
		lblNewLabel_2.setForeground(new Color(8, 6, 7));
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(124, 143, 93, 13);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nivel Escolar");
		lblNewLabel_3.setForeground(new Color(8, 6, 7));
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(124, 200, 93, 13);
		contentPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Cargo");
		lblNewLabel_4.setForeground(new Color(8, 6, 7));
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(156, 267, 45, 13);
		contentPanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Salario Básico");
		lblNewLabel_5.setForeground(new Color(8, 6, 7));
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(123, 325, 94, 13);
		contentPanel.add(lblNewLabel_5);

		nombreTXT = new JTextField();
		nombreTXT.addKeyListener(new KeyAdapter() {//CODIGO SOLO NOMBRES (PENDINETE PARA LOS ESPACIONS)
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'a'||c>'z' )&& (c<'A'|| c>'Z')
						&& !(c== e.VK_BACK_SPACE))e.consume();
					
			}
		});
		nombreTXT.setBounds(256, 58, 140, 19);
		contentPanel.add(nombreTXT);
		nombreTXT.setColumns(10);

		ciTXT = new JTextField();

		ciTXT.addKeyListener(new KeyAdapter() {//CODIGO PARA SOLO ACEPTAR DIGITOS 
			public void keyTyped(KeyEvent e) {
				char a= e.getKeyChar();
				if(a<'0'|| a>'9')e.consume();
			}
		});

		ciTXT.setBounds(256, 141, 140, 19);
		contentPanel.add(ciTXT);
		ciTXT.setColumns(10);

		JComboBox<String> nivelBox = new JComboBox();
		nivelBox.setBounds(256, 197, 142, 21);
		contentPanel.add(nivelBox);
		nivelBox.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Tecnico Medio", "Preuniversitario","Universitario" }));

		JComboBox<String> cargoBOX = new JComboBox();
		cargoBOX.setBounds(256, 264, 140, 21);
		contentPanel.add(cargoBOX);
		cargoBOX.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Dependiente" , "Gerente",
		"Asistente" }));


		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoAgregar.png"));
		lblNewLabel.setBounds(0, 0, 600, 500);
		contentPanel.add(lblNewLabel);
		borrarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreTXT.setText("");
				ciTXT.setText("");
				apellidoTXT.setText("");

			}
		});
	}
}
