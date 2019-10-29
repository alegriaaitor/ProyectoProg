import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;

public class VentanaHotel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaHotel frame = new VentanaHotel();
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
	public VentanaHotel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHotel = new JLabel("Hotel:");
		lblHotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHotel.setBounds(27, 25, 56, 16);
		contentPane.add(lblHotel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(88, 22, 181, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnReservaTuApartamento = new JButton("Reserva tu apartamento");
		btnReservaTuApartamento.setBounds(382, 18, 171, 25);
		contentPane.add(btnReservaTuApartamento);
		
		JLabel lblUbicacion = new JLabel("Ubicaci\u00F3n:");
		lblUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUbicacion.setBounds(27, 75, 79, 16);
		contentPane.add(lblUbicacion);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(118, 73, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblValoracion = new JLabel("Valoraci\u00F3n: ");
		lblValoracion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValoracion.setBounds(401, 74, 95, 16);
		contentPane.add(lblValoracion);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(494, 73, 62, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion: ");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDescripcion.setBounds(27, 131, 116, 16);
		contentPane.add(lblDescripcion);
		
		JLabel lblqueServiosOfrece = new JLabel("\u00BFQue servios ofrece?");
		lblqueServiosOfrece.setBounds(27, 260, 129, 16);
		contentPane.add(lblqueServiosOfrece);
		
		JLabel lblOpinionesFavorables = new JLabel("Opiniones favorables: ");
		lblOpinionesFavorables.setBounds(415, 144, 129, 16);
		contentPane.add(lblOpinionesFavorables);
		
		JLabel lblOpinionesDesfavorables = new JLabel("Opiniones desfavorables:");
		lblOpinionesDesfavorables.setBounds(415, 244, 155, 16);
		contentPane.add(lblOpinionesDesfavorables);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(27, 160, 342, 87);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(27, 289, 342, 61);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(408, 273, 171, 61);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(411, 173, 168, 58);
		contentPane.add(textArea_3);
	}
}
