import java.util.*;
class main
{
    public static boolean ispalindrome(int x)
    {
        int sum=0,r,temp=x;
        while(x>0)
        {
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if (temp==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T,n,count=0;
        T=sc.nextInt();
        while(T>0)
        {
            n=sc.nextInt();
            if (ispalindrome(n))
            {
                count++;
            }
            T--;
        }
        System.out.println(count);
    }
}