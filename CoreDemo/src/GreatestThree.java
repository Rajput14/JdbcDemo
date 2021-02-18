import java.util.Scanner;
public class GreatestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 numbers");
		
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if((a>b) && (a>c))
		{
			System.out.println(a+ " is the greatest number");
		}
		
		else if((c>a) && (c>b))
		{
			System.out.println(c+ " is the greatest number");
		}
		else
		{
			System.out.println(b+ " is the greatest number");
		}
		
	}

}
