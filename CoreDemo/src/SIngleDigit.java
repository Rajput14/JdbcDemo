import java.util.Scanner;
public class SIngleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num >= -9 && num <= 9)
		{
			System.out.println("It is a single digit number");
		}
		else
		{
			System.out.println("It is not a single digiot number");
		}
	}
	

}
