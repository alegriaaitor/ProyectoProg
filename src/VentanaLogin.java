import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIniciaSesin = new JLabel("Inicia sesi\u00F3n");
		lblIniciaSesin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblIniciaSesin.setBounds(141, 11, 150, 59);
		contentPane.add(lblIniciaSesin);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(49, 120, 89, 50);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasea.setBounds(49, 166, 177, 59);
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(236, 133, 115, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Puedes inicar sesi\u00F3n con tu cuenta para acceder a nuestros servicios");
		lblNewLabel.setBounds(32, 66, 394, 43);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(236, 189, 115, 20);
		contentPane.add(passwordField);
		
		JButton btnSiguiente = new JButton("ACCEDER");
		btnSiguiente.setBounds(236, 240, 156, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnNewButton = new JButton("Registrarse aqui");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setBounds(49, 240, 150, 23);
		contentPane.add(btnNewButton);
	}
}
