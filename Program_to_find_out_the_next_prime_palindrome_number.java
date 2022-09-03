import java.util.*;
class main
{
    public static boolean isprime(int m)
    {
        int count=0;
        for (int i=2;i<=(int)Math.sqrt(m);i++)
        if (m%i==0)
        {
            count++;
        }
        if (count==0)
            return true;
        else
            return false;
    }
    public static boolean ispalindrome(int x)
    {
        int temp=x,r,sum=0;
        while (x>0)
        {
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n+1;;i++)
        {
             if (isprime(i)&&ispalindrome(i))
             {
                   System.out.println(i);
                   break;
             }
        }     
    }
}