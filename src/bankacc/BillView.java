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
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.AbstractListModel;

public class BillView extends JFrame {

	private JPanel contentPane;
	private JLabel lbl_showBlance;
	private JButton btnManMenu;

	private JButton btnPayElectrcty;
	private JButton btnPayWater;
	private JButton btnPayInternet;
	private JButton btnPayGas;
	private JButton btnPayRent;
	private JButton btnPayCredt;
	private JButton btnPayInstallment;
	private JLabel lblElekto;
	private JLabel lblWat;
	private JLabel lblInter_1;
	private JLabel lblGas;
	private JLabel lblCredit;
	private JLabel lblInstallment;
	private JLabel lblWater;
	private JLabel lblInter;
	private JLabel lblGaz;
	private JLabel lblKredi;
	private JLabel lblKira;
	private JLabel lblYkleme;
	private JLabel lblElekt;
	
	



	public JLabel getLblWat() {
		return lblWat;
	}

	public void setLblWat(JLabel lblWat) {
		this.lblWat = lblWat;
	}

	public JLabel getLblInter_1() {
		return lblInter_1;
	}

	public void setLblInter_1(JLabel lblInter_1) {
		this.lblInter_1 = lblInter_1;
	}

	public JLabel getLblGas() {
		return lblGas;
	}

	public void setLblGas(JLabel lblGas) {
		this.lblGas = lblGas;
	}

	public JLabel getLblCredit() {
		return lblCredit;
	}

	public void setLblCredit(JLabel lblCredit) {
		this.lblCredit = lblCredit;
	}

	public JLabel getLblInstallment() {
		return lblInstallment;
	}

	public void setLblInstallment(JLabel lblInstallment) {
		this.lblInstallment = lblInstallment;
	}

	public JLabel getLblWater() {
		return lblWater;
	}

	public void setLblWater(JLabel lblWater) {
		this.lblWater = lblWater;
	}

	public JLabel getLblInter() {
		return lblInter;
	}

	public void setLblInter(JLabel lblInter) {
		this.lblInter = lblInter;
	}

	public JLabel getLblGaz() {
		return lblGaz;
	}

	public void setLblGaz(JLabel lblGaz) {
		this.lblGaz = lblGaz;
	}

	public JLabel getLblKredi() {
		return lblKredi;
	}

	public void setLblKredi(JLabel lblKredi) {
		this.lblKredi = lblKredi;
	}

	public JLabel getLblKira() {
		return lblKira;
	}

	public void setLblKira(JLabel lblKira) {
		this.lblKira = lblKira;
	}

	public JLabel getLblYkleme() {
		return lblYkleme;
	}

	public void setLblYkleme(JLabel lblYkleme) {
		this.lblYkleme = lblYkleme;
	}

	public JLabel getLbl_showBlance() {
		return lbl_showBlance;
	}

	public void setLbl_showBlance(JLabel lbl_showBlance) {
		this.lbl_showBlance = lbl_showBlance;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillView frame = new BillView();
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
	public BillView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 667);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayTheBlls = new JLabel("PAY THE BILLS");
		lblPayTheBlls.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblPayTheBlls.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayTheBlls.setBounds(374, 66, 231, 50);
		contentPane.add(lblPayTheBlls);
		
		JLabel lblBalance = new JLabel("BALANCE:");
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalance.setBounds(104, 171, 200, 50);
		contentPane.add(lblBalance);
		
		lbl_showBlance = new JLabel("asd");
		lbl_showBlance.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lbl_showBlance.setBounds(279, 171, 128, 50);
		contentPane.add(lbl_showBlance);
		
		btnManMenu = new JButton("MAIN MENU");
		btnManMenu.setBackground(new Color(204, 204, 204));
		btnManMenu.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnManMenu.setBounds(745, 537, 200, 50);
		contentPane.add(btnManMenu);
		
		
		lblGas = new JLabel("GAS:");
		lblGas.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGas.setBounds(28, 392, 108, 44);
		contentPane.add(lblGas);
		
		JLabel lblRent = new JLabel("RENT:");
		lblRent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRent.setBounds(28, 447, 144, 38);
		contentPane.add(lblRent);
		
		
		
		lblWater = new JLabel("water");
		lblWater.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWater.setBounds(167, 304, 160, 23);
		contentPane.add(lblWater);
		
		lblInter = new JLabel("inter");
		lblInter.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblInter.setBounds(184, 357, 120, 19);
		contentPane.add(lblInter);
		
		lblGaz = new JLabel("gaz");
		lblGaz.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGaz.setBounds(167, 405, 96, 19);
		contentPane.add(lblGaz);
		
		lblKredi = new JLabel("kredi");
		lblKredi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblKredi.setBounds(167, 514, 120, 19);
		contentPane.add(lblKredi);
		
		lblYkleme = new JLabel("y\u00FCkleme");
		lblYkleme.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblYkleme.setBounds(198, 561, 108, 26);
		contentPane.add(lblYkleme);
		
		btnPayElectrcty = new JButton("PAY ELECTRICITY");
		btnPayElectrcty.setBackground(new Color(220, 220, 220));
		btnPayElectrcty.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnPayElectrcty.setBounds(368, 255, 192, 30);
		contentPane.add(btnPayElectrcty);
		
		btnPayWater = new JButton("PAY WATER");
		btnPayWater.setBackground(new Color(220, 220, 220));
		btnPayWater.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnPayWater.setBounds(368, 303, 192, 30);
		contentPane.add(btnPayWater);
		
		btnPayInternet = new JButton("PAY INTERNET");
		btnPayInternet.setBackground(new Color(220, 220, 220));
		btnPayInternet.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnPayInternet.setBounds(368, 354, 192, 30);
		contentPane.add(btnPayInternet);
		
		btnPayGas = new JButton("PAY GAS");
		btnPayGas.setBackground(new Color(220, 220, 220));
		btnPayGas.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnPayGas.setBounds(368, 402, 192, 30);
		contentPane.add(btnPayGas);
		
		btnPayRent = new JButton("PAY RENT");
		btnPayRent.setBackground(new Color(220, 220, 220));
		btnPayRent.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnPayRent.setBounds(368, 454, 192, 30);
		contentPane.add(btnPayRent);
		
		btnPayCredt = new JButton("PAY CREDIT");
		btnPayCredt.setBackground(new Color(220, 220, 220));
		btnPayCredt.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnPayCredt.setBounds(368, 511, 192, 30);
		contentPane.add(btnPayCredt);
		
		btnPayInstallment = new JButton("PAY INSTALLMENT");
		btnPayInstallment.setBackground(new Color(220, 220, 220));
		btnPayInstallment.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnPayInstallment.setBounds(368, 562, 192, 30);
		contentPane.add(btnPayInstallment);
		
		lblElekto = new JLabel("ELECTRICITY:");
		lblElekto.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblElekto.setBounds(28, 256, 144, 23);
		contentPane.add(lblElekto);
		
		lblWat = new JLabel("WATER:");
		lblWat.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWat.setBounds(28, 304, 133, 23);
		contentPane.add(lblWat);
		
		lblInter_1 = new JLabel("INTERNET:");
		lblInter_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblInter_1.setBounds(28, 355, 133, 23);
		contentPane.add(lblInter_1);
		
		lblCredit = new JLabel("CREDIT:");
		lblCredit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCredit.setBounds(28, 512, 83, 23);
		contentPane.add(lblCredit);
		
		lblInstallment = new JLabel("INSTALLMENT:");
		lblInstallment.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblInstallment.setBounds(27, 555, 161, 38);
		contentPane.add(lblInstallment);
		
		lblElekt = new JLabel("elekt");
		lblElekt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblElekt.setBounds(198, 256, 96, 23);
		contentPane.add(lblElekt);
		
		lblKira = new JLabel("kira");
		lblKira.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblKira.setBounds(182, 458, 103, 23);
		contentPane.add(lblKira);
	}

	public JLabel getLblElekt() {
		return lblElekt;
	}

	public void setLblElekt(JLabel lblElekt) {
		this.lblElekt = lblElekt;
	}
	
	
	void gomenuListener(ActionListener listenerForgomenuButton){
		btnManMenu.addActionListener(listenerForgomenuButton);
	}
	
	void payelekListener(ActionListener listenerForpayelektButton){
		
		btnPayElectrcty.addActionListener(listenerForpayelektButton);
	}
	
	void paywaterListener(ActionListener listenerForpaywaterButton){
		
		btnPayWater.addActionListener(listenerForpaywaterButton);
	}
	
	void payrentListener(ActionListener listenerForpayrentButton){
		
		btnPayRent.addActionListener(listenerForpayrentButton);
	}
	
	void payinstallListener(ActionListener listenerForpayinstallButton){
		
		btnPayInstallment.addActionListener(listenerForpayinstallButton);
	}
	
	void payinterListener(ActionListener listenerForpayinterButton){
		
		btnPayInternet.addActionListener(listenerForpayinterButton);
		
	}
	
	
	void paygasListener(ActionListener listenerForpaygasButton){
		
		btnPayGas.addActionListener(listenerForpaygasButton);
	}
	
	void paycreditListener(ActionListener listenerForcreditButton){
		
		btnPayCredt.addActionListener(listenerForcreditButton);
	}
	
}
