import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class GUIP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Purch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIP frame = new GUIP();
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
	public GUIP() {
		setTitle("Purchase Cars");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Invoice b = new Invoice();
				b.Bill();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\ciaz.PNG"));
		btnNewButton.setBounds(10, 10, 318, 229);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Invoice b = new Invoice();
				b.Bill();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\breeza.PNG"));
		btnNewButton_1.setBounds(331, 250, 331, 229);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUI3 x = new GUI3();
				x.NewScreen();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\back.png"));
		btnNewButton_2.setBounds(10, 458, 44, 45);
		contentPane.add(btnNewButton_2);
	}
}
