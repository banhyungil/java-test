package map_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap<String, Integer>();
		map.put("a",3);
		map.put("b",12);
		map.put("c",54);
		map.put("d",51);
		map.put("e",8);
		
		Set<String> keys = map.keySet();		//key는 중복값이 허용되지 않기 때문에 set형태이다
		
		//1.key 출력
		for(String key : keys) {
			System.out.println(key);
		}
		System.out.println("");
		
		map.remove("e");		//마지막 제거
		
		keys.forEach(key -> System.out.println(key));
		System.out.println("");
		
		//2.value 출력
		Collection<Integer> values = map.values();
		values.forEach(value -> System.out.println(value));
		System.out.println("");
		
		keys.forEach(key -> System.out.println(map.get(key)));
		
		//3.Entry 출력
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.print("key: " + entry.getKey());
			System.out.println(", Value: " + entry.getValue());
		}
		
		System.out.println("");
		System.out.println("");
		
		map.forEach((key,value) ->{
			System.out.print("key : " + key);
			System.out.println(", Value : " + value);
		});
		
		//4.value값에 따른 정렬
		List<String> list = new ArrayList();
		//4-1 list에 keyset을 넣는다
		list.addAll(map.keySet());
		
		//4-2 Collections에 sort를 활용, 정렬 인터페이스를 구현한다. 
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				
				return ((Comparable)v2).compareTo(v1);
			}
		});
		
		Collections.reverse(list);		//정렬기준 뒤바꾸기.
		
		for(String s : list) {
			System.out.println("key : " + s + " value : " + map.get(s));  	//cdba
		}
		
	}

}
