package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginControlle {
	private LoginView theView;
	private AMethods theModel;
	
	public LoginControlle(LoginView theView,AMethods theModel){
		this.theView=theView;
		this.theModel=theModel;
		this.theView.sýgnýnListener(new sýgnýnListener());
		this.theView.sýgnupListener(new sýgnupListener());
	}
	
	class sýgnupListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				SignView signup=new SignView();
				//controller eklencekmi eklenmicekmi sonra kontrol et
				SingViewControlle controller=new SingViewControlle(signup,theModel);
				signup.setVisible(true);
				theView.setVisible(false);
		}
		
	}
	
	class sýgnýnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String id=theView.getTxt_Usernamer();
			String pw=theView.getTxt_passwordField();
			if(theModel.checkpw(id, pw)!=null){
				//Costumor tempcostumor=theModel.checkpw(id, pw);
				MenuView menu=new MenuView();
				MenuControlle contmenu=new MenuControlle(menu,theModel);
				menu.setVisible(true);
				theView.setVisible(false);
			}
			else{
				JOptionPane.showMessageDialog(null, "dj sakir!");
			}
		}
		
	}
}
