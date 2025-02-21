package com.problems;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class StackExample {
	
	static class LengthComparator implements Comparator<String> {
		
		@Override
		public int compare(String o1, String o2) {
			return o1.length() - o2.length();
		}
	}
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("apple");
		stack.push("bye");
		stack.push("date");
		stack.push("adidas");
		stack.push("hello");
		stack.push("book");
		stack.push("nike");
		
		Queue<String> queue = new LinkedList<>(stack);
		System.out.println(queue);
		
		List<String> list = new ArrayList<>(stack);
		list.sort(new LengthComparator());
		System.out.println("sorted list : " + list);
		
		Queue<String> pq = new PriorityQueue<String>(new LengthComparator());
		pq.addAll(stack);
		
		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
		
	}
}
