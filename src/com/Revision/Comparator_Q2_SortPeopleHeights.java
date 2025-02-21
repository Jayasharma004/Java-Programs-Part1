package com.Revision;


import java.util.*;
// https://leetcode.com/problems/sort-the-people/description/
public class Comparator_Q2_SortPeopleHeights {
	
	class Person {
		String name;
		int height;
		
		public Person(String name, int height) {
			this.name = name;
			this.height = height;
		}
		
		public String getName() {
			return name;
		}
		
		public int getHeight() {
			return height;
		}
		
		@Override
		public String toString() {
			return "Person{" +
					       "name='" + name + '\'' +
					       ", height=" + height +
					       '}';
		}
	}
	
	public String[] sortPeople(String[] names, int[] heights) {
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < heights.length; i++) {
			persons.add(new Person(names[i], heights[i]));
		}
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.height - o1.height;
			}
		});
		
		String[] result = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			result[i] = persons.get(i).getName();
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] names = {"Mary", "John", "Emma"};
		int[] heights = {180, 165, 170};
		String[] resultNames = new Comparator_Q2_SortPeopleHeights().sortPeople(names, heights);
		System.out.println(Arrays.toString(resultNames));
	}
	
}
