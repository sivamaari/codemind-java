import java.util.*;
class main
{
    public static void main(String args[])
    {
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(int)Math.pow(a,b);
        e=d%c;
        System.out.println(e);
    }
}