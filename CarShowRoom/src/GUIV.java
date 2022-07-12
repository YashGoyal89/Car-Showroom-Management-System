import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIV extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void View() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIV frame = new GUIV();
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
	public GUIV() {
		setTitle("View Cars");
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
				Ciaz c = new Ciaz();
				c.view();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\ciaz.PNG"));
		btnNewButton.setBounds(10, 10, 318, 229);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Breeza b = new Breeza();
				b.view();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\breeza.PNG"));
		btnNewButton_1.setBounds(345, 250, 331, 229);
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
		btnNewButton_2.setBounds(21, 458, 44, 45);
		contentPane.add(btnNewButton_2);
	}

}
