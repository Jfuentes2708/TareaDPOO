package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import componentesVisuales.BotonAnimacion;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Window.Type;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class agregarDisco extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nombreTXT;
	private JTextField interpreteTXT;

	
	
	public agregarDisco() {
		setTitle("Datos Discos");
		setBounds(100, 100, 560, 371);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		BotonAnimacion btnmcnAgregar = new BotonAnimacion();
		btnmcnAgregar.setText("Agregar");
		btnmcnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton cerrarBTN = new JButton("X");
		cerrarBTN.setForeground(new Color(8, 6, 7));
		cerrarBTN.setBackground(new Color(19, 45, 109));
		cerrarBTN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cerrarBTN.setBorder(null);
		cerrarBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		cerrarBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cerrarBTN.setBounds(0, 0, 44, 21);
		contentPanel.add(cerrarBTN);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Float.valueOf(0), Float.valueOf(0), null, Float.valueOf(1)));
		spinner.setBounds(254, 211, 128, 20);
		contentPanel.add(spinner);
		
		JComboBox <String>soporteBox = new JComboBox();
		soporteBox.setModel(new DefaultComboBoxModel<String>(new String[] {"CD", "DVD"}));
		soporteBox.setBounds(262, 157, 120, 21);
				contentPanel.add(soporteBox);
		
		btnmcnAgregar.setBounds(101, 292, 79, 21);
		contentPanel.add(btnmcnAgregar);
		
		BotonAnimacion btnmcnBorrar = new BotonAnimacion();
		btnmcnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreTXT.setText("");
							interpreteTXT.setText("");
				
			}
		});
		btnmcnBorrar.setText("Borrar");
		btnmcnBorrar.setBounds(359, 292, 79, 21);
		contentPanel.add(btnmcnBorrar);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de Soporte");
		lblNewLabel_1.setBounds(113, 161, 80, 13);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre Disco");
		lblNewLabel_1_1.setBounds(115, 47, 96, 13);
		contentPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Precio");
		lblNewLabel_1_2.setBounds(114, 214, 79, 13);
		contentPanel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Interprete");
		lblNewLabel_1_2_1.setBounds(114, 102, 79, 13);
		contentPanel.add(lblNewLabel_1_2_1);
		
		nombreTXT = new JTextField();
		nombreTXT.setColumns(10);
		nombreTXT.setBounds(262, 44, 120, 19);
		contentPanel.add(nombreTXT);
		
		interpreteTXT = new JTextField();
		interpreteTXT.setColumns(10);
		interpreteTXT.setBounds(262, 99, 120, 19);
		contentPanel.add(interpreteTXT);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoAgregar.png"));
		lblNewLabel.setBounds(0, 0, 595, 420);
		contentPanel.add(lblNewLabel);
	}
}
