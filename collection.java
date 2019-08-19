package thiru_ece;

import java.util.*;

public class collection {

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(6);
		s.add(8);
		s.add(5);
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
