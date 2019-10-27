import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaHotel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		setBounds(100, 100, 494, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHotel = new JLabel("Hotel:");
		lblHotel.setBounds(27, 25, 56, 16);
		contentPane.add(lblHotel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(65, 19, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnReservaTuApartamento = new JButton("Reserva tu apartamento");
		btnReservaTuApartamento.setBounds(204, 18, 171, 25);
		contentPane.add(btnReservaTuApartamento);
		
		JLabel lblUbicacion = new JLabel("Ubicaci\u00F3n:");
		lblUbicacion.setBounds(27, 75, 62, 16);
		contentPane.add(lblUbicacion);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(89, 69, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblValoracion = new JLabel("Valoraci\u00F3n: ");
		lblValoracion.setBounds(255, 87, 69, 16);
		contentPane.add(lblValoracion);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(321, 84, 62, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion: ");
		lblDescripcion.setBounds(27, 131, 74, 16);
		contentPane.add(lblDescripcion);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(27, 148, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblqueServiosOfrece = new JLabel("\u00BFQue servios ofrece?");
		lblqueServiosOfrece.setBounds(27, 200, 129, 16);
		contentPane.add(lblqueServiosOfrece);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(27, 229, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
