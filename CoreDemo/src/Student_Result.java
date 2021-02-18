import java.util.Scanner;
public class Student_Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String n = "" , ba = "";
		int roll,m1,m2,m3,m4,m5,avg;
		System.out.println("Enter a name of a student =");
		n = sc.nextLine();
		System.out.println("Enter roll number");
		roll = sc.nextInt();
		System.out.println("Enter name of class");
		ba = sc.next();
		System.out.println("Enter section");
		char c = sc.next().charAt(0);
		System.out.println("Enter marks of 5 subjects");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		avg = (m1+m2+m3+m4+m5)/5;
		System.out.println("-----------STUDENT MARKSHEET-----------");
		System.out.println("Name ="+n);
		System.out.println("Roll No.="+roll);
		System.out.println("Marks 1="+m1);
		System.out.println("Marks 2="+m2);
		System.out.println("Marks 3="+m3);
		System.out.println("Marks 4="+m4);
		System.out.println("Marks 5="+m5);
		System.out.println("Average="+avg);
		System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
		
		
	}

}
