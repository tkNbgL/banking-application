package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendControlle {
	private SendView theView;
	private AMethods theModel;
	
	public SendControlle(SendView theView,AMethods theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.sendListener(new sendListener());
		this.theView.gomenuListener(new gomenuListener());
	}
	
	class gomenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MenuView menu=new MenuView();
			MenuControlle contmenu=new MenuControlle(menu,theModel);
			menu.setVisible(true);
			theView.setVisible(false);
		}
		
	}
	
	class sendListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double money=theView.getTxt_amount();
			int iban=theView.getTxt_ýban();
			if(money>0){
				theModel.sendMoney(theModel.getAccount(), iban, money);
				theView.getLbl_amount().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			}
			System.out.println(theModel.getL());
		}
		
	}
}
