package q_test;

import java.util.LinkedList;
import java.util.Queue;

public class QTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		while(!q.isEmpty())
			System.out.println(q.poll());
		
		String s = q.poll();		//null
		System.out.println(s);
		
	}

}
