package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class DepositControlle {
	private DepositView theView;
	private AMethods theModel;
	
	public DepositControlle(DepositView theView,AMethods theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.depostListener(new depostListener());
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
	
	class depostListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try{
			double Money=theView.getTxt_paragir();
			theModel.deposit(Money,theModel.getAccount());
			theView.getLblamount().setText(Double.toString(theModel.getAccount().getAccountBalance()));
			//System.out.println(theModel.getAccount());
			}catch(Exception a){
				JOptionPane.showMessageDialog(null, "dj sakir!");
			}
		}
		
	}
	
}
