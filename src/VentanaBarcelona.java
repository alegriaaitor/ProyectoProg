import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaBarcelona extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBarcelona frame = new VentanaBarcelona();
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
	public VentanaBarcelona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBarcelona = new JLabel("BARCELONA");
		lblBarcelona.setBounds(26, 13, 103, 16);
		contentPane.add(lblBarcelona);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 79, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(12, 158, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(12, 239, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(12, 326, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(135, 43, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(135, 126, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(135, 216, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(135, 295, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(135, 65, 286, 50);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(135, 155, 286, 56);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(135, 239, 286, 56);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(135, 323, 286, 49);
		contentPane.add(textArea_3);
		
		JButton btnVerHotel = new JButton("VER HOTEL");
		btnVerHotel.setBounds(468, 75, 97, 25);
		contentPane.add(btnVerHotel);
		
		JButton btnVerHotel_1 = new JButton("VER HOTEL");
		btnVerHotel_1.setBounds(468, 170, 97, 25);
		contentPane.add(btnVerHotel_1);
		
		JButton btnVerHotel_2 = new JButton("VER HOTEL");
		btnVerHotel_2.setBounds(468, 257, 97, 25);
		contentPane.add(btnVerHotel_2);
		
		JButton btnVerHotel_3 = new JButton("VER HOTEL");
		btnVerHotel_3.setBounds(468, 334, 97, 25);
		contentPane.add(btnVerHotel_3);
	}

}
