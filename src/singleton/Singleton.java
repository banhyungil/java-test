package singleton;

public class Singleton {		//하나의 객체만 생성하도록 하는 패턴
	
	private static Singleton instance;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
