import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cel;
        float f;
        cel=sc.nextInt();
        f=(float)(32+(cel*(float)9/5));
        System.out.format("%.2f",f);
    }
}