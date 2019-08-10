package bankacc;

import java.util.ArrayList;


public class Main {
	public static void main(String args[]){
		
		
		LoginView view=new LoginView();
		SingViewModel modell=new SingViewModel();
		
		modell.addPeople("atakan", "keskin", 12, "2046", "530", "goztepe", 53, 27, 54.43);
        modell.addPeople("utku","dede",12,"dede","dfsdfsdf","12354612",123,345, 84.3);
     
		LoginController cont=new LoginController(view,modell);
	    view.setVisible(true);
	}

	
}
 