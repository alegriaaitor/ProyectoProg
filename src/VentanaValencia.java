import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaValencia extends JFrame {

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
					VentanaValencia frame = new VentanaValencia();
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
	public VentanaValencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValencia = new JLabel("VALENCIA");
		lblValencia.setBounds(12, 13, 77, 16);
		contentPane.add(lblValencia);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(120, 41, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(26, 96, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(26, 183, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(26, 268, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(12, 354, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(120, 125, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(120, 224, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(120, 319, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(120, 73, 301, 50);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(120, 160, 301, 55);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(118, 265, 303, 50);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(117, 351, 304, 49);
		contentPane.add(textArea_3);
		
		JButton btnVerHoitel = new JButton("VER HOTEL");
		btnVerHoitel.setBounds(482, 92, 97, 25);
		contentPane.add(btnVerHoitel);
		
		JButton btnVerHotel = new JButton("VER HOTEL");
		btnVerHotel.setBounds(482, 179, 97, 25);
		contentPane.add(btnVerHotel);
		
		JButton btnVerHotel_1 = new JButton("VER HOTEL");
		btnVerHotel_1.setBounds(482, 276, 97, 25);
		contentPane.add(btnVerHotel_1);
		
		JButton btnVerHotel_2 = new JButton("VER HOTEL");
		btnVerHotel_2.setBounds(482, 354, 97, 25);
		contentPane.add(btnVerHotel_2);
	}

}
