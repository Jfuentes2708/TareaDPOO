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

public class agregarTrabajador extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nombreTXT;
	private JTextField ciTXT;
	
	
	public agregarTrabajador() {
		setBounds(100, 100, 600, 500);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 600, 500);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setLocationByPlatform(isCursorSet());
		setUndecorated(true);
		
		BotonAnimacion borrarBT = new BotonAnimacion();
		borrarBT.setText("Borrar");
		
		borrarBT.setBounds(315, 447, 97, 23);
		contentPanel.add(borrarBT);
		//contentPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{ btnAgregar, borrarBT}));
		
		BotonAnimacion btnAgregar = new BotonAnimacion();
		btnAgregar.setText("Aceptar");
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
		salarioBas.setBounds(258, 289, 138, 19);
		
		contentPanel.add(salarioBas);

		JLabel lblNewLabel_1 = new JLabel("Nombre y Apellidos");
		lblNewLabel_1.setForeground(new Color(8, 6, 7));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(60, 63, 143, 13);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("No Identidad");
		lblNewLabel_2.setForeground(new Color(8, 6, 7));
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(60, 124, 100, 13);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nivel Escolar");
		lblNewLabel_3.setForeground(new Color(8, 6, 7));
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(66, 172, 108, 13);
		contentPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Cargo");
		lblNewLabel_4.setForeground(new Color(8, 6, 7));
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(76, 221, 45, 13);
		contentPanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Salario Básico");
		lblNewLabel_5.setForeground(new Color(8, 6, 7));
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(66, 291, 72, 13);
		contentPanel.add(lblNewLabel_5);

		nombreTXT = new JTextField();
		nombreTXT.setBounds(256, 61, 140, 19);
		contentPanel.add(nombreTXT);
		nombreTXT.setColumns(10);

		ciTXT = new JTextField();
		ciTXT.setBounds(256, 122, 140, 19);
		contentPanel.add(ciTXT);
		ciTXT.setColumns(10);

		JComboBox nivelBox = new JComboBox();
		nivelBox.setBounds(256, 169, 142, 21);
		contentPanel.add(nivelBox);
		nivelBox.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Tecnico Medio", "Preuniversitario","Universitario" }));

		JComboBox<String> cargoBOX = new JComboBox();
		cargoBOX.setBounds(254, 218, 140, 21);
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
				

			}
		});
	}
}
