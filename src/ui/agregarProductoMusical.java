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

public class agregarProductoMusical extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			agregarProductoMusical dialog = new agregarProductoMusical();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public agregarProductoMusical() {
		setBounds(100, 100, 600, 500);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setSize(600,500);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel Otros = new JPanel();
			Otros.setBounds(59, 336, 457, 90);
			contentPanel.add(Otros);
			Otros.setBorder(new TitledBorder(null, "Datos Espec\u00EDficos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			Otros.setLayout(null);
			{
				JLabel lblNewLabel_9 = new JLabel("New label");
				lblNewLabel_9.setBounds(38, 20, 45, 13);
				Otros.add(lblNewLabel_9);
			}
			{
				JLabel lblNewLabel_10 = new JLabel("New label");
				lblNewLabel_10.setBounds(231, 20, 45, 13);
				Otros.add(lblNewLabel_10);
			}
		}
		{
			JPanel datosEstandar = new JPanel();
			datosEstandar.setBounds(51, 34, 448, 284);
			contentPanel.add(datosEstandar);
			datosEstandar.setLayout(null);
			datosEstandar.setBorder(new TitledBorder(null, "Datos Est\u00E1ndar ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			{
				JLabel lblNewLabel_1 = new JLabel("Tipo Producto");
				lblNewLabel_1.setBounds(29, 20, 45, 13);
				datosEstandar.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Titulo");
				lblNewLabel_2.setBounds(29, 55, 45, 13);
				datosEstandar.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Interprete");
				lblNewLabel_3.setBounds(39, 78, 45, 13);
				datosEstandar.add(lblNewLabel_3);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Colaborador");
				lblNewLabel_4.setBounds(49, 101, 45, 13);
				datosEstandar.add(lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Género");
				lblNewLabel_5.setBounds(59, 124, 45, 13);
				datosEstandar.add(lblNewLabel_5);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("Duración");
				lblNewLabel_6.setBounds(70, 159, 45, 13);
				datosEstandar.add(lblNewLabel_6);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Tamaño Fichero");
				lblNewLabel_7.setBounds(59, 189, 45, 13);
				datosEstandar.add(lblNewLabel_7);
			}
			{
				JLabel lblNewLabel_8 = new JLabel("Precio");
				lblNewLabel_8.setBounds(70, 226, 45, 13);
				datosEstandar.add(lblNewLabel_8);
			}
		}
		{
			JButton okButton = new JButton("OK");
			okButton.setBounds(100, 432, 45, 21);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setBounds(329, 432, 63, 21);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoAgregar.png"));
			lblNewLabel.setBounds(0, 0, 600, 500);
			contentPanel.add(lblNewLabel);
			
		}
	}

}
