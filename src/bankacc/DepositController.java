package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositController {
	private DepositView theView;
	private SingViewModel theModel;
	private String amount;
	private double value;
	private double lastbalance;
	private String amount2;
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public DepositController(DepositView theView,SingViewModel theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.depostListener(new depostListener());
		this.theView.gomenuListener(new gomenuListener());
	}
	
	
	class depostListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		System.out.println(theModel.getPcur().getIBAN());	
		amount=theView.getTxt_paragir();
		value=Double.parseDouble(amount);
		System.out.println(theModel.l.get(1));
		lastbalance=theModel.depositMoney(theModel.getPcur().getPeopleBalance(), value);
		
		theModel.getPcur().setPeopleBalance(lastbalance);
		
		amount2=Double.toString(lastbalance);
		
		theView.getLblamount().setText(amount2);
		
		
			
		
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
