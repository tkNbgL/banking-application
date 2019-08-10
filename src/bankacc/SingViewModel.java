package bankacc;

import java.awt.List;
import java.util.*;


public class SingViewModel {
	

	
   private People pcur;
   
   
   
  
	public People getPcur() {
	return pcur;
}





public void setPcur(People pcur) {
	this.pcur = pcur;
}






	public ArrayList<People> l=new ArrayList<People>();
    
	
	
	public ArrayList<People> getL() {
		return l;
	}





	public void setL(ArrayList<People> l) {
		this.l = l;
	}

	
	public People checkpers(int id, int pw){
		
		
	    
		
		for(int i=0; i<l.size(); i++){
			People currPeople=l.get(i);
			if(currPeople.getPeopleUserName()==id & currPeople.getPeoplePW()==pw){
				
				return currPeople;
			}
			
			
				
		}
		
		return null;
	}


	/*public People checkpers(int id, int pw, People pcurrent){
		

		for(int i=0; i<l.size(); i++){
			People currPeople=l.get(i);
			if(currPeople.getPeopleUserName()==id & currPeople.getPeoplePW()==pw){
				this.pcurrent=pcurrent;
				pcurrent=currPeople;
				setPcurrent(currPeople);
				
				return pcurrent;
			}
			
			
				
		}
		
		return null;
	}*/
		
		
	






	public boolean addPeople(String name,String surname,int age,
			String ID,String phone,String address,int username,int password, double balance){
		
         
		Random rand=new Random();
		
		int iban=rand.nextInt(10000);
		People p1=new People(name,surname,age,ID,phone,
				address,username,password,balance,iban);
		
	
		//iban koyulcak
		p1.setPeopleName(name);
		p1.setPeopleSurname(surname);
		p1.setPeopleAge(age);
		p1.setPeopleID(ID);
		p1.setPeoplePhone(phone);
		p1.setPeopleAddress(address);
		p1.setPeopleUserName(username);
		p1.setPeoplePW(password);
		p1.setPeopleBalance(balance);
		p1.setIBAN(iban);

		l.add(p1);
		return true;
		
	}
	
	

   
	
public boolean check(int id, int pw){
		
	
	    
	
		for(People people :l){
			if(people.getPeopleUserName()==id & people.getPeoplePW()==pw){
				
				
				return true;
			}
			
			
				
		}
		
		return false;
	}



public int checkit(int id, int pw){
	
	
	
	for(int i=0; i<l.size(); i++){
		
		if(l.get(i).getPeopleUserName()==id && l.get(i).getPeoplePW()==pw){
			
			
			return i;
			
		}
		
		
	}
	
	return id;
	
	
}



public double withdrawalMoney(double o1, double o2){
	
	o1=o1-o2;
	
	return o1;
	
}


public double depositMoney(double o1, double o2){
	
	
	o1=o1+o2;
	
	return o1;
	
}


public People findbyiban(int iban1){

	for(int i=0; i<l.size(); i++){
		People currPeople=l.get(i);
		if(currPeople.getIBAN()==iban1){
			
		
			
			return currPeople;
		}
		
		
			
	}
	
	return null;
}



	
}
