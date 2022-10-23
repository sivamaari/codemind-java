import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<=n;i++)
        {
            if(i*(i+1)==n)
            ans=1;
        }
        if(ans==1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}