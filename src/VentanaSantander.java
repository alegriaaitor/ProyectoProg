import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaSantander extends JFrame {

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
					VentanaSantander frame = new VentanaSantander();
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
	public VentanaSantander() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSantander = new JLabel("SANTANDER");
		lblSantander.setBounds(12, 23, 71, 16);
		contentPane.add(lblSantander);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 79, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(12, 155, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(12, 234, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(12, 305, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(136, 46, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(136, 130, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(136, 206, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(136, 282, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(136, 76, 295, 52);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(135, 152, 296, 49);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(132, 231, 299, 52);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(136, 302, 295, 46);
		contentPane.add(textArea_3);
		
		JButton btnVerHotel = new JButton("VER HOTEL");
		btnVerHotel.setBounds(479, 90, 97, 25);
		contentPane.add(btnVerHotel);
		
		JButton btnVerHotel_1 = new JButton("VER HOTEL");
		btnVerHotel_1.setBounds(479, 164, 97, 25);
		contentPane.add(btnVerHotel_1);
		
		JButton btnVerHotel_2 = new JButton("VER HOTEL");
		btnVerHotel_2.setBounds(479, 247, 97, 25);
		contentPane.add(btnVerHotel_2);
		
		JButton btnVerHotel_3 = new JButton("VER HOTEL");
		btnVerHotel_3.setBounds(479, 323, 97, 25);
		contentPane.add(btnVerHotel_3);
	}

}
