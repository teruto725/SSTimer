package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.Game;

public class StartFrame extends JFrame{
	private Game g;
	private ArrayList<SSImage> ssImageList = new ArrayList<SSImage>();//SSImageとnameのクラス
	private SummonerPanel[] sp;
	public StartFrame(Game g){
		this.g=g;
		setTitle("スタート画面");
		setBounds(10,10,400,650);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel p = new JPanel();
		//p.setBounds(0, 0, 1000, 1000);
		p.setBackground(Color.white);
		p.setLayout(new BorderLayout());
		add(p,BorderLayout.CENTER);

		JButton startButton = new JButton("Start!");

		startButton.setFont(new Font("Arial", Font.PLAIN, 28));
		startButton.addActionListener(g.sfAction);
		startButton.setPreferredSize(new Dimension( 100, 100));
		p.add(startButton,BorderLayout.PAGE_END);

		createSSImageList();


		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		p.add(mainPanel,BorderLayout.CENTER);
		mainPanel.setLayout(new GridLayout(5,1));
		repaint();
		revalidate();

		sp = new SummonerPanel[5] ;
		sp[0] = new SummonerPanel(" TOP ",ssImageList);
		sp[0].setBounds(10,0,30,300);
		sp[1] = new SummonerPanel(" JG  ",ssImageList);
		sp[1].setBounds(10,40,30,300);
		sp[2] = new SummonerPanel(" MID ",ssImageList);
		sp[2].setBounds(10,80,30,300);
		sp[3] = new SummonerPanel(" ADC ",ssImageList);
		sp[3].setBounds(10,120,30,300);
		sp[4] = new SummonerPanel(" SUP ",ssImageList);
		sp[4].setBounds(10,160,30,300);
		for(SummonerPanel s:sp){
			mainPanel.add(s);
		}
		repaint();
		revalidate();
	}

	private void createSSImageList(){//ImageList作成
		ssImageList.add( new SSImage("Ghost"));
		ssImageList.add(new SSImage("Heal"));
		ssImageList.add(new SSImage("Cleanse"));
		ssImageList.add(new SSImage("Exhaust"));
		ssImageList.add(new SSImage("Barrier"));
		ssImageList.add(new SSImage("Teleport"));
		ssImageList.add(new SSImage("Flash"));
		ssImageList.add(new SSImage("Ignite"));
		ssImageList.add(new SSImage("Smite"));
	}
	private void createSSB(JPanel choicePanel,String ssname){
		SSButton s = new SSButton(ssname);
		s.addActionListener(g.sfAction);
		choicePanel.add(s);
	}
	public SummonerPanel getSummonerPanel(int i){
		return sp[i];
	}

}
