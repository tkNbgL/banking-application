package bankacc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AAmain {
	
	public static void main(String args[]){
		
	
	LoginView view=new LoginView();
	AMethods method=new AMethods();
	LoginControlle cont=new LoginControlle(view,method);
	method.readAll();
	view.setVisible(true);
	//send ekranýnda balancý görünur kýlmam gerek
	}
}
