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
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JPasswordField;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(36, 108, 295, 41);
		contentPane.add(comboBox);
		
		comboBox.addItem("Seleccione la ciudad ");
		comboBox.addItem("BILBAO");
		comboBox.addItem("MADRID");
		comboBox.addItem("BARCELONA");
		comboBox.addItem("SEVILLA");
		comboBox.addItem("SANTANDER");
		comboBox.addItem("VALENCIA");
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboBox.getSelectedItem().equals("BILBAO")) {
					VentanaBilbao nuevaVentana = new VentanaBilbao();
					nuevaVentana.setVisible(true);
					VentanaPrincipal.this.dispose();
				}
			}
		});
		btnBuscar.setBounds(119, 287, 126, 31);
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
		
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaLogin nuevaVentana = new VentanaLogin();
				nuevaVentana.setVisible(true);
				VentanaPrincipal.this.dispose();
			}
		});
		btnIniciarSesion.setBounds(309, 23, 116, 25);
		contentPane.add(btnIniciarSesion);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaRegistro nuevaVentana = new VentanaRegistro();
				nuevaVentana.setVisible(true);
				VentanaPrincipal.this.dispose();
			}
		});
		btnRegistrarse.setBounds(449, 23, 116, 25);
		contentPane.add(btnRegistrarse);
		
		JLabel lblNewLabel = new JLabel("\u2714Busca tu hotel ideal \r\nentre miles ");
		lblNewLabel.setBounds(354, 117, 238, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblComparaLosPrecios = new JLabel("\u2714Compara los precios de tus \r\n");
		lblComparaLosPrecios.setBounds(354, 167, 211, 16);
		contentPane.add(lblComparaLosPrecios);
		
		JLabel lblNewLabel_1 = new JLabel("\u2714Cientos de opiniones de usuarios \r\n");
		lblNewLabel_1.setBounds(354, 217, 211, 16);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 86, 242, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Hu\u00E9spedes");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(36, 232, 78, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblHabitaciones = new JLabel("Habitaciones");
		lblHabitaciones.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHabitaciones.setBounds(168, 232, 93, 25);
		contentPane.add(lblHabitaciones);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(119, 228, 41, 39);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(260, 226, 41, 39);
		contentPane.add(spinner_1);
		
	
		
		JLabel lblNewLabel_3 = new JLabel("de hoteles");
		lblNewLabel_3.setBounds(354, 137, 72, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblHotelesFavoritos = new JLabel("hoteles favoritos");
		lblHotelesFavoritos.setBounds(354, 187, 102, 16);
		contentPane.add(lblHotelesFavoritos);
		
		JLabel lblNewLabel_4 = new JLabel("verificados");
		lblNewLabel_4.setBounds(354, 237, 102, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblDeHasta = new JLabel("30% de descuento en tus reservas\r\n");
		lblDeHasta.setBounds(354, 294, 238, 16);
		contentPane.add(lblDeHasta);
		
		JLabel lblIniciaSesionPara = new JLabel("\u2714Inicia sesion para conseguir hasta un");
		lblIniciaSesionPara.setBounds(354, 266, 238, 16);
		contentPane.add(lblIniciaSesionPara);
	}
}
