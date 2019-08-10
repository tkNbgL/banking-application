package bankacc;

import java.util.ArrayList;

public class LoginModel {
	
   

	public double currentdouble;
	public String currentname;
	
	public String getCurrentname() {
		return currentname;
	}


	public void setCurrentname(String currentname) {
		this.currentname = currentname;
	}


	public double getCurrentdouble() {
		return currentdouble;
	}

	
	public void setCurrentdouble(double currentdouble) {
		this.currentdouble = currentdouble;
	}

	
	/*public boolean check(int id, int pw){
		
		SingViewModel ana=new SingViewModel();//karþýlaþýrma yapýyor
		for(People people : ana.l){
			if(people.getPeopleUserName()==id & people.getPeoplePW()==pw){
				
				
                
				
				return true;
			}
			
			
				
		}
		//strignler boyle compare edilmez
		
		
		return false;
	}*/

	
	
}
