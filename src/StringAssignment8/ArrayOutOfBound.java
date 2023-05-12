/**
 * 
 */
package StringAssignment8;

/**
 * @author ssampath
 *
 */
public class ArrayOutOfBound {

	/**
	 * @param args
	 */
	public static void array(int arr[])throws Exception{
		
		for(int i=0;i<=arr.length;i++) 
			arr[5]=30/0;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		array(arr);
		String str="***";
		System.out.println(str.length());
		// TODO Auto-generated method stub
		/*try {
			int arr[]= {1,2,3,4,5};
			for(int i=0;i<=arr.length;i++) {
				arr[5]=30/0;
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		*/
	}
}
