package View;

import java.awt.Font;

public class Timer extends Thread {
	SSButton sb;
	int ct;
	public Timer(SSButton sb,int ct){
		this.sb=sb;
		this.ct=ct;
	}
	@SuppressWarnings("deprecation")
	public void run(){

		sb.setFont(new Font("Arial", Font.PLAIN, 28));
		//ImageIcon ctIcon = new ImageIcon("./image/ct"+sb.getName().substring(0,1)+".png");
		//sb.setIcon(ctIcon);
		sb.setEnabled(false);
		for(int i=ct-1;i>=0;i=i-1){
			try {
				sb.setText(String.valueOf(i));
				sb.repaint();
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("eoor");
				e.printStackTrace();
			}
		}
		sb.setText(null);
		sb.setEnabled(true);
		sb.setIcon(sb.getIcon(sb.getName()));
		sb.setTimer(ct);
		stop();
		interrupt();
	}
}
