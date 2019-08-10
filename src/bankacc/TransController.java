package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransController {
	private TransView theView;
	private SingViewModel theModel;
	
	public TransController(TransView theView,SingViewModel theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.gomenuListener(new gomenuListener());
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
