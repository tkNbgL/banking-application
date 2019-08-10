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
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class SignView extends JFrame {

	private JPanel contentPane;
	private JTextField txt_name;
	private JTextField txt_surname;
	private JTextField txt_ýd;
	private JTextField txt_phone;
	private JTextField txt_address;
	private JTextField txt_username;
	private JTextField txt_pw;
	private JTextField txt_age;
	private JButton btn_Register;
	/*private JRadioButton rdbtn_Female;
	private JRadioButton rdbtn_Male;*/

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignView frame = new SignView();
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
	public SignView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1003, 656);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setForeground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setForeground(new Color(51, 51, 102));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(436, 28, 129, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblSurname = new JLabel("SURNAME:");
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSurname.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurname.setBounds(74, 151, 97, 32);
		contentPane.add(lblSurname);
		
		JLabel lblPhone = new JLabel("PHONE:");
		lblPhone.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setBounds(74, 409, 97, 32);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAddress.setBounds(74, 500, 97, 32);
		contentPane.add(lblAddress);
		
		JLabel lblAge = new JLabel("AGE:");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setBounds(74, 222, 97, 32);
		contentPane.add(lblAge);
		
		JLabel lblUserName = new JLabel("USER NAME:");
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setBounds(537, 217, 111, 32);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(537, 290, 109, 32);
		contentPane.add(lblPassword);
		
		JLabel lblNamer = new JLabel("NAME:\r\n");
		lblNamer.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNamer.setHorizontalAlignment(SwingConstants.CENTER);
		lblNamer.setBounds(74, 94, 97, 32);
		contentPane.add(lblNamer);
		
		JLabel lblIDLabel = new JLabel("ID:");
		lblIDLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIDLabel.setBounds(74, 281, 97, 32);
		contentPane.add(lblIDLabel);
		
		txt_name = new JTextField();
		txt_name.setBackground(new Color(204, 204, 204));
		txt_name.setBounds(208, 99, 129, 27);
		contentPane.add(txt_name);
		txt_name.setColumns(10);
		
		txt_surname = new JTextField();
		txt_surname.setBackground(new Color(204, 204, 204));
		txt_surname.setBounds(208, 156, 129, 27);
		contentPane.add(txt_surname);
		txt_surname.setColumns(10);
		
		txt_ýd = new JTextField();
		txt_ýd.setBackground(new Color(204, 204, 204));
		txt_ýd.setBounds(208, 286, 129, 27);
		contentPane.add(txt_ýd);
		txt_ýd.setColumns(10);
		
		txt_phone = new JTextField();
		txt_phone.setBackground(new Color(204, 204, 204));
		txt_phone.setBounds(208, 414, 238, 27);
		contentPane.add(txt_phone);
		txt_phone.setColumns(10);
		
		txt_address = new JTextField();
		txt_address.setBackground(new Color(204, 204, 204));
		txt_address.setBounds(208, 493, 238, 97);
		contentPane.add(txt_address);
		txt_address.setColumns(10);
		
		txt_username = new JTextField();
		txt_username.setBackground(new Color(204, 204, 204));
		txt_username.setBounds(715, 218, 200, 44);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		txt_pw = new JTextField();
		txt_pw.setBackground(new Color(204, 204, 204));
		txt_pw.setBounds(715, 286, 200, 44);
		contentPane.add(txt_pw);
		txt_pw.setColumns(10);
		
		txt_age = new JTextField();
		txt_age.setBackground(new Color(204, 204, 204));
		txt_age.setBounds(208, 222, 129, 27);
		contentPane.add(txt_age);
		txt_age.setColumns(10);
		
		JRadioButton rdbtn_Female = new JRadioButton("FEMALE");
		rdbtn_Female.setBackground(new Color(204, 204, 204));
		rdbtn_Female.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtn_Female.setBounds(208, 346, 120, 32);
		contentPane.add(rdbtn_Female);
		
		JRadioButton rdbtn_Male = new JRadioButton("MALE");
		rdbtn_Male.setBackground(new Color(204, 204, 204));
		rdbtn_Male.setForeground(new Color(0, 0, 0));
		rdbtn_Male.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtn_Male.setBounds(348, 346, 120, 32);
		contentPane.add(rdbtn_Male);
		
		JLabel lblGender = new JLabel("GENDER:");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblGender.setBounds(74, 337, 97, 47);
		contentPane.add(lblGender);
		
		btn_Register = new JButton("REGISTER");
		btn_Register.setBackground(new Color(204, 204, 204));
		btn_Register.setForeground(new Color(25, 25, 112));
		btn_Register.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn_Register.setBounds(637, 422, 220, 74);
		contentPane.add(btn_Register);
	}

	public String getTxt_name() {
		return txt_name.getText();
	}

	public String getTxt_surname() {
		return txt_surname.getText();
	}

	public String getTxt_ýd() {
		return txt_ýd.getText();
	}

	public String getTxt_phone() {
		return txt_phone.getText();
	}

	public String getTxt_address() {
		return txt_address.getText();
	}

	public String getTxt_username() {
		return txt_username.getText();
	}

	public String getTxt_pw() {
		return txt_pw.getText();
	}

	public int getTxt_age() {
		return Integer.parseInt(txt_age.getText());
	}
	
	void registerListener(ActionListener listenerForRegisterButton){
		btn_Register.addActionListener(listenerForRegisterButton);
	}
	
/*	void radioFemaleListener(ActionListener listenerForradioFemaleButton){
		rdbtn_Female.addActionListener(listenerForradioFemaleButton);
	}
	
	void radioMaleListener(ActionListener listenerForradioMaleButton){
		rdbtn_Female.addActionListener(listenerForradioMaleButton);
	}
*/
	
	
}
