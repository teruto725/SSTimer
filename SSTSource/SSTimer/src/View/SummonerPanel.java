package View;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class SummonerPanel extends JPanel{
	private String role;
	private ArrayList<SSImage> ssImageList;
	private SSCombo sc1,sc2;
	private SSButton sb1,sb2;
	private String join;//所属しているpanel
	public SummonerPanel(String role,ArrayList<SSImage> ssImageList){//startPanel用
		this.role = role;
		this.ssImageList = ssImageList;
		join = "sp";
		setSize(150,600);
		JLabel l = new JLabel(role);
		l.setFont(new Font("Arial", Font.PLAIN, 28));
		sc1 = new SSCombo(ssImageList);
		sc2 = new SSCombo(ssImageList);
		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
	    setBorder(border);
		add(l);
		add(sc1);
		add(sc2);
	}

	public SummonerPanel(String role,SSButton[] sblist){//MainPanel用
		join = "mp";
		this.role = role;
		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
	    setBorder(border);
		JLabel l = new JLabel(role);
		l.setFont(new Font("Arial", Font.PLAIN, 28));
		add(l);
		add(sblist[0]);
		add(sblist[1]);
	}


	public String[] getSS(){
		String[] ss = new String[2];
		if(join.equals("sp")){
			ss[0]= sc1.toString();
			ss[1]=sc2.toString();
		}
		else if(join.equals("mp")){
			ss[0]=sb1.toString();
			ss[1]=sb2.toString();
		}
		else {
			System.out.println(join);
		}
		return ss ;

	}

}
