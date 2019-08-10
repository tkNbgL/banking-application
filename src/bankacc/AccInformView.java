package bankacc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTable;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class AccInformView extends JFrame {

	private JPanel contentPane;
	
	private JButton btnManMenu;
	private JLabel lblPersonname;
	private JLabel lblPersonSurnam;
	private JLabel lblPersonID;
	private JLabel lblPersonAge;
	private JLabel lblPersonPhone;
	private JLabel lblPersonBalance;
	private JLabel lblPersonIBAN;
	
	

	public JLabel getLblPersonname() {
		return lblPersonname;
	}

	public void setLblPersonname(JLabel lblPersonname) {
		this.lblPersonname = lblPersonname;
	}

	public JLabel getLblPersonSurnam() {
		return lblPersonSurnam;
	}

	public void setLblPersonSurnam(JLabel lblPersonSurnam) {
		this.lblPersonSurnam = lblPersonSurnam;
	}

	public JLabel getLblPersonID() {
		return lblPersonID;
	}

	public void setLblPersonID(JLabel lblPersonID) {
		this.lblPersonID = lblPersonID;
	}

	public JLabel getLblPersonAge() {
		return lblPersonAge;
	}

	public void setLblPersonAge(JLabel lblPersonAge) {
		this.lblPersonAge = lblPersonAge;
	}

	public JLabel getLblPersonPhone() {
		return lblPersonPhone;
	}

	public void setLblPersonPhone(JLabel lblPersonPhone) {
		this.lblPersonPhone = lblPersonPhone;
	}

	public JLabel getLblPersonBalance() {
		return lblPersonBalance;
	}

	public void setLblPersonBalance(JLabel lblPersonBalance) {
		this.lblPersonBalance = lblPersonBalance;
	}

	public JLabel getLblPersonIBAN() {
		return lblPersonIBAN;
	}

	public void setLblPersonIBAN(JLabel lblPersonIBAN) {
		this.lblPersonIBAN = lblPersonIBAN;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccInformView frame = new AccInformView();
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
	public AccInformView() {
		setBackground(new Color(250, 235, 215));
		setForeground(new Color(250, 240, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 621);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblinform = new JLabel("ACCOUNT INFORMATION");
		lblinform.setForeground(new Color(25, 25, 112));
		lblinform.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblinform.setHorizontalAlignment(SwingConstants.CENTER);
		lblinform.setBounds(278, 39, 404, 49);
		contentPane.add(lblinform);
		
		btnManMenu = new JButton("MAIN MENU");
		btnManMenu.setBackground(new Color(204, 204, 204));
		btnManMenu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnManMenu.setBounds(724, 506, 204, 59);
		contentPane.add(btnManMenu);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setBounds(50, 201, 99, 31);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("SURNAME:");
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSurname.setBounds(50, 258, 111, 31);
		contentPane.add(lblSurname);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblId.setBounds(50, 300, 76, 49);
		contentPane.add(lblId);
		
		JLabel lblIban = new JLabel("IBAN:");
		lblIban.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblIban.setBounds(643, 193, 86, 49);
		contentPane.add(lblIban);
		
		JLabel lblAge = new JLabel("AGE:");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAge.setBounds(50, 338, 99, 74);
		contentPane.add(lblAge);
		
		JLabel lblPhone = new JLabel("PHONE:");
		lblPhone.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPhone.setBounds(50, 400, 111, 49);
		contentPane.add(lblPhone);
		
		JLabel lblBalance = new JLabel("BALANCE:");
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblBalance.setBounds(360, 199, 121, 37);
		contentPane.add(lblBalance);
		
		lblPersonname = new JLabel("personname");
		lblPersonname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersonname.setBounds(136, 202, 164, 31);
		contentPane.add(lblPersonname);
		
		lblPersonSurnam = new JLabel("New label");
		lblPersonSurnam.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersonSurnam.setBounds(179, 261, 121, 25);
		contentPane.add(lblPersonSurnam);
		
		lblPersonID = new JLabel("New label");
		lblPersonID.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersonID.setBounds(117, 309, 183, 31);
		contentPane.add(lblPersonID);
		
		lblPersonAge = new JLabel("New label");
		lblPersonAge.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersonAge.setBounds(159, 359, 128, 32);
		contentPane.add(lblPersonAge);
		
		lblPersonPhone = new JLabel("New label");
		lblPersonPhone.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersonPhone.setBounds(158, 407, 183, 34);
		contentPane.add(lblPersonPhone);
		
		lblPersonBalance = new JLabel("New label");
		lblPersonBalance.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersonBalance.setBounds(491, 196, 142, 49);
		contentPane.add(lblPersonBalance);
		
		lblPersonIBAN = new JLabel("New label");
		lblPersonIBAN.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersonIBAN.setBounds(724, 206, 175, 29);
		contentPane.add(lblPersonIBAN);
	}
	
	
	void gomenuListener(ActionListener listenerForgomenuButton){
		btnManMenu.addActionListener(listenerForgomenuButton);
	}
}



