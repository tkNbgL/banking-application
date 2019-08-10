package bankacc;

import java.io.Serializable;

public class Account extends Costumor implements Serializable{
	private String AccountNo;
	private String AccountPw;
	private double AccountBalance=100;
	private int IBAN;
	
	public Account(int electric, int water, int internet, int gas, int rent, int credit, int installment,
			String Name, String LastName, String PhoneNumber, String id, int age,String Address,String AccountNo,String AccountPw,
			double AccountBalance,int IBAN) {
		super(electric,water,internet,gas,rent,credit,installment,Name, LastName, PhoneNumber, id, age,Address);
		// TODO Auto-generated constructor stub
		this.AccountNo=AccountNo;
		this.AccountPw=AccountPw;
		this.AccountBalance=AccountBalance;
		this.IBAN=IBAN;
	}


	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	public int getIBAN() {
		return IBAN;
	}


	public void setIBAN(int iBAN) {
		IBAN = iBAN;
	}


	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public String getAccountPw() {
		return AccountPw;
	}

	public void setAccountPw(String accountPw) {
		AccountPw = accountPw;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}


	@Override
	public String toString() {
		return "Account [AccountNo=" + AccountNo + ", AccountPw=" + AccountPw + ", AccountBalance=" + AccountBalance
				+ ", IBAN=" + IBAN + ", getIBAN()=" + getIBAN() + ", getAccountNo()=" + getAccountNo()
				+ ", getAccountPw()=" + getAccountPw() + ", getAccountBalance()=" + getAccountBalance()
				+ ", getAddress()=" + getAddress() + ", getName()=" + getName() + ", getLastName()=" + getLastName()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getId()=" + getId() + ", getAge()=" + getAge()
				+ ", getElectric()=" + getElectric() + ", getWater()=" + getWater() + ", getInternet()=" + getInternet()
				+ ", getGas()=" + getGas() + ", getRent()=" + getRent() + ", getCredit()=" + getCredit()
				+ ", getInstallment()=" + getInstallment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
	
	

}
