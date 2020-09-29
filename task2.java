package assignment_day_6;

public class task2 {

	public static void main(String[] args) {
		/* Declare 2 variables (Num1, Num2)

Swap values between Num1 and Num2

Display new values of Num1 and Num2

      Sample output:

      n1=10
      n2=20

      ----------

      n1=20
      n2=10 */
		int n1=10,n2=20 ,swap ;
		swap=n2 ;
		n2=n1;
		n1=swap;
		
		System.out.println("given n1=10 changes into n1= "+n1);
		System.out.println(" given n2=20 changes into n2= "+n2);
	}

}
