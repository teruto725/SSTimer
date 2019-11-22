package Model;

public class Summoner {
	private String role;
	private SS s1;
	private SS s2;

	public Summoner(String role){
		this.role = role ;
	}
	public void setSS(String[] name){
	s1 = new SS(name[0]);
	s2 = new SS(name[1]);
	}
	public String getRole(){
		return role;
	}
	public String[] getSSName(){
		String[] ss = new String[2];
		ss[0] = s1.getName();
		ss[1] = s2.getName();
		return ss;
	}
	public SS[] getSS(){
		SS[] ss = {s1,s2};
		return ss;

	}
	public String toString(){
		return (role+" :"+s1.name+","+s2.name);
	}
}
