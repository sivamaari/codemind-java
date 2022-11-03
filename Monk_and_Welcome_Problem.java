import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=x[i]+y[i];
            System.out.print(sum+" ");
        }
    }
}