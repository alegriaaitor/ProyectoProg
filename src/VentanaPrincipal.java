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
		setBounds(100, 100, 541, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIntroduzcaSuDestino = new JTextField();
		txtIntroduzcaSuDestino.setText("Introduzca su destino");
		txtIntroduzcaSuDestino.setBounds(35, 68, 127, 22);
		contentPane.add(txtIntroduzcaSuDestino);
		txtIntroduzcaSuDestino.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(193, 102, 97, 25);
		contentPane.add(btnBuscar);
		
		txtCheckIn = new JTextField();
		txtCheckIn.setText("Check in");
		txtCheckIn.setBounds(163, 68, 97, 22);
		contentPane.add(txtCheckIn);
		txtCheckIn.setColumns(10);
		
		txtCheckOut = new JTextField();
		txtCheckOut.setText("Check out");
		txtCheckOut.setBounds(262, 68, 97, 22);
		contentPane.add(txtCheckOut);
		txtCheckOut.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(362, 68, 97, 22);
		contentPane.add(comboBox);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciarSesion.setBounds(272, 23, 116, 25);
		contentPane.add(btnIniciarSesion);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(395, 23, 116, 25);
		contentPane.add(btnRegistrarse);
	}
}
