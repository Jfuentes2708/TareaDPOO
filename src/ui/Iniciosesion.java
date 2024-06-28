package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Iniciosesion extends JFrame {

	private JPanel contentPaneInicio;
	private JTextField tFUs;
	private JTextField tFCon;

	
	
	public Iniciosesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 251);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		contentPaneInicio = new JPanel();
		contentPaneInicio.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneInicio);
		contentPaneInicio.setLayout(null);
		
		JLabel lblUs = new JLabel("     Usuario");
		lblUs.setForeground(Color.BLACK);
		lblUs.setBackground(Color.CYAN);
		lblUs.setBounds(0, 0, 432, 31);
		contentPaneInicio.add(lblUs);
		
		tFUs = new JTextField();
		tFUs.setBounds(0, 35, 432, 31);
		contentPaneInicio.add(tFUs);
		tFUs.setColumns(10);
		
		JLabel lblCon = new JLabel("     Contrase\u00F1a");
		lblCon.setForeground(Color.BLACK);
		lblCon.setBackground(Color.BLACK);
		lblCon.setBounds(0, 79, 432, 31);
		contentPaneInicio.add(lblCon);
		
		tFCon = new JTextField();
		tFCon.setColumns(10);
		tFCon.setBounds(0, 120, 432, 31);
		contentPaneInicio.add(tFCon);
		
		JButton btnRegis = new JButton("Iniciar sesion");
		
		btnRegis.setBounds(155, 160, 117, 31);
		contentPaneInicio.add(btnRegis);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
