package com.collectionEx;
import java.util.*;
class Cricketer3 implements Comparable<Cricketer3>{
	private int jerNo;
	private String name;
	//private String message;
	public Cricketer3(int jerNo, String name) {
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
	@Override
	public int compareTo(Cricketer3 o) {
		// TODO Auto-generated method stub
		if(jerNo>o.jerNo)
			return 1;
		else if(jerNo<o.jerNo)
			return -1;
		else
			return 0;
	}
	
}
public class PriorityQueueEx {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PriorityQueue<Cricketer3> stk=new PriorityQueue<Cricketer3>();
		System.out.println("Initial size: "+stk.size());
		for(int i=0;i<4;i++) {
			stk.add(new Cricketer3(scan.nextInt(),scan.nextLine()));
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		Iterator<Cricketer3> itr=stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(stk.peek());
		stk.offer(new Cricketer3(6,"dupe"));
		System.out.println(stk);
		System.out.println();
		System.out.println(stk.offer(new Cricketer3(6,"dupe")));
		System.out.println(stk);
		System.out.println();
		System.out.println("Final size: "+stk.size());
		scan.close();
	}
}