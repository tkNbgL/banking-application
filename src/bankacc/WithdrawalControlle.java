package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawalControlle {
	private WithdrawalView theView;
	private AMethods theModel;
	
	public WithdrawalControlle(WithdrawalView theView,AMethods theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.gomenuListener(new gomenuListener());
		this.theView.get20Listener(new get20Listener());
		this.theView.get50Listener(new get50Listener());
		this.theView.get100Listener(new get100Listener());
		this.theView.get200Listener(new get200Listener());
		this.theView.get500Listener(new get500Listener());
		this.theView.get1000Listener(new get1000Listener());
		this.theView.confirmbutton(new confirmbutton());//txt den para almak için
	}
	
	class get20Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theModel.withdrawal(theModel.getAccount(), 20);
			theView.getLblBalan().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
	}
	
	class get50Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theModel.withdrawal(theModel.getAccount(), 50);
			theView.getLblBalan().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
	}
	
	class get100Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theModel.withdrawal(theModel.getAccount(), 100);
			theView.getLblBalan().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
	}
	
	class get200Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theModel.withdrawal(theModel.getAccount(), 200);
			theView.getLblBalan().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
	}
	
	class get500Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theModel.withdrawal(theModel.getAccount(), 500);
			theView.getLblBalan().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
	}
	
	class get1000Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theModel.withdrawal(theModel.getAccount(), 1000);
			theView.getLblBalan().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
	}
	
	class confirmbutton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double money=theView.getTxt_moremoney();			
			theModel.withdrawal(theModel.getAccount(), money);
			theView.getLblBalan().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
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
}
