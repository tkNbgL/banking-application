package bankacc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JFormattedTextField;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class DepositView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_paragir;
	private JButton btn_Depost;
	private JButton btn_ManMenu;
	private JLabel lblamount;
	
	
	
	
	public JLabel getLblamount() {
		return lblamount;
	}
	public void setLblamount(JLabel lblamount) {
		this.lblamount = lblamount;
	}
	public void setTxt_paragir(JTextField txt_paragir) {
		this.txt_paragir = txt_paragir;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepositView frame = new DepositView();
					
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
	public DepositView() {
		
		
    
      
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1014, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepost = new JLabel("DEPOSIT");
		lblDepost.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblDepost.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepost.setBounds(383, 67, 200, 50);
		contentPane.add(lblDepost);
		
		JLabel lblBalance = new JLabel("BALANCE:");
		lblBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblBalance.setBounds(65, 181, 200, 50);
		contentPane.add(lblBalance);
		
		
		lblamount = new JLabel("asd");
		lblamount.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblamount.setHorizontalAlignment(SwingConstants.LEFT);
		lblamount.setBounds(275, 181, 200, 50);
		contentPane.add(lblamount);

		
		
		JLabel lbldpamount = new JLabel("AMOUNT:");
		lbldpamount.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lbldpamount.setHorizontalAlignment(SwingConstants.CENTER);
		lbldpamount.setBounds(241, 344, 200, 50);
		contentPane.add(lbldpamount);
		
		txt_paragir = new JTextField();
		txt_paragir.setFont(new Font("Times New Roman", Font.BOLD, 24));
		txt_paragir.setBounds(445, 350, 138, 39);
		contentPane.add(txt_paragir);
		txt_paragir.setColumns(10);
		
		btn_Depost = new JButton("DEPOSIT");
		btn_Depost.setBackground(new Color(204, 204, 204));
		btn_Depost.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btn_Depost.setBounds(354, 466, 200, 50);
		contentPane.add(btn_Depost);
		
		btn_ManMenu = new JButton("MAIN MENU");
		btn_ManMenu.setBackground(new Color(204, 204, 255));
		btn_ManMenu.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btn_ManMenu.setBounds(678, 586, 200, 50);
		contentPane.add(btn_ManMenu);
	}

	


	public Double getTxt_paragir() {
		return Double.parseDouble(txt_paragir.getText());
	}
	
	void depostListener(ActionListener listenerForDepostButton){
		btn_Depost.addActionListener(listenerForDepostButton);
	}
	
	void gomenuListener(ActionListener listenerForgomenuButton){
		btn_ManMenu.addActionListener(listenerForgomenuButton);
	}
}
