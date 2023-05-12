/**
 * 
 */
package com.collectionEx;
import java.util.*;
/**
 * @author ssampath
 *
 */
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(6);
		arr1.add(9);
		arr1.add(10);
		arr1.add(14);
		System.out.println(arr1);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		//arr2.add(6);
		arr2.add(9);
		arr2.add(10);
		arr1.addAll(1,arr2);
		System.out.println(arr2);
		System.out.println(arr1);
		arr1.remove(1);
		System.out.println(arr1);
		//contains
		System.out.println(arr1.contains(6));
		System.out.println(arr1.containsAll(arr2));
		//sorting
		Collections.sort(arr1);
		System.out.println(arr1);
		//reverse sorting
		Collections.sort(arr1,Collections.reverseOrder());
		System.out.println(arr1);
		//reverse
		Collections.reverse(arr1);
		System.out.println(arr1);
		//sublist
		List<Integer> l=arr1.subList(2, 4);
		System.out.println(l);
		//for each
		for(Integer i:arr1) {
			System.out.print(i+" ");
		}
		//iterator
		Iterator<Integer> itr=arr1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
