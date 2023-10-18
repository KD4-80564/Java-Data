/*Create a list of strings. Find the string with highest length using Collections.max().*/

package com.sunbeam;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class lString
{
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		
		c.add("Nilesh");
		c.add("Prashant");
		c.add("Nitin");
		c.add("Rahul");
		c.add("Sarang");
		c.add("Nilesh");
		c.add("Vishal");
		c.add("Pratik");
		class StringComparator implements Comparator<String> {
			@Override
			public int compare( String s1 ,String s2) {
				int diff = s1.length()-s2.length();
				return diff;
			}
		
}
		StringComparator sc=new StringComparator();

		//Collections.max(c,sc);
		System.out.println(Collections.max(c,sc));
}
	}
