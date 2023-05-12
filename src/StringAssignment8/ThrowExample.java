/**
 * 
 */
package StringAssignment8;

/**
 * @author ssampath
 *
 */
class Example{
	public void validate(int num) {
		if(num<0)
			throw new ArithmeticException("Invalid Number");
		else
			System.out.println("Allow to proceed");
	}
}
public class ThrowExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex=new Example();
		try {
			ex.validate(-10);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}

}
