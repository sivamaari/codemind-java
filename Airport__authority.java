import java.util.*;
class main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int k,c=0;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]>k)
            {
                c++;
            }
        }
        System.out.println(n+c);
    }
}