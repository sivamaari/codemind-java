import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]%2!=0)
            System.out.println(i);
            break;
        }
    }
}