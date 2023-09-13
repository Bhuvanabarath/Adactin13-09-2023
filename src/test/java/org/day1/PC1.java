package org.day1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class PC1 {
	public static void main(String[] args) {
		//Enumerator
		Vector<String> v=new Vector();
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("e");
		System.out.println(v);
		Enumeration<String> elements = v.elements();
		while (elements.hasMoreElements()) {
			String string =  elements.nextElement();
			System.out.println(string);
			
		}
		System.out.println("******************");
		//Iterator
		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
	
		if(string=="c") 
			iterator.remove();
		}
		System.out.println(v);
		System.out.println("************************");
		
		//ListIterator
		
		List<String> l=new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		System.out.println(l);
		ListIterator<String> listIterator = l.listIterator();
		while (listIterator.hasNext()) {
			String string =  listIterator.next();
			System.out.println(string);
			if(string=="b")
				listIterator.add("b");
		
		}
		System.out.println(l);
		System.out.println("Reverse Iteration");
		while (listIterator.hasPrevious()) {
			String string = listIterator.previous();
			System.out.println(string);
			if(string=="e")
				listIterator.remove();
		
		}System.out.println(l);
		System.out.println("****____**");
		ListIterator<String> listIterator2 = l.listIterator(3);
		while (listIterator2.hasNext()) {
			String string = (String) listIterator2.next();
			System.out.println(string);
			
		}
	}
}
