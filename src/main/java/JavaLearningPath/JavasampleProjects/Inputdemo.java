package JavaLearningPath.JavasampleProjects;
import java.util.Scanner;

public class Inputdemo 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scan.nextLine();
		
		System.out.println("What is your age?");
		int age = scan.nextInt();
		scan.nextLine();//used  to rectify  problem after scanning the integer
		System.out.println("Enter your Email ID");
		String email = scan.nextLine();
		
		System.out.println("Name  :" + name);
		System.out.println("Age   :"+age);
		System.out.println("Email :"+ email);
		
		
	}
}
