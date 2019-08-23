package generic_test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGeneric mg = new MyGeneric("ab",1);		//제네릭의 생략, constantpool 사용
		
		List list = new ArrayList<String>();
		
		list.add("aa");
		list.add("bb");
		list.forEach(str -> System.out.println(str));		
		//mg.printNumberArrayList(list);					//타입캐스팅이 맞지 않기때문에 되지 않는다.
		
		list = new ArrayList<Integer>();					//Generic을 생략하였기 때문에 List는 들어오는 값에 따라 컴파일시간에 타입이 캐스팅된다.
		
		list.add(1);
		list.add(2);
		list.forEach(num -> System.out.println(num));
		mg.printNumberArrayList((ArrayList<Integer>)list);	//타입캐스팅을 해준다. list 타입은 컴파일 시간에 결정되기 때문에 캐스팅 필요.
	}

}
