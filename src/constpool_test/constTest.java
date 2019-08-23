package constpool_test;

public class constTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aa";
		String s2 = "aa";
			
		System.out.println(s1 == s2 );		//true "aa"는 constant pool에 위차하기 때문
		
		String ss1 = new String("aa");		
		String ss2 = new String("aa");
		System.out.println(ss1 == ss2);		//false 각각의 값은 Heap에 저장되어 있기 때문에 서로다른 객체이다.
		
		//Wrapper Class도 동일하다.(Integer, Double ...)
		
		//equals와 HashCode;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(ss1.hashCode());		//hashcode를 내용기반으로 override하였기 때문에 같다.
		System.out.println(ss2.hashCode());
	}

}
