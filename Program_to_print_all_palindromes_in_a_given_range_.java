import java.util.*;
class main
{
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
        int y=sc.nextInt();
        for (int i=n;i<y;i++)
        {
             if (ispalindrome(i))
             {
                 System.out.print(i+" ");
             }
        }     
    }
}