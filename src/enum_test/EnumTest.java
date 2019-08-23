package enum_test;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DevType1 dt1 = DevType1.MOVILE;
		System.out.println(dt1);

		for(DevType1 str : DevType1.values()) {				//순서대로 출력
			System.out.println(str + ":" + str.ordinal());	//ordinal은 해당값의 선언 순서를 return(0부터 시작)ㅓ
		}
		
		for(DevType2 str : DevType2.values()) {
			System.out.println(str + ":" + str.getName());	//상수와 연관된 값을 return
		}

	}

	public enum DevType1 {
		MOVILE, WEB, SERVER
	}

	public enum DevType2{
		MOVILE("휴대폰"), WEB("웹"), SERVER("서버");

		final private String name;

		public String getName() {				//상수와 연관된 값을 꺼낼 때 사용
			return name;
		}

		private DevType2(String name){			//Enum 클래스는 값 대입시 해당 생성자가 실행됨
			this.name = name;
		}
		
	}
	
//	class DevType1{
//	    public static final Fruit MOVILE  = new Fruit();
//	    public static final Fruit WEB  = new Fruit();
//	    public static final Fruit SERVER = new Fruit();
//	    private Fruit(){}
//	}

}
