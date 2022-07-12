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
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Invoice extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtID;
	private JTextField txtAddress;
	private JTextField txtGST;
	private JTextField txtSGST;
	private JTextField txtCGST;
	private JTextField txtCost;
	private JTextField txtModel;
	
	

	/**
	 * Launch the application.
	 */
	public static void Bill() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoice frame = new Invoice();
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
	public Invoice() {
		setTitle("INVOICE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(21, 451, 45, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUIP b = new GUIP(); 
				b.Purch();
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\nitik\\Downloads\\back.png"));
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(78, 10, 581, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(173, 10, 253, 54);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxName = new JCheckBox("Name");
		chckbxName.setBackground(SystemColor.inactiveCaption);
		chckbxName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxName.setBounds(21, 107, 61, 30);
		contentPane.add(chckbxName);
		
		JCheckBox chckbxID = new JCheckBox("ID");
		chckbxID.setBackground(SystemColor.inactiveCaption);
		chckbxID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxID.setBounds(21, 145, 53, 21);
		contentPane.add(chckbxID);
		
		JCheckBox chckbxAddress = new JCheckBox("Address");
		chckbxAddress.setBackground(SystemColor.inactiveCaption);
		chckbxAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxAddress.setBounds(21, 182, 93, 21);
		contentPane.add(chckbxAddress);
		
		JCheckBox chckbxModel = new JCheckBox("Model");
		chckbxModel.setBackground(SystemColor.inactiveCaption);
		chckbxModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxModel.setBounds(21, 220, 93, 21);
		contentPane.add(chckbxModel);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtName.setBounds(121, 113, 125, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtID.setBounds(121, 146, 125, 19);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAddress.setBounds(120, 183, 126, 19);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtModel = new JTextField();
		txtModel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtModel.setColumns(10);
		txtModel.setBounds(120, 221, 126, 19);
		contentPane.add(txtModel);
		
		JLabel lblGST = new JLabel("GST");
		lblGST.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGST.setBounds(49, 260, 33, 21);
		contentPane.add(lblGST);
		
		JLabel lblSGST = new JLabel("SGST");
		lblSGST.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSGST.setBounds(49, 300, 45, 13);
		contentPane.add(lblSGST);
		
		JLabel lblCGST = new JLabel("CGST");
		lblCGST.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCGST.setBounds(49, 334, 45, 13);
		contentPane.add(lblCGST);
		
		txtGST = new JTextField();
		txtGST.setText("24%");
		txtGST.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtGST.setBounds(121, 258, 45, 26);
		contentPane.add(txtGST);
		txtGST.setColumns(10);
		
		txtSGST = new JTextField();
		txtSGST.setText("12%");
		txtSGST.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSGST.setBounds(121, 294, 45, 26);
		contentPane.add(txtSGST);
		txtSGST.setColumns(10);
		
		txtCGST = new JTextField();
		txtCGST.setText("12%");
		txtCGST.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCGST.setBounds(121, 334, 45, 22);
		contentPane.add(txtCGST);
		txtCGST.setColumns(10);
		
		JTextPane textPaneR = new JTextPane();
		textPaneR.setBackground(new Color(192, 192, 192));
		textPaneR.setBounds(435, 107, 209, 152);
		contentPane.add(textPaneR);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtID.setText(null);
				txtAddress.setText(null);
				txtModel.setText(null);
				
				txtCost.setText(null);
				txtGST.setText(null);
				txtSGST.setText(null);
				txtCGST.setText(null);
				textPaneR.setText(null);
				
				
				chckbxName.setSelected(false);
				chckbxID.setSelected(false);
				chckbxAddress.setSelected(false);
				chckbxModel.setSelected(false);	
				
			}
		});
		btnReset.setToolTipText("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBounds(159, 436, 93, 41);
		contentPane.add(btnReset);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textPaneR.setText("|~|~| TAX-INVOICE |~|~|"+'\n'+'\n'+
								  "Customer Name:"+txtName.getText() +'\n'+
						          "Customer ID:"+txtID.getText() +'\n'+
						          "Customer Address:"+txtAddress.getText() +'\n'+
						          "Car Model:"+txtModel.getText() +'\n'+
						          "On-Road Price:"+txtCost.getText()
						          );
				textPaneR.getText();
				
				JTextPane txtpnThankYou = new JTextPane();
				txtpnThankYou.setText("//\\\\ ALL-IN-ONE CAR SHOWROOM //\\\\\r\n|~|~|THANK YOU FOR VISITING|~|~| \r\n\r\nIt's absolutely one of the best cars on our lot.\r\n\n|~|~|  GOOD DAY AHEAD  |~|~|");
				txtpnThankYou.setBounds(435, 269, 209, 128);
				contentPane.add(txtpnThankYou);
				
			}
		});
		btnReceipt.setToolTipText("Receipt");
		btnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReceipt.setBounds(304, 435, 98, 42);
		contentPane.add(btnReceipt);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		btnExit.setToolTipText("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(435, 435, 93, 42);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_1_1 = new JLabel("On-Road Price");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(21, 368, 104, 21);
		contentPane.add(lblNewLabel_1_1);
		
		txtCost = new JTextField();
		txtCost.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCost.setColumns(10);
		txtCost.setBounds(121, 366, 96, 19);
		contentPane.add(txtCost);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(319, 199, 45, 82);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 235));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(304, 168, 76, 152);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBounds(283, 145, 119, 202);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(30, 144, 255));
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBounds(265, 107, 154, 290);
		contentPane.add(panel_4);
		
	}
}

























