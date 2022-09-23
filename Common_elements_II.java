import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a[],b[],x[],i;
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[n];
        b=new int[m];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {   int flag=0;
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                 {
                     flag=1;
                     break;
                 }
            }
            if(flag==0)
             System.out.print(a[i]+" ");
        }
        for(i=0;i<m;i++)
        {
            int flag=0;
            for(int j=0;j<n;j++)
            {
               if(b[i]==a[j])
               {
                   flag=1;
                   break;
               }
            }
            if(flag==0)
              System.out.print(b[i]+" ");
        }
    }
}













