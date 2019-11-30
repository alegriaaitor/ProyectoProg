import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaBarcelona extends JFrame {

	private JPanel contentPane;
	private JTextField txtCrownePlazaBarcelona;
	private JTextField txtMidmostBarcelona;
	private JTextField txtOfeliosHotel;
	private JTextField txtTrypApoloHotel;

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
		setBounds(100, 100, 619, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 25, 103, 77);
		ImageIcon ico = new ImageIcon(getClass().getResource("Crowne Plaza Barcelona.jpg"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(12, 115, 103, 80);
		ImageIcon ico1 = new ImageIcon(getClass().getResource("Midmost.jpg"));
		ImageIcon img1 = new ImageIcon(ico1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img1);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(12, 208, 103, 86);
		ImageIcon ico2 = new ImageIcon(getClass().getResource("Ofelias Hotel.jpg"));
		ImageIcon img2 = new ImageIcon(ico2.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_2.setIcon(img2);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(12, 306, 103, 86);
		ImageIcon ico3 = new ImageIcon(getClass().getResource("Tryp Barcelona Apolo Hotel.jpg"));
		ImageIcon img3 = new ImageIcon(ico3.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_3.setIcon(img3);
		contentPane.add(lblNewLabel_3);
		
		txtCrownePlazaBarcelona = new JTextField();
		txtCrownePlazaBarcelona.setText("CROWNE PLAZA BARCELONA");
		txtCrownePlazaBarcelona.setEditable(false);
		txtCrownePlazaBarcelona.setBounds(134, 25, 200, 22);
		contentPane.add(txtCrownePlazaBarcelona);
		txtCrownePlazaBarcelona.setColumns(10);
		
		txtMidmostBarcelona = new JTextField();
		txtMidmostBarcelona.setText("MIDMOST BARCELONA");
		txtMidmostBarcelona.setEditable(false);
		txtMidmostBarcelona.setBounds(135, 115, 199, 22);
		contentPane.add(txtMidmostBarcelona);
		txtMidmostBarcelona.setColumns(10);
		
		txtOfeliosHotel = new JTextField();
		txtOfeliosHotel.setText("OFELIAS HOTEL");
		txtOfeliosHotel.setEditable(false);
		txtOfeliosHotel.setBounds(135, 204, 199, 22);
		contentPane.add(txtOfeliosHotel);
		txtOfeliosHotel.setColumns(10);
		
		txtTrypApoloHotel = new JTextField();
		txtTrypApoloHotel.setText("TRYP BARCELONA APOLO HOTEL");
		txtTrypApoloHotel.setEditable(false);
		txtTrypApoloHotel.setBounds(135, 295, 199, 22);
		contentPane.add(txtTrypApoloHotel);
		txtTrypApoloHotel.setColumns(10);
		
		JTextArea txtrElCrownePlaza = new JTextArea();
		txtrElCrownePlaza.setText("El Crowne Plaza Barcelona es un hotel \r\nsituado a 200 metros de la Fuente M\u00E1gica, \r\ny ofrece habitaciones amplias con TV. ");
		txtrElCrownePlaza.setBounds(135, 52, 321, 56);
		contentPane.add(txtrElCrownePlaza);
		
		JTextArea txtrEstSituadoEn = new JTextArea();
		txtrEstSituadoEn.setText("Est\u00E1 situado en el coraz\u00F3n de Barcelona, \r\na poca distancia a pie de las famosas\r\nRamblas. Cuenta con terraza.");
		txtrEstSituadoEn.setBounds(135, 144, 321, 56);
		contentPane.add(txtrEstSituadoEn);
		
		JTextArea txtrElOfeliasHotel = new JTextArea();
		txtrElOfeliasHotel.setText("El Ofelias Hotel se encuentra junto a la\r\n Gran V\u00EDa y a 2 minutos de la estaci\u00F3n \r\nde metro Plaza Espanya y del centro.");
		txtrElOfeliasHotel.setBounds(134, 236, 322, 56);
		contentPane.add(txtrElOfeliasHotel);
		
		JTextArea txtrSeEncuentraAl = new JTextArea();
		txtrSeEncuentraAl.setText("Se encuentra al pie del Montju\u00EFc, a 7 \r\nminutos  a pie de Las Ramblas de\r\nBarcelona. Ofrece recepci\u00F3n 24 horas.");
		txtrSeEncuentraAl.setBounds(135, 323, 321, 69);
		contentPane.add(txtrSeEncuentraAl);
		
		JButton btnVerHotel = new JButton("VER HOTEL");
		btnVerHotel.setBounds(468, 75, 121, 25);
		contentPane.add(btnVerHotel);
		btnVerHotel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VentanaHotel nuevaVentana = new VentanaHotel();
				nuevaVentana.setVisible(true);
				VentanaBarcelona.this.dispose();
				
			}
			
		});
		
		JButton btnVerHotel_1 = new JButton("VER HOTEL");
		btnVerHotel_1.setBounds(468, 170, 121, 25);
		contentPane.add(btnVerHotel_1);
		btnVerHotel_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VentanaHotel nuevaVentana = new VentanaHotel();
				nuevaVentana.setVisible(true);
				VentanaBarcelona.this.dispose();
				
			}
			
		});
		
		JButton btnVerHotel_2 = new JButton("VER HOTEL");
		btnVerHotel_2.setBounds(468, 257, 121, 25);
		contentPane.add(btnVerHotel_2);
		btnVerHotel_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VentanaHotel nuevaVentana = new VentanaHotel();
				nuevaVentana.setVisible(true);
				VentanaBarcelona.this.dispose();
				
			}
			
		});
		
		JButton btnVerHotel_3 = new JButton("VER HOTEL");
		btnVerHotel_3.setBounds(468, 334, 121, 25);
		contentPane.add(btnVerHotel_3);
		btnVerHotel_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VentanaHotel nuevaVentana = new VentanaHotel();
				nuevaVentana.setVisible(true);
				VentanaBarcelona.this.dispose();
				
			}
			
		});
		
		JLabel lblNoDisponible = new JLabel("No disponible");
		lblNoDisponible.setForeground(Color.RED);
		lblNoDisponible.setBounds(346, 28, 110, 16);
		lblNoDisponible.setVisible(false);
		contentPane.add(lblNoDisponible);
		
		JLabel label = new JLabel("No disponible");
		label.setForeground(Color.RED);
		label.setBounds(346, 118, 110, 16);
		label.setVisible(false);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("No disponible");
		label_1.setForeground(Color.RED);
		label_1.setBounds(346, 207, 110, 16);
		label_1.setVisible(false);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("No disponible");
		label_2.setForeground(Color.RED);
		label_2.setBounds(346, 298, 110, 16);
		label_2.setVisible(false);
		contentPane.add(label_2);
	}

}
