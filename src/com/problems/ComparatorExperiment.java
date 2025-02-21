package com.problems;

import java.util.*;

public class ComparatorExperiment {
	class Person implements Comparable<Person> {
		String fname;
		String lname;

		int age;

		public Person(String fname, String lname, int age) {
			this.fname = fname;
			this.lname = lname;
			this.age = age;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Person person = (Person) o;
			return fname.equals(person.fname) && lname.equals(person.lname);
		}

		@Override
		public int hashCode() {
			return Objects.hash(fname, lname);
		}

		@Override
		public String toString() {
			return "Person{" + "fname='" + fname + '\'' + ", lname='" + lname + '\'' + ", age=" + age + '}';
		}

		@Override
		public int compareTo(Person o) {
			return this.fname.toCharArray()[0] - o.fname.toCharArray()[0];
		}
	}

	class AgeComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.age - o2.age;
		}
	}

	class AgeNameComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			return (o1.fname.length() + o1.age) - (o2.fname.length() + o2.age);
		}
	}


	public void testFunction() {
		Person person1 = new Person("Saurav", "Sharma", 10);
		Person person2 = new Person("Jaya1", "Sharma", 20);
		Person person3 = new Person("Jaya2", "Sharma", 9);
		Person person4 = new Person("Ram", "Sharma", 10);
//		System.out.println(person1);
//		System.out.println(person1.equals(person2));
//		System.out.println(person1 == person2);
//		System.out.println(person1.hashCode());
//		System.out.println(person2.hashCode());
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		System.out.println("initial list " + personList);
		Collections.sort(personList, new AgeComparator());


		System.out.println("sorted list " + personList);

	}

	public void experimentStrings() {
		String str = "Jaya";
		System.out.println("address before concat : " + str.hashCode());
		String str1 = "Sharma";
		String str2 = str.concat(str1);
		System.out.println("address after concat : " + str2.hashCode());
		str = str + str1;
		System.out.println("address after addition : " + str.hashCode());

		System.out.println("------------String Buffer-------------");
		StringBuffer strbf = new StringBuffer("Saurav");
		System.out.println("address before append : " + strbf.hashCode());
		strbf.append("Raj");
		System.out.println("address after append : " + strbf.hashCode());

		Person[] arr = new Person[8];
		String strnum = "12";
		System.out.println(Integer.valueOf(strnum));

	}

	public void sortIntegers() {
		Integer[] nums = new Integer[]{4, 2, 9, 1, 0, 6};
		String[] strings = new String[]{"hello", "bye", "hi"};
		List<Integer> numbers = new ArrayList<>(Arrays.asList(nums));
		List<String> stringList = new ArrayList<>(Arrays.asList(strings));
		System.out.println("Before sort: " + numbers);
		Collections.sort(numbers);
		System.out.println("After sort: " + numbers);
		Collections.sort(stringList);
		System.out.println("String list after sort " + stringList);

	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("bye");

		List<String> newList = list;
		ArrayList<String> deepCopyList = new ArrayList<>(10);
//		Collections.copy(deepCopyList, list);
//		deepCopyList.addAll(list);

//		System.out.println(list.hashCode());
//		System.out.println(newList.hashCode());
//		System.out.println(deepCopyList.hashCode());
//		new experiments().testFunction();
//		new experiments().experimentStrings();
		new ComparatorExperiment().sortIntegers();
		new ComparatorExperiment().testFunction();

	}
}
