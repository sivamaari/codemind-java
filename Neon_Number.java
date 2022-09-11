import java.util.*;
class main
{
    public static void main(String args[])
    {
        int m,sum=0,n,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n*n;
        while(m!=0)
        {
            r=m%10;
            sum=sum+r;
            m=m/10;
        }
        if(n==sum)
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
    }
}