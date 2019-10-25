import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtIntroduzcaSuDestino;
	private JTextField txtCheckIn;
	private JTextField txtCheckOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 408);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIntroduzcaSuDestino = new JTextField();
		txtIntroduzcaSuDestino.setBackground(Color.WHITE);
		txtIntroduzcaSuDestino.setText("Introduzca su destino");
		txtIntroduzcaSuDestino.setBounds(36, 112, 295, 41);
		contentPane.add(txtIntroduzcaSuDestino);
		txtIntroduzcaSuDestino.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscar.setBounds(121, 267, 126, 31);
		contentPane.add(btnBuscar);
		
		txtCheckIn = new JTextField();
		txtCheckIn.setText("Check in");
		txtCheckIn.setBounds(36, 166, 147, 41);
		contentPane.add(txtCheckIn);
		txtCheckIn.setColumns(10);
		
		txtCheckOut = new JTextField();
		txtCheckOut.setText("Check out");
		txtCheckOut.setBounds(184, 166, 147, 41);
		contentPane.add(txtCheckOut);
		txtCheckOut.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(36, 220, 295, 22);
		contentPane.add(comboBox);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciarSesion.setBounds(309, 23, 116, 25);
		contentPane.add(btnIniciarSesion);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(449, 23, 116, 25);
		contentPane.add(btnRegistrarse);
		
		JLabel lblNewLabel = new JLabel("Busca tu hotel ideal \r\nentre miles de hoteles");
		lblNewLabel.setBounds(354, 121, 222, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblComparaLosPrecios = new JLabel("Compara los precios de tus hoteles favoritos\r\n");
		lblComparaLosPrecios.setBounds(354, 166, 211, 16);
		contentPane.add(lblComparaLosPrecios);
		
		JLabel lblIniciaSesionPara = new JLabel("Inicia sesion para conseguir descuentos de hasta 30%");
		lblIniciaSesionPara.setBounds(354, 256, 211, 16);
		contentPane.add(lblIniciaSesionPara);
		
		JLabel lblNewLabel_1 = new JLabel("Cientos de opiniones de usuarios verificados\r\n");
		lblNewLabel_1.setBounds(354, 211, 211, 16);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 86, 242, 2);
		contentPane.add(separator);
	}
}
