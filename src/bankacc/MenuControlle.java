package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuControlle {
	private MenuView theView;
	private AMethods theModel;
	
	public MenuControlle(MenuView theView,AMethods theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.depositMenuListener(new depositMenuListener());
		this.theView.goWithdrawalListener(new goWithdrawalListener());
		this.theView.goPayBillListener(new goPayBillListener());
		this.theView.sendMenuListener(new sendMenuListener());
		this.theView.goInformListener(new goInformListener());
	}
	
	
	class goInformListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			AccInformView informview=new AccInformView();
			informview.getLblPersonname().setText(theModel.getAccount().getName());
			informview.getLblPersonSurnam().setText(theModel.getAccount().getLastName());
			informview.getLblPersonID().setText(theModel.getAccount().getId());
			informview.getLblPersonAge().setText(Integer.toString(theModel.getAccount().getAge()));
			informview.getLblPersonPhone().setText(theModel.getAccount().getPhoneNumber());
			informview.getLblPersonBalance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			informview.getLblPersonIBAN().setText(Integer.toString(theModel.getAccount().getIBAN()));
			
			AccInformController continform=new AccInformController(informview, theModel);
			informview.setVisible(true);
			theView.setVisible(false);
			
		}
		
		
		
	}
	
	
	
	
	
	class sendMenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			SendView sendview=new SendView();
			sendview.getLbl_amount().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			SendControlle contsend=new SendControlle(sendview,theModel);
			sendview.setVisible(true);
			theView.setVisible(false);
		}
		
	}
	
	class goPayBillListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			BillView billview=new BillView();
			billview.getLbl_showBlance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			billview.getLblElekt().setText(Double.toString(theModel.getAccount().getElectric()));
			billview.getLblGaz().setText(Double.toString(theModel.getAccount().getElectric()));
			billview.getLblKira().setText(Double.toString(theModel.getAccount().getRent()));
			billview.getLblWater().setText(Double.toString(theModel.getAccount().getWater()));
			billview.getLblInter().setText(Double.toString(theModel.getAccount().getInstallment()));
			billview.getLblKredi().setText(Double.toString(theModel.getAccount().getCredit()));
			billview.getLblYkleme().setText(Double.toString(theModel.getAccount().getInstallment()));
			BillController contbill=new BillController(billview,theModel);
			billview.setVisible(true);
			theView.setVisible(false);
		}
		
	}
	
	class goWithdrawalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			WithdrawalView withdraw=new WithdrawalView();
			withdraw.getLblBalan().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			WithdrawalControlle cont=new WithdrawalControlle(withdraw,theModel);
			withdraw.setVisible(true);
			theView.setVisible(false);
		}
		
	}
	
	class depositMenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			DepositView depo=new DepositView();
			depo.getLblamount().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			DepositControlle contabi=new DepositControlle(depo,theModel);
			depo.setVisible(true);
			theView.setVisible(false);
		}
		
	}
	
}
