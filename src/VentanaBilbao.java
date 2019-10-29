import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaBilbao extends JFrame {

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
					VentanaBilbao frame = new VentanaBilbao();
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
	public VentanaBilbao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(42, 25, 100, 81);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(42, 119, 100, 81);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(42, 320, 100, 81);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(42, 213, 100, 81);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(152, 25, 161, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(152, 121, 161, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(152, 213, 161, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(152, 320, 161, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(154, 54, 281, 52);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(154, 148, 281, 52);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(154, 248, 281, 52);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setBounds(154, 349, 281, 52);
		contentPane.add(textArea_3);
		
		JButton btnNewButton = new JButton("VER HOTEL\r\n");
		btnNewButton.setBounds(486, 72, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("VER HOTEL\r\n");
		button.setBounds(486, 161, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("VER HOTEL\r\n");
		button_1.setBounds(486, 258, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("VER HOTEL\r\n");
		button_2.setBounds(486, 360, 97, 25);
		contentPane.add(button_2);
	}
}
