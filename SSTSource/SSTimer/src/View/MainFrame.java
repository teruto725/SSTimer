package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.Game;
import Model.SS;

public class MainFrame extends JFrame {
	Game g;
	JPanel mp;
	SummonerPanel[] spList = new SummonerPanel[5];
	public MainFrame(Game g){
		this.g=g;
		setTitle("ゲーム中");
		setBounds(400,10,600,650);
		setVisible(true);
		setLayout(new BorderLayout() );
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		mp = new JPanel();
		mp.setBackground(Color.WHITE);
		mp.setLayout(new GridLayout(5, 1));
		add(mp,BorderLayout.CENTER);
	}

	public void createSP(int i,SS[] ss){
		SSButton[] sblist = new SSButton[2];
		sblist[0] = new SSButton(ss[0].getName());
		sblist[0].setTimer(ss[0].getCoolTime());
		sblist[0].addActionListener(g.mfAction);
		sblist[1] = new SSButton(ss[1].getName());
		sblist[1].setTimer(ss[1].getCoolTime());
		sblist[1].addActionListener(g.mfAction);

		switch (i){
		case 0:
			spList[i]=new SummonerPanel(" TOP ", sblist);
			break;
		case 1:
			spList[i]=new SummonerPanel(" JG  ", sblist);
			break;
		case 2:
			spList[i]=new SummonerPanel(" MID ", sblist);
			break;
		case 3:
			spList[i]=new SummonerPanel(" ADC ", sblist);
			break;
		case 4:
			spList[i]=new SummonerPanel(" SUP ", sblist);
			break;
		}
		System.out.println(i);
		mp.add(spList[i]);
	}
}
