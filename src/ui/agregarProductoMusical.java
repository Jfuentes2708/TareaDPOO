package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import componentesVisuales.BotonAnimacion;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class agregarProductoMusical extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tituloTXT;
	private JTextField interpreteTXT;
	private JTextField colaboradorTXT;
	private JTextField albumTXT;


	public agregarProductoMusical() {
		setBounds(100, 100, 600, 500);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setSize(600,500);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setUndecorated(true);
	setLocationRelativeTo(null);
	
		JButton cerrarBTN = new JButton("X");
		cerrarBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cerrarBTN.setBounds(0, 0, 45, 21);
		contentPanel.add(cerrarBTN);
		cerrarBTN.setForeground(new Color(8, 6, 7));
		cerrarBTN.setBackground(new Color(19, 45, 109));
		cerrarBTN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cerrarBTN.setBorder(null);
		cerrarBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		{
			JPanel Otros = new JPanel();
			Otros.setBounds(61, 332, 457, 90);
			contentPanel.add(Otros);
			Otros.setBorder(new TitledBorder(null, "Datos Espec\u00EDficos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			Otros.setLayout(null);
			{
				JLabel lblNewLabel_10 = new JLabel("Resolución");
				lblNewLabel_10.setBounds(10, 20, 63, 13);
				Otros.add(lblNewLabel_10);
			}

			JLabel lblNewLabel_10 = new JLabel("Album");
			lblNewLabel_10.setBounds(219, 20, 63, 13);
			Otros.add(lblNewLabel_10);
			{
				JComboBox resolucionCBX = new JComboBox();
				resolucionCBX.setModel(new DefaultComboBoxModel(new String[] {"360p", "480p", "720P", "1080P"}));
				resolucionCBX.setBounds(10, 36, 63, 21);
				Otros.add(resolucionCBX);
			}
			{
				albumTXT = new JTextField();
				albumTXT.setBounds(218, 43, 77, 19);
				Otros.add(albumTXT);
				albumTXT.setColumns(10);
			}
		}

		BotonAnimacion btnmcnAgregar = new BotonAnimacion();
		btnmcnAgregar.setText("Agregar");
		btnmcnAgregar.setBounds(97, 445, 66, 21);
		contentPanel.add(btnmcnAgregar);

		BotonAnimacion btnmcnBorrar = new BotonAnimacion();
		btnmcnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmcnBorrar.setText("Borrar");
		btnmcnBorrar.setBounds(370, 445, 66, 21);
		contentPanel.add(btnmcnBorrar);
		{
			JLabel lblNewLabel_1 = new JLabel("Tipo Producto");
			lblNewLabel_1.setBounds(308, 39, 75, 13);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Titulo");
			lblNewLabel_2.setBounds(40, 38, 55, 13);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Interprete");
			lblNewLabel_3.setBounds(40, 74, 65, 13);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Colaborador");
			lblNewLabel_4.setBounds(29, 114, 66, 13);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Género");
			lblNewLabel_5.setBounds(340, 114, 45, 13);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Duración");
			lblNewLabel_6.setBounds(40, 198, 45, 13);
			contentPanel.add(lblNewLabel_6);
		}
		{
			JLabel lblNewLabel_7 = new JLabel("Tamaño Fichero");
			lblNewLabel_7.setBounds(301, 198, 84, 13);
			contentPanel.add(lblNewLabel_7);
		}
		{
			JLabel lblNewLabel_8 = new JLabel("Precio");
			lblNewLabel_8.setBounds(40, 248, 45, 13);
			contentPanel.add(lblNewLabel_8);
		}
		{
			tituloTXT = new JTextField();
			tituloTXT.setColumns(10);
			tituloTXT.setBounds(131, 35, 108, 19);
			contentPanel.add(tituloTXT);
		}
		{
			interpreteTXT = new JTextField();
			interpreteTXT.setColumns(10);
			interpreteTXT.setBounds(131, 71, 108, 19);
			contentPanel.add(interpreteTXT);
		}
		{
			colaboradorTXT = new JTextField();
			colaboradorTXT.setColumns(10);
			colaboradorTXT.setBounds(131, 111, 108, 19);
			contentPanel.add(colaboradorTXT);
		}
		{
			JSpinner tamFicheroSpi = new JSpinner();
			tamFicheroSpi.setBounds(410, 195, 84, 20);
			contentPanel.add(tamFicheroSpi);
		}
		{
			JSpinner precioSpi = new JSpinner();
			precioSpi.setBounds(131, 245, 84, 20);
			contentPanel.add(precioSpi);
		}
		{
			JSpinner duracionSpi = new JSpinner();
			duracionSpi.setBounds(131, 195, 84, 20);
			contentPanel.add(duracionSpi);
		}
		{
			JComboBox productoCBX = new JComboBox();
			productoCBX.setModel(new DefaultComboBoxModel(new String[] {"Canción", "Video Clip"}));
			productoCBX.setBounds(410, 35, 108, 21);
			contentPanel.add(productoCBX);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pop", "Trap", "Bachata", "Regueton", "Salsa"}));
			comboBox.setBounds(410, 110, 108, 21);
			contentPanel.add(comboBox);
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setToolTipText("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoAgregar.png"));
			lblNewLabel.setBounds(0, 0, 600, 500);
			contentPanel.add(lblNewLabel);
			lblNewLabel.setBorder(null);
		}
	}
}
