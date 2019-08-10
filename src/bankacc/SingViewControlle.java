package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SingViewControlle {
	private SignView theView;
	private AMethods theModel;
	
	public SingViewControlle(SignView theView,AMethods theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.registerListener(new registerListener());
	}
	
	class registerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String name=theView.getTxt_name();
			String surname=theView.getTxt_surname();
			int age=theView.getTxt_age();
			String ID=theView.getTxt_ýd();
			String phonenumber=theView.getTxt_phone();
			String address=theView.getTxt_address();
			String accountno=theView.getTxt_username();
			String password=theView.getTxt_pw();
			
			
			Random rbalan= new Random();
				
		    double balance=0;
			int electric =rbalan.nextInt(200);
			int water = rbalan.nextInt(60);
			int internet = rbalan.nextInt(50);
			int gas = rbalan.nextInt(200);
			int rent = rbalan.nextInt(1500);
			int credit = rbalan.nextInt(1000);
			int installment = rbalan.nextInt(500);
			
			
			theModel.addCostumer(electric,water,internet,gas,rent,credit,installment,
					name, surname, phonenumber, ID, age, address, accountno, password, balance);
			theView.setVisible(false);
			LoginView ah=new LoginView();
		
			LoginControlle aha=new LoginControlle(ah,theModel);
			ah.setVisible(true);
		}
		
	}
}
