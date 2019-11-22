package View;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class SSImage {
	private String name;
	private Icon icon;
	public SSImage(String name){
		this.name=name;
		this.setIcon((Icon)makeIcon(this.name));
	}
	private Icon makeIcon(String name){
		ImageIcon icon = new ImageIcon("./image/"+name+".png");
		return icon;
	}
	public String getName(){
		return name;
	}
	public Icon getIcon() {
		return icon;
	}
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

}
