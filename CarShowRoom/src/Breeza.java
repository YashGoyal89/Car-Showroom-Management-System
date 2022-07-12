import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Breeza extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarutiSuzukiVitara;

	/**
	 * Launch the application.
	 */
	public static void view() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Breeza frame = new Breeza();
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
	public Breeza() {
		setTitle("View Breeza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 462, 45, 41);
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
		
		txtMarutiSuzukiVitara = new JTextField();
		txtMarutiSuzukiVitara.setText("Maruti Suzuki Vitara Brezza");
		txtMarutiSuzukiVitara.setForeground(Color.LIGHT_GRAY);
		txtMarutiSuzukiVitara.setFont(new Font("Bell MT", Font.BOLD, 50));
		txtMarutiSuzukiVitara.setColumns(10);
		txtMarutiSuzukiVitara.setBackground(Color.BLACK);
		txtMarutiSuzukiVitara.setBounds(10, 10, 649, 52);
		contentPane.add(txtMarutiSuzukiVitara);
		
		JTextPane txtpnAraiMileage_1 = new JTextPane();
		txtpnAraiMileage_1.setText("ARAI Mileage\t\t\t18.76 kmpl\r\nEngine Displacement (cc)\t\t1462\r\nMax Power (bhp@rpm)    \t               103.25bhp@6000rpm\r\nMax Torque (nm@rpm)\t\t138Nm@4400rpm\r\nSeating Capacity\t\t\t5\r\nTransmissionType                                  Automatic\r\nBoot Space (Litres)\t\t\t328\r\nFuel Tank Capacity\t\t\t43.0\r\nBody Type\t\t\t\tSUV\r\nService Cost (Avg. of 5 years)\t\tRs.6,619\r\nEx-Showroom Price:  \t\t\u20B97.51 lakhs - \u20B911.41 lakhs");
		txtpnAraiMileage_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnAraiMileage_1.setBackground(Color.ORANGE);
		txtpnAraiMileage_1.setBounds(86, 84, 542, 221);
		contentPane.add(txtpnAraiMileage_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\breeza1.PNG"));
		lblNewLabel.setBounds(96, 315, 457, 191);
		contentPane.add(lblNewLabel);
	}

}
