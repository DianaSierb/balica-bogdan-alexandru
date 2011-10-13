
public class Soare {
	private static Soare instanta;
	
	private Soare(){ }
	
	public static Soare getInstance(){
	
		if(instanta == null){
			instanta = new Soare();
		}
		return instanta;
	}
	
public static void main(String args[]){
	Soare s = Soare.getInstance();
	System.out.println(s);
	}
}