/******************************Relational Operator***********************************/

package Operators;

public class RelationalOperators {

	public static void main(String[] args)
	{
		//Relational operators <,<=, > , >= , == , !=
		// Less than <
		int a  = 10; int b = 20; //TRUE
		int a1 = 20;  int b1 = 20; //FALSE
		System.out.println(a<b);
		System.out.println(a1<b1);
		
		//Less than or equal to 
		int a2=10; int b2 =10;  // True
		System.out.println(a2<=b2);
		
		//Greater than, Greater than or equal to
		int g = 30; int l = 20;
		System.out.println(g>l); //true
		System.out.println(g>=l);//true
		
		//Equal to
		 int e1 =40; int e2 = 40;
		 System.out.println(e1==e2);  //true
		//Not  equal to
		 System.out.println(e1!=e2);//false
		
	}

}
