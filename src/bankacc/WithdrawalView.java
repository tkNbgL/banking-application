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
import javax.swing.JButton;
import javax.swing.JTextField;

public class WithdrawalView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_moremoney;
	private JButton btn_ManMenu;
	private JButton btn_Confrm;
	private JButton btn_thousand;
	private JButton btn_fivehundred;
	private JButton btn_twohundred;
	private JButton btn_hundred;
	private JButton btn_fifty;
	private JButton btn_twenty;
	private JLabel lblBalan;
	
	
	public JLabel getLblBalan() {
		return lblBalan;
	}

	public void setLblBalan(JLabel lblBalan) {
		this.lblBalan = lblBalan;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawalView frame = new WithdrawalView();
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
	public WithdrawalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1060, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBalance = new JLabel("BALANCE:");
		lblBalance.setBackground(new Color(0, 0, 0));
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalance.setBounds(366, 119, 161, 76);
		contentPane.add(lblBalance);
		
		lblBalan = new JLabel("asdasd");
		lblBalan.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBalan.setForeground(new Color(0, 0, 0));
		lblBalan.setBackground(new Color(230, 230, 250));
		lblBalan.setHorizontalAlignment(SwingConstants.LEFT);
		lblBalan.setBounds(537, 129, 235, 57);
		contentPane.add(lblBalan);
		
		btn_twenty = new JButton("20$");
		btn_twenty.setBackground(new Color(204, 204, 204));
		btn_twenty.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_twenty.setBounds(102, 243, 205, 57);
		contentPane.add(btn_twenty);
		
		btn_fifty = new JButton("50$");
		btn_fifty.setBackground(new Color(204, 204, 204));
		btn_fifty.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_fifty.setBounds(102, 351, 205, 57);
		contentPane.add(btn_fifty);
		
		btn_hundred = new JButton("100$");
		btn_hundred.setBackground(new Color(204, 204, 204));
		btn_hundred.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_hundred.setBounds(102, 462, 205, 57);
		contentPane.add(btn_hundred);
		
		btn_twohundred = new JButton("200$");
		btn_twohundred.setBackground(new Color(204, 204, 204));
		btn_twohundred.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_twohundred.setBounds(681, 243, 205, 57);
		contentPane.add(btn_twohundred);
		
		btn_fivehundred = new JButton("500$");
		btn_fivehundred.setBackground(new Color(204, 204, 204));
		btn_fivehundred.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_fivehundred.setBounds(681, 351, 205, 57);
		contentPane.add(btn_fivehundred);
		
		btn_thousand = new JButton("1000$");
		btn_thousand.setBackground(new Color(204, 204, 204));
		btn_thousand.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_thousand.setBounds(681, 462, 205, 57);
		contentPane.add(btn_thousand);
		
		JLabel lblOther = new JLabel("OTHER:");
		lblOther.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblOther.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther.setBounds(279, 584, 121, 37);
		contentPane.add(lblOther);
		
		txt_moremoney = new JTextField();
		txt_moremoney.setBounds(410, 590, 95, 28);
		contentPane.add(txt_moremoney);
		txt_moremoney.setColumns(10);
		
		btn_Confrm = new JButton("CONFIRM");
		btn_Confrm.setBackground(new Color(204, 204, 204));
		btn_Confrm.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_Confrm.setBounds(575, 581, 161, 44);
		contentPane.add(btn_Confrm);
		
		btn_ManMenu = new JButton("MAIN MENU");
		btn_ManMenu.setBackground(new Color(204, 204, 204));
		btn_ManMenu.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_ManMenu.setBounds(854, 593, 161, 69);
		contentPane.add(btn_ManMenu);
	}
	
	
	public double getTxt_moremoney() {
		return Double.parseDouble(txt_moremoney.getText());
	}

	void gomenuListener(ActionListener listenerForgomenuButton){
		btn_ManMenu.addActionListener(listenerForgomenuButton);
	}
	
	void get20Listener(ActionListener ListenerFor20dollarButton){
		btn_twenty.addActionListener(ListenerFor20dollarButton);
	}
	
	void get50Listener(ActionListener ListenerFor50dollarButton){
		btn_fifty.addActionListener(ListenerFor50dollarButton);
	}
	
	void get100Listener(ActionListener ListenerFor100dollarButton){
		btn_hundred.addActionListener(ListenerFor100dollarButton);
	}
	
	void get200Listener(ActionListener ListenerFor200dollarButton){
		btn_twohundred.addActionListener(ListenerFor200dollarButton);
	}
	
	void get500Listener(ActionListener ListenerFor500dollarButton){
		btn_fivehundred.addActionListener(ListenerFor500dollarButton);
	}
	
	void get1000Listener(ActionListener ListenerFor1000dollarButton){
		btn_thousand.addActionListener(ListenerFor1000dollarButton);
	}
	
	void confirmbutton(ActionListener ListenerForConfirmButton){
		btn_Confrm.addActionListener(ListenerForConfirmButton);
	}
}
