import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int product=1;
           for(int j=0;j<n;j++)
           {
               if (x[i]!=x[j])
               {
                   product=product*x[j];
               }
           }
           System.out.print(product+" ");
        }
    }
}