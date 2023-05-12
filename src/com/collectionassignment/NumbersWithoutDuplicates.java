package com.collectionassignment;
/**
 * To print the numbers without duplicates,average,min&max and even numbers
 * @author Sujithraa
 * Date 11/05/2023
 */
import java.util.*;

class Values implements Comparable<Values>{
	private int number;

	public Values(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int compareTo(Values o) {
		if (number>o.number)
			return 1;
		else if(number<o.number)
			return -1;
		else
			return 0;
	}

}
	
public class NumbersWithoutDuplicates {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		TreeSet<Integer> num=new TreeSet<Integer>();
		System.out.println("Enter the number of elements:");
		int n= scan.nextInt();
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++) {
			Values number=new Values(scan.nextInt());
			num.add(number.getNumber());
		}
		System.out.println("The numbers without duplicates:");
		Iterator<Integer> itr1=num.iterator();
		int sum=0;
				while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
				System.out.println("The even numbers are ");
		for(int t:num) {
			sum=sum+t;
			if(t%2==0)
				System.out.println(t+" ");
		}
		System.out.println("The average of the numbers is "+(sum/num.size()));
		System.out.println("The maximum number:"+num.last());
		System.out.println("The minimum number:"+num.first());
		scan.close();
	}
}
