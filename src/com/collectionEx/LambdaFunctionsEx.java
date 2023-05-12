/**
 * 
 */
package com.collectionEx;
@FunctionalInterface
interface Message{
	public abstract int add(int a,int b);
}
public class LambdaFunctionsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m=(a,b)->(a+b);
		Message m2=(a,b)->(a*b);
		System.out.println(m.add(7,8));
		System.out.println(m2.add(7,8));
	}

}
