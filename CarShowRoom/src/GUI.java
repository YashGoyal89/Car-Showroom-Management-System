import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
public class GUI {
	private JFrame frmLogin;
	private JTextField USERNAME;
	private JPasswordField passwordField;
	private JLabel Label;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.getContentPane().setBackground(new Color(240, 230, 140));
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(279, 35, 128, 40);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(279, 79, 128, 40);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		USERNAME = new JTextField();
		USERNAME.setBounds(452, 35, 170, 40);
		frmLogin.getContentPane().add(USERNAME);
		USERNAME.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(452, 82, 170, 40);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnLOGIN = new JButton("LOGIN");
		btnLOGIN.setBackground(new Color(255, 0, 0));
		btnLOGIN.setForeground(new Color(0, 0, 0));
		btnLOGIN.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		//Image img1 = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		//btnLOGIN.setIcon(new ImageIcon(img1));
		btnLOGIN.setBounds(366, 144, 86, 50);
		btnLOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname= USERNAME.getText();
				String psd = passwordField.getText();
				
				if(uname.equals("yash") && psd.equals("goyal"))
				{
					JOptionPane.showMessageDialog(frmLogin,"you are sucessfuly login");
					frmLogin.dispose();
					GUI2 m = new GUI2();
					m.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(frmLogin,"Invalid username or password");
				}
				
			}
		});
		frmLogin.getContentPane().add(btnLOGIN);
		
		Label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Login.png")).getImage();
		Label.setIcon(new ImageIcon(img));
		
		Label.setBounds(10, 10, 128, 134);
		frmLogin.getContentPane().add(Label);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\1.jpeg"));
		lblNewLabel_2.setBounds(-56, -25, 742, 538);
		frmLogin.getContentPane().add(lblNewLabel_2);
	}
}
