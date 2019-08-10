package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillController {
	private BillView theView;
	private AMethods theModel;
	
	public BillController(BillView theView,AMethods theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.payelekListener(new payelekListener());
		this.theView.paycreditListener(new paycreditListener());
		this.theView.paygasListener(new paygasListener());
		this.theView.payinstallListener(new payinstallerListener());
		this.theView.paywaterListener(new paywaterListener());
		this.theView.payrentListener(new payrentListener());
		this.theView.payinterListener(new payinterListener());
		this.theView.gomenuListener(new gomenuListener());
		
	}
	
	
	class payelekListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			theModel.payTheBillsElectric(theModel.getAccount(),theModel.getAccount().getElectric());
			theView.getLblElekt().setText(Double.toString(theModel.getAccount().getElectric()));
			theView.getLbl_showBlance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			
		}
		
		
		
	}
	
	class paycreditListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			theModel.payCreidt(theModel.getAccount(), theModel.getAccount().getCredit());
			theView.getLblKredi().setText(Double.toString(theModel.getAccount().getCredit()));
			theView.getLbl_showBlance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			
			
		}
		
		
		
	}
	
	
	class paygasListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			theModel.payTheBillsGas(theModel.getAccount(),theModel.getAccount().getGas());
			theView.getLblGaz().setText(Double.toString(theModel.getAccount().getGas()));
			theView.getLbl_showBlance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			
		}
		
		
		
	}
	
	
	class payinstallerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			theModel.payTheBillInstall(theModel.getAccount(), theModel.getAccount().getInstallment());
			theView.getLblYkleme().setText(Double.toString(theModel.getAccount().getInstallment()));
			theView.getLbl_showBlance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			
		}
		
		
		
	}
	
	
	class paywaterListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			theModel.payTheBillsWater(theModel.getAccount(), theModel.getAccount().getWater());
			theView.getLblWater().setText(Double.toString(theModel.getAccount().getWater()));
			theView.getLbl_showBlance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
		
		
	}
	
	
	class payrentListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			theModel.payTheBillsRent(theModel.getAccount(), theModel.getAccount().getRent());
			theView.getLblKira().setText(Double.toString(theModel.getAccount().getRent()));
			theView.getLbl_showBlance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
		
		
	}
	
	class payinterListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			theModel.payTheBillsInternet(theModel.getAccount(),theModel.getAccount().getInternet());
			theView.getLblInter().setText(Double.toString(theModel.getAccount().getInternet()));
			theView.getLbl_showBlance().setText(Double.toString(theModel.getAccount().getAccountBalance()));
		}
		
		
		
	}
	
	class gomenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			MenuView menu=new MenuView();
			MenuControlle contmenu=new MenuControlle(menu,theModel);
			menu.setVisible(true);
			theView.setVisible(false);
		}
		
		
		
	}
	
	
	
	
	
	
}
