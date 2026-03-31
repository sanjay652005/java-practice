package collectionOfFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.HashMap;


public class Student {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(0,100);
		list.remove(1);
//		list.clear();
		
		System.out.println(list);
		
		ArrayList<Integer> listOne=new ArrayList(list);
		listOne.addAll(list);
		System.out.println(listOne);
		
		listOne.stream().forEach(i -> System.out.println(i));
		
		LinkedList<String> s=new LinkedList<String>();
		s.add("anu");
		s.addFirst("mani");
		s.addLast("saranya");
		s.add("anu");
		System.out.println(s);
		
		
		// duplicates wont allow
		// it doesnot follow the order
		HashSet<Integer> set=new HashSet<Integer>(listOne);
		set.add(10);
		set.add(20);
		System.out.println(set);
		
		//TreeSet//
//		TreeSet
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(111);
		tree.add(231);
		tree.add(112);
		System.out.println(tree);
		
//		Stack
		
		Stack<Integer> st=new Stack();
		st.push(12);
		st.push(14);
		st.stream().forEach(i->System.out.println(i));
		System.out.println(st);
		st.pop();	
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.isEmpty());
		
//		st.pop();
		if(!st.isEmpty()) {
			st.pop();
		}
		
		HashMap<Integer,String> studentmap=new HashMap();
		studentmap.put(1, "anu");
		studentmap.put(2, "mani");
		studentmap.put(1, "guna");
		studentmap.put(null,"sara");
		System.out.println(studentmap);
		System.out.println(studentmap.get(2));
		System.out.println(studentmap.containsKey(3));
		
		
		
		
		}
	
	


	}
