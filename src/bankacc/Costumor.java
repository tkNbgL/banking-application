package bankacc;

import java.io.Serializable;

public class Costumor extends Abank implements Serializable {
	private String Name;
	private String LastName;
	private String PhoneNumber;
	private String id;
	private int age;
	private String Address;

	
	public Costumor(int electric, int water, int internet, int gas, int rent, int credit, int installment,
			String Name,String LastName,String PhoneNumber,String id,int age,
			String Address){
		super(electric,water,internet,gas,rent,credit,installment);
		this.Name=Name;
		this.LastName=LastName;
		this.PhoneNumber=PhoneNumber;
		this.id=id;
		this.age=age;
		this.Address=Address;
	
	}


	public Costumor() {
		// TODO Auto-generated constructor stub
		super();
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	

	
}
