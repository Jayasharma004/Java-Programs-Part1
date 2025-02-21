package com.problems;

interface I1
{
	public void im1();
	public void im2();
}

class Car implements I1
{
	int x=10;
	public void drive()
	{
		System.out.println("DRIVE CAR.............");
	}
	public void fly()
	{
		System.out.println("FLY CAR.................");
	}

	@Override
	public void im1() {
		System.out.println("inside class Car : im1");
	}

	@Override
	public void im2() {
		System.out.println("inside class Car : im2");
	}
}

class Merc extends Car{
	int x=20;
	public void drive()
	{
		super.drive();
		System.out.println("drive Merc..............");
	}
	public void fly()
	{
		super.fly();
		System.out.println("FLY Merc.................");
	}
}
public class experiments1 {
	public static void main(String[] args) {
		/*Car carObj = new Merc(); //Reference of parent class & object of child class
		carObj.drive(); //will call Merc drive() method as it is over-ridden
		System.out.println(carObj.x); //will print value of x from parent class as the variables are not over-ridden

		carObj = new Car(); //Parent class object
		carObj.drive(); //will call the drive() method of parent class

		Merc mercobj = new Merc();
		mercobj.drive();//will call drive method of child class
		mercobj.fly();//will call drive method of child class*/

		I1 obj;
		obj = new Car();
		obj.im1();
		obj.im2();
	}
}


