package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.github.weisj.jsvg.nodes.Circle;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import componentesVisuales.BotonAnimacion;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.Font;

public class Iniciosesion extends JFrame {

	private JPanel contentPaneInicio;
	private JPasswordField txtPassword;
	private JTextField txtUsario;

	
	
	public Iniciosesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 600, 500);
	setUndecorated(true);
		
		contentPaneInicio = new JPanel();
		contentPaneInicio.setBorder(new EmptyBorder(5, 5, 600, 500));
		setContentPane(contentPaneInicio);
		contentPaneInicio.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 300, 500);
		contentPaneInicio.add(panel);
		panel.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 274, 268, 7);
		panel.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 373, 268, 2);
		panel.add(separator);
		
		BotonAnimacion btnmcnIniciarSesin = new BotonAnimacion();
		btnmcnIniciarSesin.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		btnmcnIniciarSesin.setText("Aceptar");
		btnmcnIniciarSesin.setText("Iniciar Sesión");
		btnmcnIniciarSesin.setBounds(68, 441, 151, 35);
		panel.add(btnmcnIniciarSesin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(22, 340, 268, 35);
		panel.add(txtPassword);
		
		txtUsario = new JTextField();
		txtUsario.setBounds(22, 240, 268, 35);
		panel.add(txtUsario);
		txtUsario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 320, 89, 18);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(22, 219, 67, 18);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inicio de Sesión");
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(53, 21, 189, 25);
		panel.add(lblNewLabel_2);
		
		JLabel labelFondo = new JLabel();
		labelFondo.setIcon(new ImageIcon("C:\\Users\\alejandro\\Documents\\GitHub\\TareaDPOO\\src\\imagenes\\FondoInicio.png"));
		labelFondo.setBounds(0, 0, 600, 500);
		contentPaneInicio.add(labelFondo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
