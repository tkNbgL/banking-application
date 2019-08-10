package bankacc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginController {
	private LoginView theView;
	private SingViewModel theModel;
	
	public LoginController(LoginView theView,SingViewModel theModel){
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
			SingViewModel signupmodel=new SingViewModel();
			//controller eklencekmi eklenmicekmi sonra kontrol et
			SingViewController controller=new SingViewController(signup,signupmodel);
			signup.setVisible(true);
			theView.setVisible(false);
		}
		
	}
	
	class sýgnýnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int id=theView.getTxt_Usernamer();
			int pw=theView.getTxt_passwordField();
			People p1;
			//boþ girilmesine karsýn try eklenmeli
			if(theModel.check(id, pw)==true){
				p1=theModel.checkpers(id, pw);
				theModel.setPcur(p1);
				System.out.println(theModel.getPcur().getPeopleName());
				System.out.println(p1);
				
				SingViewModel svm= new SingViewModel();
				svm=theModel;
				MenuView menu=new MenuView();
				MenuController contmenu=new MenuController(menu,svm);
				menu.setVisible(true);
				theView.setVisible(false);
			}
			else{
				JOptionPane.showMessageDialog(null, "dj sakir!");
			}
		}
		
	}
}
