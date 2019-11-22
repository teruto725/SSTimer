package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Model.Summoner;
import View.MainFrame;
import View.SSButton;
import View.StartFrame;

public class Game{
	Summoner[] sList = new Summoner[5];
	StartFrame sf;
	MainFrame mf;
	public Game(){
		sf = new StartFrame(this);
		sList[0] = new Summoner("top");
		sList[1] = new Summoner("jg");
		sList[2] = new Summoner("mid");
		sList[3] = new Summoner("adc");
		sList[4] = new Summoner("sup");
	}
	public ActionListener sfAction = new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof JButton){
				JButton b = (JButton) e.getSource();

				if(b.getText()=="Start!"){//StartButtonが押されたとき
					for(int i = 0;i<5;i++){
						sList[i].setSS(sf.getSummonerPanel(i).getSS());
					}
					createMF();
					for(int i=0;i<5;i++){
						mf.createSP(i, sList[i].getSS());//spの生成
						for(int j=0;j<2;j++){

						}
					}
				}
			}
		}
	};
	public ActionListener mfAction = new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof SSButton){
				SSButton sb = (SSButton) e.getSource();
				sb.use();
			}
		}
	};
	private void  createMF(){
		mf = new MainFrame(this);
	}
}
