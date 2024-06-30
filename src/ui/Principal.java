package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1122, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 900, 500));
 //setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setBounds(0, 0, 900, 500);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(0, 0, 900, 22);
		contentPane.add(menuBar);
		
		JButton btnNewButton = new JButton("Lupa");
		menuBar.add(btnNewButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setSize(30, 100);
		menuBar.add(textField);
		textField.setColumns(10);
	
		JMenu menuCuenta = new JMenu("Cuenta");
		menuBar.add(menuCuenta);
		
		JMenuItem inicioSesio = new JMenuItem("Iniciar Sesión");
		inicioSesio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					IniciarSesion dialog = new IniciarSesion();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		menuCuenta.add(inicioSesio);
		
		JMenuItem registro = new JMenuItem("Registrar");
		menuCuenta.add(registro);
		
		JMenu menuServicios = new JMenu("Servicios");
		menuBar.add(menuServicios);
		
		JMenuItem personalizarDisco = new JMenuItem("Personalizar Disco");
		menuServicios.add(personalizarDisco);
		
		JMenu menuCesta = new JMenu("Cesta");
		menuBar.add(menuCesta);
		
		JMenuItem pago = new JMenuItem("Pago");
		menuCesta.add(pago);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JMenu menuOpciones = new JMenu("Opciones");
		menuBar.add(menuOpciones);
		
		JMenu mnNewMenu_4 = new JMenu("Agregar");
		menuOpciones.add(mnNewMenu_4);
		
		JMenuItem agregarDisco = new JMenuItem("Disco");
		mnNewMenu_4.add(agregarDisco);
		
		JMenuItem agregarProM = new JMenuItem("Producto Músical");
		mnNewMenu_4.add(agregarProM);
		
		JMenuItem agregarTrabajador = new JMenuItem("Trabajador");
		agregarTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					agregarTrabajador dialog = new agregarTrabajador();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		mnNewMenu_4.add(agregarTrabajador);
		
		JMenu mnNewMenu_6 = new JMenu("Eliminar");
		menuOpciones.add(mnNewMenu_6);
		
		JMenuItem eliminarDisco = new JMenuItem("Disco");
		mnNewMenu_6.add(eliminarDisco);
		
		JMenuItem eliminarProducMus = new JMenuItem("Producto Músical");
		mnNewMenu_6.add(eliminarProducMus);
		
		JMenuItem eliminarTrabajador = new JMenuItem("Trabajador");
		mnNewMenu_6.add(eliminarTrabajador);
		
		JMenu mnNewMenu_7 = new JMenu("Modificar");
		menuOpciones.add(mnNewMenu_7);
		
		JMenuItem modificarDisco = new JMenuItem("Disco");
		mnNewMenu_7.add(modificarDisco);
		
		JMenuItem modificarProducMusi = new JMenuItem("Producto Músical");
		mnNewMenu_7.add(modificarProducMusi);
		
		JMenuItem modificarTrabajador = new JMenuItem("Trabajador");
		mnNewMenu_7.add(modificarTrabajador);
		
		JMenu mnNewMenu_5 = new JMenu("Registros");
		menuOpciones.add(mnNewMenu_5);
		
		JMenuItem registroDisco = new JMenuItem("Disco");
		mnNewMenu_5.add(registroDisco);
		
		JMenuItem registroProMusic = new JMenuItem("Producto Músical");
		mnNewMenu_5.add(registroProMusic);
		
		JMenuItem registroTrabajador = new JMenuItem("Trabajadores");
		mnNewMenu_5.add(registroTrabajador);
		menuBar.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoPrincipal.jpg"));
		lblNewLabel.setBounds(0, 0, 900, 500);
		contentPane.add(lblNewLabel);
	}
}
