package com.rightstroke.java;
import java.util.*;
public class Point {
	int d1;
	int d2;
	public Point()// default constructor
	{
		System.out.println("Default Constructor ");
	}
	public Point(int x,int y)//Parameterized constructor
	{
		System.out.println("Parameterized Constructor");
		d1 = x;
		d2 = y;
	}
	public Point(Point obj)//Copy Constructor 
	{
		System.out.println("Copy Constructor");
		d1=obj.d1;
		d2=obj.d2;
	}
	public void display() {
		System.out.println("data1" + ":"+d1);
		System.out.println("data1" + ":"+d2);
	}
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		Point P = new Point();
		P.display();
		Point P1 = new Point(x,y);
		P1.display();
		Point P2 = new Point(P1);
		P2.display();
		scan.close();
	}
}
