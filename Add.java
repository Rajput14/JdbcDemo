import java.util.Scanner;

public class Add
{
  public static void main(String[] args)
  {
   System.out.println("Enter first number");
   Scanner sc= new Scanner(System.in);
   
   int num1=sc.nextInt();
    
   System.out.println("Enter second number");

   int num2 = sc.nextInt();

   int num3 = num1 +num2;

   System.out.println("Answer="+num3);
   }
}