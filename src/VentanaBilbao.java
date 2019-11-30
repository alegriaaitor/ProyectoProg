import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaBilbao extends JFrame {

	private JPanel contentPane;
	private JTextField txtIlunionBilbao;
	private JTextField txtHotelErcilla;
	private JTextField txtHesperiaBilbao;
	private JTextField txtHotelGranBilbao;

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
		setBounds(100, 100, 663, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(25, 25, 100, 81);
		
		ImageIcon ico = new ImageIcon(getClass().getResource("Ilunion.jpg"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(35, 119, 100, 81);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(25, 320, 100, 81);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(25, 213, 100, 81);
		contentPane.add(label_2);
		
		txtIlunionBilbao = new JTextField();
		txtIlunionBilbao.setText("ILUNION BILBAO");
		txtIlunionBilbao.setEditable(false);
		txtIlunionBilbao.setBounds(152, 25, 161, 22);
		contentPane.add(txtIlunionBilbao);
		txtIlunionBilbao.setColumns(10);
		
		txtHotelErcilla = new JTextField();
		txtHotelErcilla.setText("HOTEL ERCILLA");
		txtHotelErcilla.setEditable(false);
		txtHotelErcilla.setBounds(152, 121, 161, 22);
		contentPane.add(txtHotelErcilla);
		txtHotelErcilla.setColumns(10);
		
		txtHesperiaBilbao = new JTextField();
		txtHesperiaBilbao.setText("HESPERIA BILBAO");
		txtHesperiaBilbao.setEditable(false);
		txtHesperiaBilbao.setBounds(152, 213, 161, 22);
		contentPane.add(txtHesperiaBilbao);
		txtHesperiaBilbao.setColumns(10);
		
		txtHotelGranBilbao = new JTextField();
		txtHotelGranBilbao.setText("HOTEL GRAN BILBAO");
		txtHotelGranBilbao.setEditable(false);
		txtHotelGranBilbao.setBounds(152, 320, 161, 22);
		contentPane.add(txtHotelGranBilbao);
		txtHotelGranBilbao.setColumns(10);
		
		JTextArea txtrHotelSituadoEn = new JTextArea();
		txtrHotelSituadoEn.setText("Hotel situado en plena zona comercial \r\nde Bilbao, a menos de 100 metros de \r\nestaciones de buses y metro. ");
		txtrHotelSituadoEn.setEditable(false);
		txtrHotelSituadoEn.setBounds(154, 54, 337, 54);
		contentPane.add(txtrHotelSituadoEn);
		
		JTextArea txtrLaUbicacinDe = new JTextArea();
		txtrLaUbicacinDe.setText("La ubicaci\u00F3n de este hotel\r\nes inmejorable, a menos de 5\r\nminutos del metro y en pleno centro");
		txtrLaUbicacinDe.setEditable(false);
		txtrLaUbicacinDe.setBounds(154, 148, 337, 58);
		contentPane.add(txtrLaUbicacinDe);
		
		JTextArea txtrElHesperiaBilbao = new JTextArea();
		txtrElHesperiaBilbao.setText("El Hesperia Bilbao est\u00E1 situado enfrente \r\ndel Museo Guggenheim de Bilbao, justo al \r\notro lado del r\u00EDo Nervi\u00F3n, y presenta una fachada de \r\ncristal de colores muy llamativa.");
		txtrElHesperiaBilbao.setEditable(false);
		txtrElHesperiaBilbao.setBounds(154, 242, 337, 75);
		contentPane.add(txtrElHesperiaBilbao);
		
		JTextArea txtrEsteEleganteHotel = new JTextArea();
		txtrEsteEleganteHotel.setText("Este elegante hotel de dise\u00F1o ofrece WiFi \r\ngratuita y habitaciones amplias con TV v\u00EDa \r\nsat\u00E9lite de pantalla plana.\r\n");
		txtrEsteEleganteHotel.setEditable(false);
		txtrEsteEleganteHotel.setBounds(154, 349, 337, 65);
		contentPane.add(txtrEsteEleganteHotel);
		
		JButton btnNewButton = new JButton("VER HOTEL\r\n");
		btnNewButton.setBounds(503, 81, 130, 25);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VentanaHotel nuevaVentana = new VentanaHotel();
				nuevaVentana.setVisible(true);
				VentanaBilbao.this.dispose();
				
			}
			
		});
		
		JButton button = new JButton("VER HOTEL\r\n");
		button.setBounds(503, 175, 130, 25);
		contentPane.add(button);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VentanaHotel nuevaVentana = new VentanaHotel();
				nuevaVentana.setVisible(true);
				VentanaBilbao.this.dispose();
				
			}
			
		});
		
		JButton button_1 = new JButton("VER HOTEL\r\n");
		button_1.setBounds(503, 292, 130, 25);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VentanaHotel nuevaVentana = new VentanaHotel();
				nuevaVentana.setVisible(true);
				VentanaBilbao.this.dispose();
				
			}
			
		});
		
		JButton button_2 = new JButton("VER HOTEL\r\n");
		button_2.setBounds(503, 376, 130, 25);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VentanaHotel nuevaVentana = new VentanaHotel();
				nuevaVentana.setVisible(true);
				VentanaBilbao.this.dispose();
				
			}
			
		});
		
		JLabel lblNewLabel_1 = new JLabel("No disponible");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(334, 25, 100, 16);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		JLabel label_3 = new JLabel("No disponible");
		label_3.setForeground(Color.RED);
		label_3.setBounds(334, 124, 100, 16);
		contentPane.add(label_3);
		label_3.setVisible(false);
		
		JLabel label_4 = new JLabel("No disponible");
		label_4.setForeground(Color.RED);
		label_4.setBounds(334, 213, 100, 16);
		contentPane.add(label_4);
		label_4.setVisible(false);
		
		JLabel label_5 = new JLabel("No disponible");
		label_5.setForeground(Color.RED);
		label_5.setBounds(334, 320, 100, 16);
		contentPane.add(label_5);
		label_5.setVisible(false);
	}
}
