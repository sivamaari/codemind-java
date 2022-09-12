import java.util.*;
class main
{
    public static boolean isSelfDivisible(int x)
    {
        int temp=x;
        while(x>0)
        {
            int r=x%10;
            if(r==0)
              return false;
            if(temp%r!=0)
              return false;
            x=x/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for (int i=a;i<=b;i++)
        {
            if(isSelfDivisible(i))
              System.out.print(i+" ");
        }
    }
}