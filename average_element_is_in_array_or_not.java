import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0,avg;
        n=sc.nextInt();
        x=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        avg=sum/n;
        for(int i=0;i<n;i++)
        {
             if(x[i]==avg)
             {
                System.out.println("True");
                System.exit(0);   
             }
        }     
        System.out.println("False");
    }
}