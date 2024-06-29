package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;

public class agregarTrabajador extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			agregarTrabajador dialog = new agregarTrabajador();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public agregarTrabajador() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 436, 232);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos Trabajador", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(36, 25, 351, 197);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("No Identidad");
			lblNewLabel_2.setBounds(10, 58, 72, 13);
			panel.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Nivel Escolar");
			lblNewLabel_3.setBounds(10, 95, 72, 13);
			panel.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Cargo");
			lblNewLabel_4.setBounds(10, 133, 45, 13);
			panel.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Salario Básico");
			lblNewLabel_5.setBounds(10, 174, 72, 13);
			panel.add(lblNewLabel_5);
			
			textField = new JTextField();
			textField.setBounds(146, 19, 140, 19);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(146, 58, 140, 19);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(144, 91, 142, 21);
			comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {
					 "Medio", "Superior","Universitario" }));
			panel.add(comboBox);
			
			JComboBox<String> comboBox_1 = new JComboBox();
			comboBox_1.setBounds(146, 129, 140, 21);
			comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {
					"Dependiente" , "Gerente",
					 "Asistente" }));
			panel.add(comboBox_1);
			
			JSpinner spinner = new JSpinner();
			spinner.setBounds(146, 171, 120, 20);
			spinner.setModel(new SpinnerNumberModel(new Float(500), new Float(500), null, new Float(1)));
			panel.add(spinner);
		
		
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoAgregar.png"));
			lblNewLabel.setBounds(0, 0, 436, 263);
			contentPanel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Nombre y Apellidos");
			lblNewLabel_1.setBounds(10, 10, 110, 13);
			contentPanel.add(lblNewLabel_1);
		
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setBounds(317, 242, 63, 21);
			getContentPane().add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		
			JButton btnAgregar = new JButton("Aceptar");
			
			btnAgregar.setBounds(214, 242, 88, 21);
			getContentPane().add(btnAgregar);
			btnAgregar.setActionCommand("OK");
			getRootPane().setDefaultButton(btnAgregar);
		
		
		
	}
}
