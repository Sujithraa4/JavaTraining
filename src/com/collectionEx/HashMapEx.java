package com.collectionEx;
import java.util.*;
class Cricketer4 implements Comparable<Cricketer4>{
	private int jerNo;
	private String name;
	//private String message;
	public Cricketer4(int jerNo) {
		this.jerNo = jerNo;
		
	}
	public Cricketer4(String name) {
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
	
	/*
	 * public int compareTo(Cricketer4 o) { // TODO Auto-generated method stub
	 * if(jerNo>o.jerNo) return 1; else if(jerNo<o.jerNo) return -1; else return 0;
	 * }
	 */
	
}
public class HashMapEx {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashMap<Integer,String> stk=new HashMap<Integer,String>();
		System.out.println("Initial size: "+stk.size());
	
		Cricketer1 c1=new Cricketer1(71,"Watson");
		Cricketer1 c2=new Cricketer1(7,"Dhoni");
		Cricketer1 c3=new Cricketer1(4,"Suji");
		Cricketer1 c4=new Cricketer1(18,"Kholi");
		Cricketer1 c5=new Cricketer1(17,"Dupe");
		stk.put(c1.getJerNo(),c1.getName());
		stk.put(c2.getJerNo(),c2.getName());
		stk.put(c3.getJerNo(),c3.getName());
		stk.put(c4.getJerNo(),c4.getName());
		stk.put(c5.getJerNo(),c5.getName());
		System.out.println();
			
	
		System.out.println(stk.keySet());
		System.out.println(stk.values());
		System.out.println(stk.entrySet());
		/*
		 * Iterator<Cricketer4,Cricketer> itr=stk.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		/*
		 * System.out.println(stk); System.out.println();
		 * 
		 * System.out.println(stk); System.out.println();
		 */
		System.out.println("Final size: "+stk.size());
		scan.close();
	}
}