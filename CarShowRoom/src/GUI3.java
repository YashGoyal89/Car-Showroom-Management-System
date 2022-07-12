import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI3 frame = new GUI3();
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
	public GUI3() {
		setTitle("Purchase ? View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\Capture.PNG"));
		lblNewLabel.setBounds(404, 106, 254, 208);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\Capture1.PNG"));
		lblNewLabel_1.setBounds(52, 106, 264, 222);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUIV v = new GUIV();
				v.View();
			}
		});
		btnNewButton.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		btnNewButton.setBounds(456, 394, 155, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Purchase");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUIP p = new GUIP();
				p.Purch();
			}
		});
		btnNewButton_1.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		btnNewButton_1.setBounds(83, 394, 155, 57);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\Question-mark-icon.png"));
		lblNewLabel_3.setBounds(334, 373, 69, 78);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\partition.PNG"));
		lblNewLabel_2.setBounds(0, 0, 686, 513);
		contentPane.add(lblNewLabel_2);
	}
}
