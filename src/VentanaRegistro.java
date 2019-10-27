import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 55, 56, 16);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(12, 75, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setBounds(141, 55, 84, 16);
		contentPane.add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 75, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.setBounds(34, 215, 97, 25);
		contentPane.add(btnComenzar);
		
		JLabel lblSiYaTienes = new JLabel("Si ya tienes cuenta...");
		lblSiYaTienes.setBounds(285, 199, 135, 16);
		contentPane.add(lblSiYaTienes);
		
		JButton btnIniciarSesin = new JButton("Iniciar sesi\u00F3n");
		btnIniciarSesin.setBounds(295, 215, 116, 25);
		contentPane.add(btnIniciarSesin);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(12, 161, 56, 16);
		contentPane.add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 180, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNTarjeta = new JLabel("N\u00BA Tarjeta");
		lblNTarjeta.setBounds(140, 161, 109, 16);
		contentPane.add(lblNTarjeta);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 180, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(12, 110, 56, 16);
		contentPane.add(lblNombre);
		
		textField_4 = new JTextField();
		textField_4.setBounds(12, 139, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setBounds(140, 110, 75, 16);
		contentPane.add(lblApellidos);
		
		textField_5 = new JTextField();
		textField_5.setBounds(140, 139, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCreaTuCuenta = new JLabel("CREA TU CUENTA");
		lblCreaTuCuenta.setBounds(12, 13, 140, 29);
		contentPane.add(lblCreaTuCuenta);
	}
}
