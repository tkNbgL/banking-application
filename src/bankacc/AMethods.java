package bankacc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;


public class AMethods {
	
	private ArrayList<Account> l=new ArrayList<Account>();
	private Account account;
	
	
	public boolean addCostumer(int electric, int water, int internet, int gas,
			int rent, int credit, int installment,
			String name,String surname,String phonenumber,String id,int age,
			String Address,String AccountNo,String AccountPw,
			double AccountBalance){
			
		Random rand=new Random();
		int iban=rand.nextInt(10000);
		Account account=new Account(electric,water,internet,gas,rent,credit,installment,
				name,surname,phonenumber,id,age,Address,AccountNo,AccountPw,AccountBalance,iban);
		
		
		account.setElectric(electric);
		account.setWater(water);
		account.setInternet(internet);
		account.setGas(gas);
		account.setRent(rent);
		account.setCredit(credit);
		account.setInstallment(installment);
		account.setName(name);
		account.setLastName(surname);
		account.setPhoneNumber(phonenumber);
		account.setId(id);
		account.setAge(age);
		account.setAddress(Address);
		account.setAccountNo(AccountNo);
		account.setAccountPw(AccountPw);
		account.setAccountBalance(AccountBalance);
		account.setIBAN(iban);
		l.add(account);
		write();
		
		return true;
		
	}
	
	public void write(){

		try(FileOutputStream fs=new FileOutputStream("acco.bin")){
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeInt(l.size());
			for(Account cctemp:l){
				os.writeObject(cctemp);
			}
			
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readAll(){
		try(FileInputStream fi=new FileInputStream("acco.bin")){
			ObjectInputStream os= new ObjectInputStream(fi);
			
		
			
			int num=os.readInt();
			
			for(int i=0; i<num; i++){
				Account actemp=(Account)os.readObject();
				l.add(actemp);
			}
			
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Account> getL() {
		return l;
	}



	public void setL(ArrayList<Account> l) {
		this.l = l;
	}

	

	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public Costumor checkpw(String id,String pw){
		
		for(int i=0; i<getL().size(); i++){
			account=getL().get(i);
			if(account.getAccountNo().equals(id) & account.getAccountPw().equals(pw)){
				return account;
			}
		}
		
		return null;
	}
	
	public void deposit(double Money,Account acc){
		acc.setAccountBalance(acc.getAccountBalance()+Money);

	/*	Formatter output=null; 
		try{
			output = new Formatter(
                    new java.io.FileWriter("c:\\temp\\data.txt",
                    true));
		}catch(IOException fileNotFoundException){
			System.err.println("Error opening file.");
            System.exit(1);
		}
		
		  output.format("%s %s %s %s %d %s %s %s %f\n",account.getName(),account.getLastName(),
				  account.getPhoneNumber(),account.getId(),account.getAge(),account.getAddress(),
				  account.getAccountNo(),account.getAccountPw(),account.getAccountBalance());
		  
		  if (output != null) {
	            output.close();
	        }
		*/
	}
	
	public void withdrawal(Account acc, double Money){
		acc.setAccountBalance(acc.getAccountBalance()-Money);
		
		/*Formatter output=null; 
		try{
			output = new Formatter(
                    new java.io.FileWriter("c:\\temp\\data.txt",
                    true));
		}catch(IOException fileNotFoundException){
			System.err.println("Error opening file.");
            System.exit(1);
		}
		
		  output.format("%s %s %s %s %d %s %s %s %f\n",account.getName(),account.getLastName(),
				  account.getPhoneNumber(),account.getId(),account.getAge(),account.getAddress(),
				  account.getAccountNo(),account.getAccountPw(),account.getAccountBalance());
		  
		  if (output != null) {
	            output.close();
	        }
		  */
	}
	
	public void payTheBillsGas(Account acc, double gasvalue){
		
		if(acc.getAccountBalance()>gasvalue & acc.getGas()!=0){
			acc.setGas(acc.getGas()-gasvalue);
			withdrawal(acc,gasvalue);
		}else{
			System.out.println("dfdsafs");
		}
	}
	
	public void payTheBillsWater(Account acc, double watervalue){
	
		if(acc.getAccountBalance()>watervalue & acc.getWater()!=0){
			acc.setWater(acc.getWater()-watervalue);
			withdrawal(acc,watervalue);
		}
	}
	
	
	public void payCreidt(Account acc,double creditvalue){
		
		if(acc.getAccountBalance()>creditvalue & acc.getAccountBalance()!=0){
			acc.setCredit(acc.getCredit()-creditvalue);
			withdrawal(acc,creditvalue);
		}
		
	}
	
    public void payTheBillInstall(Account acc,double installvalue){
		
		if(acc.getAccountBalance()>installvalue & acc.getAccountBalance()!=0){
			acc.setInstallment(acc.getInstallment()-installvalue);
			withdrawal(acc,installvalue);
		}
		
	}
	
	
	
	
	
	public void payTheBillsElectric(Account acc,double electvalue){
		
		if(acc.getAccountBalance()>electvalue & acc.getElectric()!=0){
			acc.setElectric(acc.getElectric()-electvalue);
			
			withdrawal(acc,electvalue);
		}
	}
	
	public void payTheBillsInternet(Account acc,double netvalue){
		
		if(acc.getAccountBalance()>netvalue& acc.getInternet()!=0){
			acc.setInternet(acc.getInternet()-netvalue);
			withdrawal(acc,netvalue);
		}
	}
	
	public void payTheBillsRent(Account acc,double rentvalue){
		
		if(acc.getAccountBalance()>rentvalue & acc.getRent()!=0){
			acc.setRent(acc.getRent()-rentvalue);
			withdrawal(acc,rentvalue);
		}
	}
	
	public void sendMoney(Account acc,int iban,double money){
		if(money <= acc.getAccountBalance()){
			withdrawal(acc,money);
			for(int i=0; i<getL().size(); i++){
				Account acciban=getL().get(i);
				if(acciban.getIBAN()==iban){
					deposit(money, acciban);
				}
			}
			
			//deposit(money,iban);
		}else{
			//exception
		}
	}
	
}
