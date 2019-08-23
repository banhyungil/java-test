package generic_test;

import java.util.ArrayList;

public class MyGeneric<T extends String,S extends Integer> {
	T name;
	S age;
	
	public MyGeneric(T name, S age) {
		this.name = name;
		this.age = age;
	}
	
	public void printNumberArrayList(ArrayList<? extends Number> list) {
		list.forEach(num -> System.out.print(num + " "));
		System.out.println("");
	}

}
