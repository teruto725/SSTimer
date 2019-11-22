package View;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SSButton extends JButton {
	private String sname;
	private Timer timer;
	private Icon icon;
	private int ct;
	public SSButton(String sname){
		this.sname = sname;
		icon = getIcon(sname);
		//setPreferredSize(new Dimension(100, 100));
		setIcon(icon);
	}
	public Icon getIcon(String name){
		ImageIcon icon = new ImageIcon("./image/"+name+".png");
		return icon;
	}
	public String getName(){
		return sname;
	}
	public void use(){
		timer.start();

	}
	public void setTimer(int ct){
		this.ct = ct;
		timer = new Timer(this,ct);
	}
}
