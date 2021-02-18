import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter a array size");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array element");
		for(int i=0;i< n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum = "+sum);
		
	}

}
