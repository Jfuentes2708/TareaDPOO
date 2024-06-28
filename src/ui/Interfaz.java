package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 258);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu dvdMenu = new JMenu("DVD");
		JMenu cdMenu = new JMenu("  CD  ");
		JButton btnLupa = new JButton("Lu");
		JMenu cestaCompra = new JMenu("Cesta ");
		JMenu cuentaMenu = new JMenu("Cuenta");
		
		menuBar.add(dvdMenu);
		menuBar.add(cdMenu);
		menuBar.add(btnLupa);
		menuBar.add(cestaCompra);
		menuBar.add(cuentaMenu);
		
		
		
		
		JMenuItem mIDTodos = new JMenuItem("Todos");
		JMenuItem mIDPais = new JMenuItem("Pais");
		JMenuItem mIDArtista = new JMenuItem("Artista");
		JMenuItem mIDGenero = new JMenuItem("Genero");
		
		dvdMenu.add(mIDTodos);
		dvdMenu.add(mIDPais);
		dvdMenu.add(mIDArtista);
		dvdMenu.add(mIDGenero);
		
		
		
		
		
		JMenuItem mICTodos = new JMenuItem("Todos");
		JMenuItem mICPais = new JMenuItem("Pais");
		JMenuItem mICArtista = new JMenuItem("Artista");
		JMenuItem mICGenero = new JMenuItem("Genero");
		
		cdMenu.add(mICTodos);
		cdMenu.add(mICPais);
		cdMenu.add(mICArtista);
		cdMenu.add(mICGenero);
		
		
		
		JMenuItem mICEOrden = new JMenuItem("Orden");
		JMenuItem mICEProducto = new JMenuItem("Producto Salvados");
		
		cestaCompra.add(mICEOrden);
		cestaCompra.add(mICEProducto);
		
		JMenuItem mICUInicio = new JMenuItem("Inicio de Cesion");
		JMenuItem mICURegistro = new JMenuItem("Registrarse");
		
		cuentaMenu.add(mICUInicio);
		cuentaMenu.add(mICURegistro);
		
		

		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 477, 184);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLetrero = new JLabel("Tienda de DVDs y CDs");
		lblLetrero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLetrero.setForeground(Color.WHITE);
		lblLetrero.setBounds(12, 65, 228, 51);
		panel.add(lblLetrero);
		
		JLabel lFonde = new JLabel("New label");
		lFonde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lFonde.setBounds(0, 0, 477, 184);
		panel.add(lFonde);
		lFonde.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/fondo.jpeg")));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 13, 97, 25);
		panel.add(btnNewButton);
		
		
        
	}
}
