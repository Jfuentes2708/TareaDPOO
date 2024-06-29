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
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1122, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 900, 500));
setUndecorated(true);
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
		menuBar.add(textField);
		textField.setColumns(10);
		
		JMenu mnNewMenu = new JMenu("Servicios");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Opciones");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Cesta");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("AcercaProyecto");
		menuBar.add(mnNewMenu_3);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menuBar.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoPrincipal.jpg"));
		lblNewLabel.setBounds(0, 0, 900, 500);
		contentPane.add(lblNewLabel);
	}
}