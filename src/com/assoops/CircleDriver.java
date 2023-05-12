/**
 * 
 */
package com.assoops;
import java.util.*;
/**
 * Accessing all the methods
 * @author ssampath
 * Date 27/04/2023
 */
class Circle{
	private double radius=1.0;
	private String color="Red";
	public Circle() {
		radius=2.0;
		color="Blue";
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color) {
		this.radius=radius;
		this.color=color;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public double getArea() {
		return(Math.PI*getRadius()*getRadius());
	}
	public String toString() {
		return("Circle[Radius: "+radius+" | Color: "+color+" | Area: "+getArea()+"]");
	}
	
}
public class CircleDriver {
	public static void main(String[] args) {
		Circle circle1=new Circle();
		Scanner scan=new Scanner(System.in);
		System.out.println("=========Circle1 Area default constructor=========");
		System.out.println(circle1);
		System.out.println("==================================================");
		
		System.out.println();
		System.out.println("Radius: ");
		Circle circle2=new Circle(scan.nextDouble());
		System.out.println("=========Circle2 Area 1 parameterised constructor=========");
		System.out.println(circle2);
		System.out.println("==================================================");
		
		System.out.println();
		System.out.println("Radius & Color: ");
		Circle circle3=new Circle(scan.nextDouble(),scan.next());
		System.out.println("=========Circle2 Area 2 parameterised constructor=========");
		System.out.println(circle3);
		System.out.println("==================================================");
		
		System.out.println();
		System.out.println("Radius & Color: ");
		circle1.setRadius(scan.nextDouble());
		circle1.setColor(scan.next());
		System.out.println("=========Circle2 Area - setter=========");
		System.out.println(circle1);
		System.out.println("==================================================");
		
		System.out.println();
		System.out.println("=========Circle2 Area - getter=========");
		System.out.println("[Radius: "+circle1.getRadius()+" | Color: "+circle1.getColor()+" | Area: "+circle1.getArea()+"]");
		System.out.println("==================================================");
		scan.close();		
		
	}

}
