import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int c=0,max=0,k=0;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    c++;
                }
            }
            if(c>max)
            {
                max=c;
                k=x[i];
            }
            else
            {
                if(c==max)
                {
                    if(x[i]<k)
                    {
                        k=x[i];
                    }
                }
            }
        }
        System.out.println(k);
        
    }
}