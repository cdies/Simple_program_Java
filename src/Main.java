import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		double a=0,b=0,c=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� ������� ������������:");
		System.out.println("������� �:");
		
		try{
		  a = scan.nextDouble();
		  System.out.println("������� �:");
		  b = scan.nextDouble();
		  System.out.println("������� �:");
		  c = scan.nextDouble();
		}
		catch(InputMismatchException ex){
			System.out.println("������� �����!");
			System.out.println(ex);
		}
		
		Triangle tr = new Triangle(a,b,c);
		tr.getResult();
	}
}