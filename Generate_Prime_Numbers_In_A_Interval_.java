import java.util.*;
class main
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(x);i++)
        {
            if(x%i==0)
            count++;
        }
        if(count==0)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for (int i=a+1;i<=b;i++)
        {
            if(isprime(i))
            System.out.println(i);
        }
    }
}