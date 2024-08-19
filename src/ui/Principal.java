package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inicializar.Datos;
import Inicializar.Usuarios;

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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import logic.Tienda;
import logic.Trabajador;
public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private IniciarSesion anterior; 
	private  Tienda tienda; 
	private JMenuBar menuBar ;
	private JButton btnNewButton;
	private JMenu menuCuenta ;
	private JMenuItem registro;
	private JMenuItem inicioSesio;
	private JMenu menuServicios;
	private JMenuItem personalizarDisco;
	private JMenu menuCesta;
	private JMenuItem pago;
	private JButton btnNewButton_1;
	private JMenu menuOpciones;
	private JMenu agregarMenu;
	private JMenuItem agregarDisco;
	private JMenuItem agregarProM;
	private JMenuItem agregarTrabajador;
	private JMenu mnNewMenu_5;
	private JMenuItem registroDisco;
	private JMenuItem registroProMusic;
	private JMenuItem registroTrabajador;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private Usuarios usuario;
	public Principal(final Tienda tiendaDatos,IniciarSesion inicio,Usuarios usu) {
		this.anterior=inicio;
		this.usuario=usu;
		this.tienda=tiendaDatos;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1122, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 900, 500));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setBounds(0, 0, 900, 500);
		setLocationRelativeTo(null);

		menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(0, 0, 900, 22);
		contentPane.add(menuBar);

		btnNewButton = new JButton("Lupa");
		menuBar.add(btnNewButton);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setSize(30, 100);
		menuBar.add(textField);
		textField.setColumns(10);

		menuCuenta = new JMenu("Cuenta");
		menuBar.add(menuCuenta);

		registro = new JMenuItem("Registrar");
		registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		menuCuenta.add(registro);

		inicioSesio = new JMenuItem("Cerrar Sesión");
		inicioSesio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Principal.this.anterior.setVisible(true);
			}
		});

		menuCuenta.add(inicioSesio);

		menuServicios = new JMenu("Servicios");
		menuBar.add(menuServicios);

		personalizarDisco = new JMenuItem("Personalizar Disco");
		menuServicios.add(personalizarDisco);

		menuCesta = new JMenu("Cesta");//PARA LA VALIDACION DE LOS USUARIOS
		if(usuario==null) {
			menuCesta.setVisible(false);
		}else {
			menuCesta.setVisible(usuario.isAgregar());
		}
			
		menuBar.add(menuCesta);

		pago = new JMenuItem("Pago");
		menuCesta.add(pago);

		btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menuOpciones = new JMenu("Opciones");
		menuBar.add(menuOpciones);

		mnNewMenu_5 = new JMenu("Registros");
		menuOpciones.add(mnNewMenu_5);

		registroDisco = new JMenuItem("Disco");
		registroDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDiscos dialog1 = new mostrarDiscos(tienda);
				dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog1.setVisible(usuario.isMostrarDisco());


			}
		});
		mnNewMenu_5.add(registroDisco);

		registroProMusic = new JMenuItem("Canciones");
		registroProMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarCanciones dialog1 = new mostrarCanciones(tienda);
				dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog1.setVisible(true);

			}
		});

		mntmNewMenuItem_1 = new JMenuItem("DiscoPersonalizado");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDiscosPersonalizados dialog1 = new mostrarDiscosPersonalizados(tienda);
				dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog1.setVisible(true);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_1);
		mnNewMenu_5.add(registroProMusic);

		registroTrabajador = new JMenuItem("Trabajadores");
		registroTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mostrarTrabajadores dialog = new mostrarTrabajadores(tienda);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);

			}
		});

		mntmNewMenuItem = new JMenuItem("Videos Musicales");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVideos dialog = new mostrarVideos(tienda );
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem);
		mnNewMenu_5.add(registroTrabajador);

		agregarMenu = new JMenu("Agregar");
		if(usuario==null) {
			agregarMenu.setVisible(false);
		}else {
			agregarMenu.setVisible(usuario.isAgregar());
		}
				menuOpciones.add(agregarMenu);


		agregarDisco = new JMenuItem("Disco");
		agregarDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				agregarDisco dialog = new agregarDisco(tienda,null);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(usuario.isAgregar());

			}
		});

		agregarMenu.add(agregarDisco);

		agregarProM = new JMenuItem("Producto Músical");
		agregarProM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				agregarProductoMusical dialog = new agregarProductoMusical();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);

			}
		});
		agregarMenu.add(agregarProM);

		agregarTrabajador = new JMenuItem("Trabajador");
		agregarTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				agregarTrabajador dialog = new agregarTrabajador(tienda,null);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);

			}
		});
		agregarMenu.add(agregarTrabajador);
		menuBar.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoPrincipal.jpg"));
		lblNewLabel.setBounds(0, 0, 900, 500);
		contentPane.add(lblNewLabel);
	}
}
