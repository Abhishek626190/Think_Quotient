package com.collection_assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<>();
		str.add("Monday");
		str.add("Tuesday");
		str.add("Wednesday");
		str.add("Thursday");
		str.add("Friday");
		str.add("Saturday");
		str.add("Sunday");
		System.out.println(str);
		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			if (itr.next().length() > 7) {
				itr.remove();
			}
		}

		System.out.println(str);

	}

}
