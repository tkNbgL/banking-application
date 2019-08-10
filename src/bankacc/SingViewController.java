package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingViewController {
	private SignView theView;
	private SingViewModel theModel;
	
	public SingViewController(SignView theView,SingViewModel theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.registerListener(new registerListener());
		/*this.theView.radioFemaleListener(new radioFemaleListener());
		this.theView.radioMaleListener(new radioMaleListener());*/
	}
	
	
	class registerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String name=theView.getTxt_name();
			String surname=theView.getTxt_surname();
			int age=theView.getTxt_age();
			String ID=theView.getTxt_ýd();
			String phone=theView.getTxt_phone();
			String address=theView.getTxt_address();
			int username=theView.getTxt_username();
			int password=theView.getTxt_pw();
			double balance=0;
			
			People p1=new People(name,surname,age,ID,phone,
					address,username,password,balance);
			
			theModel.l.add(p1);
			theView.setVisible(false);
			LoginView ah=new LoginView();
		
			LoginController aha=new LoginController(ah,theModel);
			ah.setVisible(true);
		}
		
	}
	
	
}
