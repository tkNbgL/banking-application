package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendController {
	private SendView theView;
	private SingViewModel theModel;
	private int amount;
	private double amount2;
	private String amount3;
	private double amount4;
	private double amount5;
	
	public SendController(SendView theView,SingViewModel theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.gomenuListener(new gomenuListener());
		this.theView.sendListener(new sendListener());
	}
	class sendListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			People p1;
			
			amount=Integer.parseInt(theView.getTextýban());
			
			p1=theModel.findbyiban(amount);
					
			amount2=Double.parseDouble(theView.getTextamount());
			
			amount4=theModel.withdrawalMoney(theModel.getPcur().getPeopleBalance(), amount2);
			
			theModel.getPcur().setPeopleBalance(amount4);
			
			amount5=theModel.depositMoney(p1.getPeopleBalance(), amount2);
			
			p1.setPeopleBalance(amount5);
			
			theView.getLblrecname().setText(p1.getPeopleName());
			
			amount3=Double.toString(theModel.getPcur().getPeopleBalance());
			
			theView.getLblNewLabel().setText(amount3);
			
		}
		
	}
	
	class gomenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MenuView menu=new MenuView();
			MenuController contmenu=new MenuController(menu,theModel);
			menu.setVisible(true);
			theView.setVisible(false);
		}
		
	}
}
