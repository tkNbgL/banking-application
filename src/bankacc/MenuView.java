package bankacc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuView extends JFrame {

	private JPanel contentPane;
	private JButton btn_Inform;
	private JButton btn_Withdr;
	private JButton btn_Depo;
	private JButton btn_Send;
	private JButton btn_Pay;
	private JButton btn_TransactonHstory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView frame = new MenuView();
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
	public MenuView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1006, 623);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblinform = new JLabel("1-");
		lblinform.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblinform.setHorizontalAlignment(SwingConstants.CENTER);
		lblinform.setBounds(89, 116, 145, 53);
		contentPane.add(lblinform);
		
		JLabel lblWithdrawl = new JLabel("2-");
		lblWithdrawl.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblWithdrawl.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithdrawl.setBounds(89, 197, 145, 53);
		contentPane.add(lblWithdrawl);
		
		JLabel lblDeposit = new JLabel("3-");
		lblDeposit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblDeposit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeposit.setBounds(89, 277, 145, 53);
		contentPane.add(lblDeposit);
		
		JLabel lblSend = new JLabel("4-");
		lblSend.setHorizontalAlignment(SwingConstants.CENTER);
		lblSend.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSend.setBounds(89, 355, 145, 53);
		contentPane.add(lblSend);
		
		JLabel lblBill = new JLabel("5-");
		lblBill.setHorizontalAlignment(SwingConstants.CENTER);
		lblBill.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBill.setBounds(89, 431, 145, 53);
		contentPane.add(lblBill);
		
		JLabel lblMainMen = new JLabel("MAIN MENU");
		lblMainMen.setForeground(new Color(0, 0, 102));
		lblMainMen.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblMainMen.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMen.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblMainMen.setBounds(424, 34, 183, 40);
		contentPane.add(lblMainMen);
		
		btn_Inform = new JButton("ACCOUNT INFORMATIONS");
		btn_Inform.setBackground(new Color(220, 220, 220));
		btn_Inform.setForeground(new Color(0, 0, 0));
		btn_Inform.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		btn_Inform.setBounds(244, 128, 351, 40);
		contentPane.add(btn_Inform);
		
		btn_Withdr = new JButton("WITHDRAWAL");
		btn_Withdr.setBackground(new Color(220, 220, 220));
		btn_Withdr.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		btn_Withdr.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		btn_Withdr.setBounds(244, 209, 351, 40);
		contentPane.add(btn_Withdr);
		
		btn_Depo = new JButton("DEPOSIT");
		btn_Depo.setBackground(new Color(220, 220, 220));
		btn_Depo.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		btn_Depo.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btn_Depo.setMnemonic(KeyEvent.VK_ENTER);
		btn_Depo.setBounds(244, 289, 351, 40);
		contentPane.add(btn_Depo);
		
		btn_Send = new JButton("SEND MONEY");
		btn_Send.setBackground(new Color(220, 220, 220));
		btn_Send.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		btn_Send.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		btn_Send.setBounds(244, 367, 351, 40);
		contentPane.add(btn_Send);
		
		btn_Pay = new JButton("PAY THE BILLS");
		btn_Pay.setBackground(new Color(220, 220, 220));
		btn_Pay.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		btn_Pay.setMnemonic(KeyEvent.VK_ENTER);
		btn_Pay.setBounds(244, 443, 351, 40);
		contentPane.add(btn_Pay);
		
		JLabel label = new JLabel("6-");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label.setBounds(89, 509, 145, 53);
		contentPane.add(label);
		
		btn_TransactonHstory = new JButton("TRANSACTION HISTORY");
		btn_TransactonHstory.setBackground(new Color(220, 220, 220));
		btn_TransactonHstory.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		btn_TransactonHstory.setBounds(244, 521, 351, 40);
		contentPane.add(btn_TransactonHstory);
	}
	
	void depositMenuListener(ActionListener listenerForDepositMenuButton){
		btn_Depo.addActionListener(listenerForDepositMenuButton);
	}
	
	void sendMenuListener(ActionListener listenerForsendMenuButton){
		btn_Send.addActionListener(listenerForsendMenuButton);
	}
	
	void goWithdrawalListener(ActionListener ListenerForWithdrawalButton){
		btn_Withdr.addActionListener(ListenerForWithdrawalButton);
	}

	void goPayBillListener(ActionListener ListenerForgoPayBillButton){
		btn_Pay.addActionListener(ListenerForgoPayBillButton);
	}
	
	void goInformListener(ActionListener ListenerForInformButton){
		btn_Inform.addActionListener(ListenerForInformButton);
	}
	
	void goTransHistoListener(ActionListener ListenerForransactonButton){
		btn_TransactonHstory.addActionListener(ListenerForransactonButton);
	}
	
}
