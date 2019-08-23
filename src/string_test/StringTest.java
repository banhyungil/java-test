package string_test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "";
		StringBuffer sb = new StringBuffer(" ");
		
		System.out.println(sb.toString());
		for(int i=1;i < 100000; ++i) {		//실행속도 비교
			//s += 1;				// 동일코드 -> s = new StringBuffer(s).append(1).toString();
			sb.append("a");		
		}
		
	}

}
