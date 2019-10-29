import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class VentanaOpiniones extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOpiniones frame = new VentanaOpiniones();
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
	public VentanaOpiniones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDinosTuOpinin = new JLabel("Dinos tu opini\u00F3n: ");
		lblDinosTuOpinin.setBounds(31, 32, 107, 16);
		contentPane.add(lblDinosTuOpinin);
		
		textField = new JTextField();
		textField.setBounds(31, 53, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblYValoranos = new JLabel("y valoranos...");
		lblYValoranos.setBounds(31, 102, 107, 16);
		contentPane.add(lblYValoranos);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(41, 131, 30, 22);
		contentPane.add(spinner);
		
		JLabel lblTuOpinionAyuda = new JLabel("Tu opinion ayuda a otros usuarios ");
		lblTuOpinionAyuda.setBounds(186, 118, 234, 22);
		contentPane.add(lblTuOpinionAyuda);
		
		JLabel lblAElegirHotel = new JLabel("a elegir hotel.");
		lblAElegirHotel.setBounds(186, 134, 99, 16);
		contentPane.add(lblAElegirHotel);
		
		JLabel lblLaValoracinPuede = new JLabel("La valoraci\u00F3n puede resultar");
		lblLaValoracinPuede.setBounds(186, 166, 177, 16);
		contentPane.add(lblLaValoracinPuede);
		
		JLabel lblDeMuchaAyuda = new JLabel("de mucha ayuda a la hora de ");
		lblDeMuchaAyuda.setBounds(186, 181, 222, 16);
		contentPane.add(lblDeMuchaAyuda);
		
		JLabel lblElegirUnHotel = new JLabel("elegir un hotel.");
		lblElegirUnHotel.setBounds(186, 196, 99, 16);
		contentPane.add(lblElegirUnHotel);
		
		JLabel lblSincerateACerca = new JLabel("Sincerate a cerca del servicio,");
		lblSincerateACerca.setBounds(189, 32, 219, 16);
		contentPane.add(lblSincerateACerca);
		
		JLabel lblNewLabel = new JLabel("el trato y las condiciones");
		lblNewLabel.setBounds(186, 53, 199, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(186, 85, 56, -10);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDelHotel = new JLabel("del hotel.");
		lblDelHotel.setBounds(186, 74, 56, 16);
		contentPane.add(lblDelHotel);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(31, 192, 97, 25);
		contentPane.add(btnEnviar);
	}
}
