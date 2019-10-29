import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class VentanaPreguntasFrecuentes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPreguntasFrecuentes frame = new VentanaPreguntasFrecuentes();
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
	public VentanaPreguntasFrecuentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreguntasFrecuentesSobre = new JLabel("Preguntas\r\n frecuentes \r\nsobre\r\n nuestros\r\n hoteles");
		lblPreguntasFrecuentesSobre.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreguntasFrecuentesSobre.setBounds(49, 11, 307, 56);
		contentPane.add(lblPreguntasFrecuentesSobre);
		
		JLabel lblNewLabel = new JLabel("\u00BFCuantas habitaciones tiene el hotel?");
		lblNewLabel.setBounds(49, 78, 185, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrEnTotalHay = new JTextArea();
		txtrEnTotalHay.setEditable(false);
		txtrEnTotalHay.setText("En total hay unas 300 habitaciones. \r\nSi quieres mas sobre disponibilidad contacta con nosortros.");
		txtrEnTotalHay.setBounds(49, 103, 524, 46);
		contentPane.add(txtrEnTotalHay);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFTiene el hotel restaurante?");
		lblNewLabel_1.setBounds(49, 160, 264, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrTieneUnHotel = new JTextArea();
		txtrTieneUnHotel.setEditable(false);
		txtrTieneUnHotel.setText("Tiene un hotel el restaurante. Este ofrece desayunos y cenas.\r\nAmbas incluidas en el precio.");
		txtrTieneUnHotel.setBounds(49, 185, 524, 46);
		contentPane.add(txtrTieneUnHotel);
		
		JLabel lblcmoPuedoLlegar = new JLabel("\u00BFC\u00F3mo puedo llegar desde el aeropuerto?");
		lblcmoPuedoLlegar.setBounds(49, 243, 331, 14);
		contentPane.add(lblcmoPuedoLlegar);
		
		JTextArea txtrElHotelEst = new JTextArea();
		txtrElHotelEst.setEditable(false);
		txtrElHotelEst.setText("El hotel est\u00E1 a 20 minutos en taxi.\r\nEl hotel ofrece un servivo especial para recoger al huesped \r\ndel aeropuerto");
		txtrElHotelEst.setBounds(49, 260, 524, 56);
		contentPane.add(txtrElHotelEst);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(583, 11, 17, 349);
		contentPane.add(scrollBar);
	}
}
