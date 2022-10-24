import java.util.*;
class main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],k,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]==k)
            c=1;
        }
        if(c==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}