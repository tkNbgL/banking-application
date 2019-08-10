package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccInformController {
	private AccInformView theView;
	private AMethods theModel;
	
	public AccInformController(AccInformView theView,AMethods theModel){
		this.theView=theView;
		this.theModel=theModel;
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
	
}
