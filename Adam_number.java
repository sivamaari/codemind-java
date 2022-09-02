import java.util.*;
class main
{
    public static int reverse(int x)
    {
        int r,sum=0;
        while (x>0)
        {
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        return(sum);
    }
    public static int square(int y)
    {
        return(y*y);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//n=12
        int a=square(n);//a=144
        int b=square(reverse(n));//b=441
        {
              if (a==reverse(b))
                 System.out.println("True");
              else 
                 System.out.println("False");
        }
    }
}