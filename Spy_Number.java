import java.util.*;
class main
{
    public static int findsumdigit(int a)
    {
        int sum=0,r;
        while (a>0)
        {
            r=a%10;
            sum=sum+r;
            a=a/10;
        }
        return sum;
    }
    public static int findproductdigit(int b)
    {
        int prod=1,r;
        while(b>0)
        {
            r=b%10;
            prod=prod*r;
            b=b/10;
        }
        return prod;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sumres,productres;
        n=sc.nextInt();
        sumres=findsumdigit(n);
        productres=findproductdigit(n);
        if (sumres==productres)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
        
        
    }
}