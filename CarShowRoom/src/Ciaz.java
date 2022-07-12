import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;

public class Ciaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarutiSuzukiCiaz;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void view() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ciaz frame = new Ciaz();
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
	public Ciaz() {
		setTitle("View Ciaz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 462, 35, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUIV v = new GUIV();
				v.View();
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\back.png"));
		contentPane.add(btnNewButton);
		
		JTextPane txtpnAraiMileage = new JTextPane();
		txtpnAraiMileage.setBackground(new Color(255, 127, 80));
		txtpnAraiMileage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnAraiMileage.setText("ARAI Mileage\t\t\t20.04 kmpl\r\nEngine Displacement (cc)\t\t1462\r\nMax Power (bhp@rpm)    \t               103.25bhp@6000rpm\r\nMax Torque (nm@rpm)\t\t138Nm@4400rpm\r\nSeating Capacity\t\t\t5\r\nTransmissionType                                  Automatic\r\nBoot Space (Litres)\t\t\t510\r\nFuel Tank Capacity\t\t\t43.0\r\nBody Type\t\t\t\tSedan\r\nService Cost (Avg. of 5 years)\t\tRs.3,689\r\nEx-Showroom Price:  \t\t\u20B98.52 lakhs - \u20B911.5 lakhs");
		txtpnAraiMileage.setBounds(106, 72, 508, 221);
		contentPane.add(txtpnAraiMileage);
		
		txtMarutiSuzukiCiaz = new JTextField();
		txtMarutiSuzukiCiaz.setBackground(Color.BLACK);
		txtMarutiSuzukiCiaz.setForeground(Color.LIGHT_GRAY);
		txtMarutiSuzukiCiaz.setFont(new Font("Bell MT", Font.BOLD, 50));
		txtMarutiSuzukiCiaz.setText("Maruti Suzuki Ciaz");
		txtMarutiSuzukiCiaz.setBounds(118, 10, 432, 52);
		contentPane.add(txtMarutiSuzukiCiaz);
		txtMarutiSuzukiCiaz.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\ciaz1.PNG"));
		lblNewLabel.setBounds(116, 303, 461, 200);
		contentPane.add(lblNewLabel);
	}
}
