import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        float e;
        String id,name;
        id=sc.nextLine();
        name=sc.nextLine();
        a=sc.nextInt();
        if (a<=199)
        {
            e=a*1.20f;
        }
        else if(a>=200&&a<400)
        {
            e=a*1.50f;
        }
        else if(a>=400&&a<600)
        {
            e=a*1.80f;
        }
        else
        {
            e=a*2.00f;
        }
        if(e>400)
        {
            e=0.15f*e+e;
        }
        else
        {
            e=e+100;
        }
        System.out.format("%.2f",e);
    }
}