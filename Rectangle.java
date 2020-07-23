package com.rigthstroke.java;
import java.util.*;
public class Rectangle {
	public static void Area() {
		System.out.println("The formula for Area of Rectangle is Length*Breadth ");
	}
	public static void Area(double l, double b) {
		System.out.println("For Example"+" Length = "+l+" and Breadth = "+b+" then Area = "+l*b);
	}
	public static void main(String a[]) {
		Scanner scan = new Scanner (System.in);
		double L = scan.nextDouble();
		double B = scan.nextDouble();
		Rectangle.Area();
		Rectangle.Area(L,B);
		scan.close();
	}

}
