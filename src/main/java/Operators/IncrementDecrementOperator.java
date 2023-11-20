/******************************IncrementDecrementOperator***********************************/

package Operators;

public class IncrementDecrementOperator {

	public static void main(String[] args)
	{
		int a = 10;
		int c = a++;
		a =++a;
		System.out.println("c is"+c);
		System.out.println(a);
		
		int b = a;
		b =--b;
		System.out.println(b);
	
	
	}

}
