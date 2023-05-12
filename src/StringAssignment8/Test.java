/**
 * 
 */
package StringAssignment8;

/**
 * @author ssampath
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str=null;
			System.out.println(str.length());
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			String str="***";
			System.out.println(str.length());
		}
	}
}
