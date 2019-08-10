package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {
	 private MenuView theView;
	 private SingViewModel theModel;
	 
	 
	 public MenuController(MenuView theView,SingViewModel theModel){
		 this.theModel=theModel;
		 this.theView=theView;
		 this.theView.depositMenuListener(new depositMenuListener());
		 this.theView.sendMenuListener(new sendMenuListener());
		 this.theView.goWithdrawalListener(new goWithdrawalListener());
		 this.theView.goPayBillListener(new goPayBillListener());
		 this.theView.goInformListener(new goInformListener());
		 this.theView.goTransHistoListener(new goTransHistoListener());
	 }
	 
	 class goTransHistoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			TransView histo=new TransView();
			TransModel histomodel=new TransModel();
			TransController cont=new TransController(histo,histomodel);
			histo.setVisible(true);
			theView.setVisible(false);
		}
		 
	 }
	 
	 class goInformListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			AccInformView info=new AccInformView();
			AccInformModel infmodel=new AccInformModel();
			AccInformController cont=new AccInformController(info,infmodel);
			info.setVisible(true);
			theView.setVisible(false);
		}
		 
	 }
	 
	 class goPayBillListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String firbln;
			BillView bill=new BillView();
			firbln=Double.toString(theModel.getPcur().getPeopleBalance());
			bill.getLblAsd().setText(firbln);
			BillController billcontroller=new BillController(bill,theModel);
			bill.setVisible(true);
			theView.setVisible(false);
		}
		 
	 }
	 
	 class goWithdrawalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String fbalan;
			WithdrawalView with=new WithdrawalView();
			fbalan=Double.toString(theModel.getPcur().getPeopleBalance());
			with.getLblBalan().setText(fbalan);
			WithdrawalController cont=new WithdrawalController(with,theModel);
			with.setVisible(true);
			theView.setVisible(false);
		}
		 
	 }
	 
	 class sendMenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String fblnc;
			SendView send=new SendView();
			fblnc=Double.toString(theModel.getPcur().getPeopleBalance());
			send.getLblNewLabel().setText(fblnc);
			SendController contabi=new SendController(send,theModel);
			send.setVisible(true);
			theView.setVisible(false);
		}
		 
	 }
	 
	 class depositMenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String firstbalance;
			DepositView depo=new DepositView();
			firstbalance=Double.toString(theModel.getPcur().getPeopleBalance());
			depo.getLblamount().setText(firstbalance);
			DepositController contabi=new DepositController(depo,theModel);
			depo.setVisible(true);
			theView.setVisible(false);
					
		}
		 
	 }
	 
}
