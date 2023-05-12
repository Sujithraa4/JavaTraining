package com.collectionEx;
import java.util.*;
class Employee implements Comparable<Employee>{
	private String id;
	private String name;
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return(name.compareTo(o.name));
	}
	
}
public class EmployeeCollections {

	public static void main(String[] args) {
		ArrayList<Employee> arr=new ArrayList<Employee>();
		Employee e1=new Employee("SS001","suji");
		Employee e2=new Employee("SS002","jade");
		arr.add(e1);
		arr.add(e2);
		Collections.sort(arr);
		Iterator<Employee> itr=arr.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
