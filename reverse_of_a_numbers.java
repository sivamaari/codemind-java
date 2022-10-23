import java.util.*;
class main
{
    public static int reverse(int n)
    {
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
}