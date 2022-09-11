import java.util.*;
class main
{
    public static void main(String args[])
    {
        int prod=1,sum=0,n,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        System.out.println(Math.abs(prod-sum));
    }
}