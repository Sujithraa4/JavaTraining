package com.collectionEx;
import java.util.*;
class Cricketer2{
	private int jerNo;
	private String name;
	//private String message;
	public Cricketer2(int jerNo, String name) {
		this.jerNo = jerNo;
		this.name = name;
	}
	public int getJerNo() {
		return jerNo;
	}
	public void setJerNo(int jerNo) {
		this.jerNo = jerNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cricketer [jerNo=" + jerNo + ", name=" + name + "]";
	}
	
}
public class StackEx {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Stack<Cricketer2> stk=new Stack<Cricketer2>();
		System.out.println("Initial size: "+stk.size());
		for(int i=0;i<4;i++) {
			stk.push(new Cricketer2(scan.nextInt(),scan.nextLine()));
		}
		System.out.println();
		System.out.println(stk.pop());
		System.out.println();
		System.out.println();
		System.out.println(stk.pop());
		System.out.println();
		Iterator<Cricketer2> itr=stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Final size: "+stk.size());
		scan.close();
	}
}