/**
 * 
 */
package com.collectionassignment;
import java.util.*;
/**
 * @author ssampath
 *
 */
public class MarkAllocation {
	public static void greater(HashMap<String,Integer> data,Stack<String> stk) {
		for(Map.Entry<String, Integer> value:data.entrySet() ) {
			if(value.getValue()>75)
				stk.push(value.getKey());
		}
	}
	public static void display(Stack<String> stk){
		while(!(stk.isEmpty()))
			System.out.println(stk.pop());
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashMap<String,Integer> data=new HashMap<String,Integer>();
		
		
		Stack<String> stk=new Stack<String>();
		for(int i=0;i<6;i++) {
			data.put(scan.next(), scan.nextInt());
		}
		greater(data,stk);
		display(stk);
		scan.close();
	}

}
