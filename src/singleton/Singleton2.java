package singleton;

public class Singleton2 {
	
	static Singleton2 instance;
	private Singleton2() {
		
	}
	
	public static Singleton2 getInstance() {
		
		if(instance == null){
			instance = new Singleton2();
		}
		
		return instance;
	}
}
