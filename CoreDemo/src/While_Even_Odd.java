
public class While_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.out.println("EVEN\tODD");
		System.out.println("----\t---");
		while(i<=10)
		{
			if(i%2==1)
			{
				
				System.out.print(i +"\t");
			}
			else
			{
				System.out.println(i);
			}
			i++;
		}

	}

}
