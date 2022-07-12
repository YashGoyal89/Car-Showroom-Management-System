import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
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
	public GUI2() {
		setTitle("All-In-One Car Showroom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\marutisuzuki-28-1503895859-1569911254.png"));
		lblNewLabel.setBounds(31, 96, 593, 368);
		contentPane.add(lblNewLabel);
		
		txtWelcome = new JTextField();
		txtWelcome.setForeground(Color.WHITE);
		txtWelcome.setBackground(Color.RED);
		txtWelcome.setFont(new Font("Cooper Black", Font.BOLD, 54));
		txtWelcome.setText(" WELCOME");
		txtWelcome.setBounds(167, 10, 342, 76);
		contentPane.add(txtWelcome);
		txtWelcome.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//to move on new screen by clicking arrow button
				GUI3 n = new GUI3();
				n.NewScreen();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\Button-Next-icon.png"));
		btnNewButton.setBounds(624, 463, 52, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(80, 436, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
