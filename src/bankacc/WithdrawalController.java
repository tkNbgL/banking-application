package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawalController {
	private WithdrawalView theView;
	private SingViewModel theModel;
	private String amount;
	private double value;
	private double lastbalance;
	private String amount2;
	
	
	public WithdrawalController(WithdrawalView theView,SingViewModel theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.gomenuListener(new gomenuListener());
		this.theView.confirmListener(new confirmListener());
	}
	
	
	class confirmListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
		
			amount=theView.getTextField();
			
			value=Double.parseDouble(amount);

			
			lastbalance=theModel.withdrawalMoney(theModel.getPcur().getPeopleBalance(), value);
			
			theModel.getPcur().setPeopleBalance(lastbalance);
			
			amount2=Double.toString(lastbalance);
			
			theView.getLblBalan().setText(amount2);
			
			
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
