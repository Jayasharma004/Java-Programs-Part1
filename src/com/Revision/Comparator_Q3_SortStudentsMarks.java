package com.Revision;

import java.util.*;

public class Comparator_Q3_SortStudentsMarks {

	class Student
	{
		String name;
		int marks;
		
		public Student(String name, int marks) {
			this.name = name;
			this.marks = marks;
		}
		
		@Override
		public String toString() {
			return "Student{" +
					       "name='" + name + '\'' +
					       ", marks=" + marks +
					       '}';
		}
	}
	
	public String[] sortStudentByMarks(String[] names, int[] marks)
	{
		List<Student> listOfMarks = new ArrayList<>();
		for(int i=0;i< names.length; i++)
		{
			listOfMarks.add(new Student(names[i],marks[i]));
		}
		
		Collections.sort(listOfMarks, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.marks-o2.marks;
			}
		});
		String []result = new String[names.length];
		for(int i=0; i<listOfMarks.size(); i++)
		{
			result[i] = listOfMarks.get(i).name;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		String[] names = {"Abbie", "John", "Emma", "Stuwart"};
		int[] marks = {96, 67, 89,82};
		String []result = new Comparator_Q3_SortStudentsMarks().sortStudentByMarks(names,marks);
		System.out.println("result : "+ Arrays.toString(result));
	}
}
