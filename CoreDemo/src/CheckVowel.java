import java.util.Scanner;
public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char c=sc.next().charAt(0);
		if(c == 'A' || c=='E' || c=='I' || c=='O' || c=='U')
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is not a vowel");
		}
		
	}

}
