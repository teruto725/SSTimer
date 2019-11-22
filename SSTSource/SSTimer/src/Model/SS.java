package Model;

public class SS {
	String name;
	int cooltime;
	public SS(String name) {
		this.name = name;
		cooltime = createCT(name);
	}
	private int createCT(String name){
		int ct=0;
		switch (name){
		case "Ghost": ct= 180; break;
		case "Heal": ct= 240; break;
		case "Barrier": ct= 180; break;
		case "Exhaust": ct= 210; break;
		case "Flash": ct= 300; break;
		case "Teleport": ct= 360; break;
		case "Cleans": ct= 210; break;
		case "Ignite": ct= 210; break;
		case "Smite": ct= 15; break;
		}
		return ct;

	}
	public String getName(){
		return name;
	}
	public int getCoolTime(){
		return cooltime;
	}
}
