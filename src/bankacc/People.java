package bankacc;

public class People {
	

	private String PeopleName;
	private String PeopleSurname;
	private int PeopleAge;
	private String PeopleID;
	//private String PeopleGender;
	private String PeoplePhone;
	private String PeopleAddress;
	private int PeopleUserName;
	private int PeoplePW;
	private double PeopleBalance;
	private int IBAN;


	
	

	public int getIBAN() {
		return IBAN;
	}

	public void setIBAN(int iBAN) {
		IBAN = iBAN;
	}

	public double getPeopleBalance() {
		return PeopleBalance;
	}

	public void setPeopleBalance(double peopleBalance) {
		PeopleBalance = peopleBalance;
	}

	public People(String PeopleName,String PeopleSurname,int PeopleAge, String PeopleID, String PeoplePhone,
			
			String PeopleAddress,
		
			int PeopleUserName,int PeoplePW, double PeopleBalance, int IBAN){
		
		this.PeopleName=PeopleName;
		this.PeopleSurname=PeopleSurname;
		this.PeopleAge=PeopleAge;
		this.PeopleID=PeopleID;
		//this.PeopleGender=PeopleGender;
		this.PeoplePhone=PeoplePhone;
		this.PeopleAddress=PeopleAddress;
		this.PeopleUserName=PeopleUserName;
		this.PeoplePW=PeoplePW;
		this.PeopleBalance=PeopleBalance;
		this.IBAN=IBAN;
		

	}

	public String getPeopleName() {
		return PeopleName;
	}

	public void setPeopleName(String peopleName) {
		PeopleName = peopleName;
	}

	public String getPeopleSurname() {
		return PeopleSurname;
	}

	public void setPeopleSurname(String peopleSurname) {
		PeopleSurname = peopleSurname;
	}

	public int getPeopleAge() {
		return PeopleAge;
	}

	public void setPeopleAge(int peopleAge) {
		PeopleAge = peopleAge;
	}

	public String getPeopleID() {
		return PeopleID;
	}

	public void setPeopleID(String peopleID) {
		PeopleID = peopleID;
	}

	public String getPeoplePhone() {
		return PeoplePhone;
	}

	public void setPeoplePhone(String peoplePhone) {
		PeoplePhone = peoplePhone;
	}

	public String getPeopleAddress() {
		return PeopleAddress;
	}

	public void setPeopleAddress(String peopleAddress) {
		PeopleAddress = peopleAddress;
	}

	public int getPeopleUserName() {
		return PeopleUserName;
	}

	public void setPeopleUserName(int peopleUserName) {
		PeopleUserName = peopleUserName;
	}

	public int getPeoplePW() {
		return PeoplePW;
	}

	public void setPeoplePW(int peoplePW) {
		PeoplePW = peoplePW;
	}
	
	
	@Override
	public String toString() {
		return "People [PeopleName=" + PeopleName + ", PeopleSurname="
				+ PeopleSurname + ", PeopleAge=" + PeopleAge + ", PeopleID="
				+ PeopleID + ", PeoplePhone=" + PeoplePhone
				+ ", PeopleAddress=" + PeopleAddress + ", PeopleUserName="
				+ PeopleUserName + ", PeoplePW=" + PeoplePW
				+ ", PeopleBalance=" + PeopleBalance + "]";
	}
	

}
