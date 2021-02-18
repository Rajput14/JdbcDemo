import java.util.Scanner;
public class SumOfSeries {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of the Series="+sum);
		
	}

}
