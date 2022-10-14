import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0,i;
        n=sc.nextInt();
        for(i=2;i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        System.out.println("prime");
        else
        System.out.println("not a prime");
    }
}
