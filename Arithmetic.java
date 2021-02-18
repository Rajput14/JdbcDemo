class Arithmetic
{
  public static void main(String args[])
  {
    int a=10,b=5,c=1,sum,sub,mul;
    float div,mod;
     
    sum = a+b;
    sub = a-b;
    mul = a*b;
    div = (float)a/b;
    mod = (float)a%b;

    System.out.println("Addition ="+sum);
    System.out.println("Substraction ="+sub);
    System.out.println("Multiplication ="+mul);
    System.out.println("Divison="+div);
    System.out.println("Mod = "+mod);
   }
}