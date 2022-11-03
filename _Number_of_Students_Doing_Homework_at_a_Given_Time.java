import java.util.Scanner;
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
        int m=sc.nextInt();
        int y[]=new int[m];
        for(int i=0;i<m;i++)
        {
            y[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]<=k && y[i]>=k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}