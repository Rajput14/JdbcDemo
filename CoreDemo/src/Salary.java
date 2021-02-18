import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name");
		String s=sc.nextLine();
		System.out.println("Enter Employee I'D");
		String s1=sc.nextLine();
		System.out.println("Enter Employee Gross Salatry");
		double basic=sc.nextDouble();
		System.out.println("Enter amount for House Rental Allowance");
		double hra=sc.nextDouble(); 
		System.out.println("Enter amount for Daily Allowance");
		double da=sc.nextDouble();    
		System.out.println("Enter amount to be deducted for the provident fund");
		double pf=sc.nextDouble();
		double netSalary=-basic + hra+da-pf;
		System.out.println("------EMPLOYEE SALARY DETAILS------");
		System.out.println("Employee Name="+s);
		System.out.println("Employee I'D="+s1);
		System.out.println("Employee Basic Salary="+basic);
		System.out.println("HRA Amount="+hra);
		System.out.println("Daily ALlowance="+da);
		System.out.println("Provident Fund="+pf);
		System.out.println("Net Salary is="+netSalary);

	}
}
