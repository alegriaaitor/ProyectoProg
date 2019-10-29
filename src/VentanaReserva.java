import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtllegada;
	private JTextField txtsalida;
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
					VentanaReserva frame = new VentanaReserva();
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
	public VentanaReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTuReserva = new JLabel("TU RESERVA");
		lblTuReserva.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTuReserva.setBounds(10, 11, 137, 14);
		contentPane.add(lblTuReserva);
		
		JLabel lblcuantasHabitacionesDesea = new JLabel("\u00BFCuantas habitaciones desea reservar?");
		lblcuantasHabitacionesDesea.setBounds(10, 92, 197, 14);
		contentPane.add(lblcuantasHabitacionesDesea);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(20, 117, 29, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel = new JLabel("Escoge tu fecha: ");
		lblNewLabel.setBounds(10, 36, 137, 14);
		contentPane.add(lblNewLabel);
		
		txtllegada = new JTextField();
		txtllegada.setHorizontalAlignment(SwingConstants.CENTER);
		txtllegada.setText("(Llegada)");
		txtllegada.setBounds(156, 61, 86, 20);
		contentPane.add(txtllegada);
		txtllegada.setColumns(10);
		
		txtsalida = new JTextField();
		txtsalida.setHorizontalAlignment(SwingConstants.CENTER);
		txtsalida.setText("(Salida)");
		txtsalida.setBounds(273, 61, 86, 20);
		contentPane.add(txtsalida);
		txtsalida.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Adultos");
		lblNewLabel_1.setBounds(239, 92, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ni\u00F1os");
		lblNewLabel_2.setBounds(333, 92, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(239, 117, 29, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(330, 117, 29, 20);
		contentPane.add(spinner_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cancelaci\u00F3n gratis antes del check in");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(10, 182, 232, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Sin pago por adelantado");
		chckbxNewCheckBox_1.setSelected(true);
		chckbxNewCheckBox_1.setBounds(10, 208, 171, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Ventajas que ofrecemos");
		lblNewLabel_3.setBounds(10, 161, 160, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setBounds(20, 243, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Apellidos");
		lblNewLabel_5.setBounds(156, 243, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(20, 268, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 268, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("E-mail");
		lblNewLabel_6.setBounds(20, 299, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(20, 323, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("RESERVAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(404, 299, 115, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblCuentaPaypal = new JLabel("Cuenta Pay-pal");
		lblCuentaPaypal.setBounds(156, 299, 129, 14);
		contentPane.add(lblCuentaPaypal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 323, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPrecioPorHabitacin = new JLabel("Precio por habitaci\u00F3n");
		lblPrecioPorHabitacin.setBounds(404, 92, 133, 14);
		contentPane.add(lblPrecioPorHabitacin);
		
		textField_4 = new JTextField();
		textField_4.setBounds(404, 117, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
