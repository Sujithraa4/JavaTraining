package com.collectionEx;
import java.util.*;
class Cricketer{
	private int jerNo;
	private String name;
	//private String message;
	public Cricketer(int jerNo, String name) {
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
public class LinkedListEx {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		LinkedList<Cricketer> lin=new LinkedList<Cricketer>();
		System.out.println("Initial size: "+lin.size());
		for(int i=0;i<4;i++) {
			lin.add(new Cricketer(scan.nextInt(),scan.nextLine()));
		}
		Iterator<Cricketer> itr=lin.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Final size: "+lin.size());
		scan.close();
	}

}
