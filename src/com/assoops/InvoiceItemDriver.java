package com.assoops;
import java.util.*;
/**
 * Accessing all the methods
 * @author ssampath
 * Date 27/04/2023
 */
class InvoiceItem{
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem() {
		id="ad234";
		desc="Rice";
		qty=4;
		unitPrice=150.5;
	}
	
	public InvoiceItem(String id,String desc,int qty,double unitPrice) {
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	
	public void setQty(int qty) {
		this.qty=qty;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}
	public String getId() {
		return(id);
	}
	public String getDesc() {
		return(desc);
	}
	public int getQty() {
		return(qty);
	}
	public  double getUnitPrice() {
		return(unitPrice);
	}
	public double getTotal() {
		return(qty*unitPrice);
	}
	public String toString() {
		return("InvoiceItem[id="+id+", desc="+desc+", qty="+qty+", unitPrice="+unitPrice+", total: "+getTotal()+" ]");
	}
}
public class InvoiceItemDriver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("---------Default constructor-------");
		InvoiceItem item1=new InvoiceItem();
		System.out.println(item1);
		System.out.println("------------------------------------");
		System.out.println();
		
		System.out.println("Enter Id, Description, Quantity, Price: ");
		InvoiceItem item2=new InvoiceItem(scan.nextLine(),scan.nextLine(),scan.nextInt(),scan.nextDouble());
		System.out.println("---------Parameterised constructor-------");
		System.out.println(item2);
		System.out.println("------------------------------------");
		System.out.println();
		
		System.out.println("Enter qty, Price: ");
		item1.setQty(scan.nextInt());
		item1.setUnitPrice(scan.nextDouble());
		System.out.println("--------------Setter--------------");
		System.out.println(item1);
		System.out.println("------------------------------------");
		System.out.println();
		
		System.out.println("--------------Getter--------------");
		System.out.println("Id: "+item1.getId()+" | Desc: "+item1.getDesc()+" | Qty: "+item1.getQty()+" | Price: "+item1.getUnitPrice()+" | Total: "+item1.getTotal()+" |");
		System.out.println("------------------------------------");
		System.out.println();
		scan.close();
	}

}
