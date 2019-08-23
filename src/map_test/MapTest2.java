package map_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("a",3);
		map.put("b",12);
		map.put("c",54);
		map.put("d",51);
		map.put("e",8);
		
		//key 출력
		Set<String> keys = map.keySet(); 		//key는 유일값만 가질 수 있음, List와 Set은 Iterable을 구현하였기 때문에 foreach 가능
		for(String key : keys) {
			System.out.print(key + " ");
		}
		System.out.println("");
		
		map.remove("e");			//e삭제
		keys.forEach(key -> System.out.print(key + " "));
		
		System.out.println("");
		
		//value 출력
		Collection values = map.values();
		values.forEach(value -> System.out.print(value + " "));
		System.out.println("");
		
		//entry 출력
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		entries.forEach(entry -> System.out.print(entry.toString() + " "));
		
		List list = new ArrayList();
		list.addAll(map.keySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				return ((Comparable)v1).compareTo(v2);
			}
		});
		
		Collections.reverse(list); 		//오름차순, 내림차순
		list.forEach(key -> System.out.println("key : " + key + " value : " + map.get(key)));
	}

}
