/**
 * 
 */
package Assignment7;
import java.util.*;
/**
 * Testing methods of circle and cylinder
 * @author ssampath
 * Date 02/05/2023
 */
class Circle{
	private double radius=1.0;
	private String color="red";
	public Circle(){
		radius=4;
		color="purple";
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius, String color) {
		this.radius=radius;
		this.color=color;
	}
	public double getRadius() {
		return(radius);
	}
	public String getColor() {
		return color;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public double getArea() {
		return(Math.PI*getRadius()*getRadius());
	}
	public String toString() {
		return("Circle[radius="+getRadius()+", color="+getColor()+", Area:"+getArea()+"]");
	}
}

class Cylinder extends Circle{
	private double height=1.0;
	public Cylinder(){
		super(4,"purple");
		this.height=8;
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
	}
	public Cylinder(double radius, double height, String color) {
		super(radius,color);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getVolume() {
		return(super.getArea()*height);
	}
}
public class CircleDriver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("==============Super class default constructor(circle)================");
		Circle c1=new Circle();
		System.out.println(c1);
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.println("Enter radius of circle: ");
		Circle c2=new Circle(scan.nextDouble());
		System.out.println("=============Super class 1 parameter constructor(circle)==============");
		System.out.println(c2);
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.println("Enter radius and color of circle: ");
		Circle c3=new Circle(scan.nextDouble(),scan.nextLine());
		System.out.println("=============Super class 2 parameter constructor(circle)==============");
		System.out.println(c3);
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.println("Enter radius of circle:");
		c3.setRadius(scan.nextDouble());
		System.out.println("===================Super class  setter radi (circle)===================");
		System.out.println(c3);
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.println("Enter color of circle:");
		c3.setColor(scan.next());
		System.out.println("===================Super class setter color (circle)==================");
		System.out.println(c3);
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.println("==============Sub class default constructor(cylinder)================");
		Cylinder cy1=new Cylinder();
		System.out.println("Circle[radius="+cy1.getRadius()+", color="+cy1.getColor()+", Height:"+cy1.getHeight()+", Area:"+cy1.getArea()+", Volome:"+cy1.getVolume()+"]");
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.print("Enter radius of cylinder: ");
		Cylinder cy2=new Cylinder(scan.nextDouble());
		System.out.println("=============Sub class 1 parameter constructor(cylinder)==============");
		System.out.println("Circle[radius="+cy2.getRadius()+", color="+cy2.getColor()+", Height:"+cy2.getHeight()+", Area:"+cy2.getArea()+", Volome:"+cy2.getVolume()+"]");
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.print("Enter radius, height of cylinder: ");
		Cylinder cy4=new Cylinder(scan.nextDouble(),scan.nextDouble());
		System.out.println("=============Sub class 2 parameter constructor(cylinder)==============");
		System.out.println("Circle[radius="+cy4.getRadius()+", color="+cy4.getColor()+", Height:"+cy4.getHeight()+", Area:"+cy4.getArea()+", Volome:"+cy4.getVolume()+"]");
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.print("Enter radius, height and color of cylinder: ");
		Cylinder cy3=new Cylinder(scan.nextDouble(),scan.nextDouble(),scan.next());
		System.out.println("=============Sub class 2 parameter constructor(cylinder)==============");
		System.out.println("Circle[radius="+cy3.getRadius()+", color="+cy3.getColor()+", Height:"+cy3.getHeight()+", Area:"+cy3.getArea()+", Volome:"+cy3.getVolume()+"]");
		System.out.println("======================================================================");
		System.out.println();
		
		System.out.print("Enter height of cylinder: ");
		cy3.setHeight(scan.nextDouble());
		System.out.println("=============Sub class setter height(cylinder)==============");
		System.out.println("Circle[radius="+cy3.getRadius()+", color="+cy3.getColor()+", Height:"+cy3.getHeight()+", Area:"+cy3.getArea()+", Volome:"+cy3.getVolume()+"]");
		System.out.println("======================================================================");
		System.out.println();
				
		scan.close();
	}

}
