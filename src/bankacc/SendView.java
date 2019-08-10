package bankacc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SendView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_amount;
	private JTextField txt_ýban;
	private JButton btn_ManMenu;
	private JButton btn_Send;
	private JLabel lbl_amount;

	
	
	public JLabel getLbl_amount() {
		return lbl_amount;
	}

	public void setLbl_amount(JLabel lbl_amount) {
		this.lbl_amount = lbl_amount;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SendView frame = new SendView();
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
	public SendView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 645);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSendMoney = new JLabel("SEND MONEY");
		lblSendMoney.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblSendMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblSendMoney.setBounds(405, 44, 200, 50);
		contentPane.add(lblSendMoney);
		
		JLabel lblbalance = new JLabel("BALANCE:");
		lblbalance.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblbalance.setBackground(new Color(204, 204, 204));
		lblbalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblbalance.setBounds(77, 141, 200, 50);
		contentPane.add(lblbalance);
		
		lbl_amount = new JLabel("ASD");
		lbl_amount.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lbl_amount.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_amount.setBounds(253, 141, 200, 50);
		contentPane.add(lbl_amount);
		
		JLabel lblAmount = new JLabel("AMOUNT:");
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setBounds(269, 327, 200, 50);
		contentPane.add(lblAmount);
		
		txt_amount = new JTextField();
		txt_amount.setHorizontalAlignment(SwingConstants.LEFT);
		txt_amount.setFont(new Font("Times New Roman", Font.BOLD, 24));
		txt_amount.setBounds(440, 333, 141, 39);
		contentPane.add(txt_amount);
		txt_amount.setColumns(10);
		
		btn_Send = new JButton("SEND");
		btn_Send.setBackground(new Color(204, 204, 204));
		btn_Send.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btn_Send.setBounds(366, 441, 200, 50);
		contentPane.add(btn_Send);
		
		JLabel lblIban = new JLabel("IBAN:");
		lblIban.setHorizontalAlignment(SwingConstants.CENTER);
		lblIban.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblIban.setBounds(281, 251, 200, 50);
		contentPane.add(lblIban);
		
		txt_ýban = new JTextField();
		txt_ýban.setBounds(440, 261, 141, 39);
		contentPane.add(txt_ýban);
		txt_ýban.setColumns(10);
		
		btn_ManMenu = new JButton("MAIN MENU");
		btn_ManMenu.setBackground(new Color(204, 204, 204));
		btn_ManMenu.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btn_ManMenu.setBounds(719, 511, 200, 50);
		contentPane.add(btn_ManMenu);
	}
	
	
	public Double getTxt_amount() {
		return Double.parseDouble(txt_amount.getText());
	}

	public int getTxt_ýban() {
		return Integer.parseInt(txt_ýban.getText());
	}

	void gomenuListener(ActionListener listenerForgomenuButton){
		btn_ManMenu.addActionListener(listenerForgomenuButton);
	}
	
	void sendListener(ActionListener listenerForsendButton){
		btn_Send.addActionListener(listenerForsendButton);
	}
}
