import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(x[i]==x[j])
                    System.out.println(x[i]);
                    found=0;
            }
            if(found==1)
            break;
        }
    }
}