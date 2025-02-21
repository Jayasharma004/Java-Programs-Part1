package com.practiceSession;

import java.util.*;

public class Comparator_P2_SortpeopleHeights {

	class Person
	{
		String name;
		int height;
		
		public Person(String name, int height) {
			this.name = name;
			this.height = height;
		}
		
		@Override
		public String toString() {
			return "Person{" +
					       "name='" + name + '\'' +
					       ", height=" + height +
					       '}';
		}
	}
	
	public String[] sortPeople(String[] names, int[] heights)
	{
		List<Person> personList = new ArrayList<>();
		for(int i=0; i< names.length; i++)
		{
			personList.add(new Person(names[i],heights[i]));
		}
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.height - o2.height;
			}
		});
		
		String[] result = new String[names.length];
		for(int i=0; i<personList.size();i++)
		{
			result[i] = personList.get(i).name;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] names = {"Mary", "John", "Emma"};
		int[] heights = {180, 165, 170};
		String[] resultNames = new Comparator_P2_SortpeopleHeights().sortPeople(names, heights);
		System.out.println(Arrays.toString(resultNames));
	}
}
