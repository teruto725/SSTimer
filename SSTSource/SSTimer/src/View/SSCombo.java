package View;

import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JComboBox;

public class SSCombo extends JComboBox<Icon>{
	public ArrayList<SSImage> ssImageList;
	public SSCombo(ArrayList<SSImage> ssImageList){
		this.ssImageList = ssImageList;
		for(SSImage ss:this.ssImageList){
			addItem(ss.getIcon());
		}
	}
	public String toString(){
		Icon i = (Icon) getSelectedItem();
		for(SSImage ss: ssImageList){
			if(ss.getIcon().equals(i)){
				return ss.getName();
			}
		}
		System.out.println("ERROR");
		return "a";

	}

}

