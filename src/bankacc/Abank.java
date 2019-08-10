package bankacc;

import java.io.Serializable;

public class Abank implements Serializable {
	private double electric;
	private double water;
	private double internet;
	private double gas;
	private double rent;
	private double credit;
	private double installment;
	
	public Abank(int electric,int water,int internet,int gas,int rent,int credit,int installment){
		this.electric=150;
		this.water=150;
		this.internet=150;
		this.gas=200;
		this.rent=800;
		this.credit=5000;
		this.installment=500;
	}
	public Abank(){
		
	}
	public double getElectric() {
		return electric;
	}
	public void setElectric(double electric) {
		this.electric = electric;
	}
	public double getWater() {
		return water;
	}
	public void setWater(double water) {
		this.water = water;
	}
	public double getInternet() {
		return internet;
	}
	public void setInternet(double internet) {
		this.internet = internet;
	}
	public double getGas() {
		return gas;
	}
	public void setGas(double gas) {
		this.gas = gas;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getInstallment() {
		return installment;
	}
	public void setInstallment(double installment) {
		this.installment = installment;
	}

	
	
}
