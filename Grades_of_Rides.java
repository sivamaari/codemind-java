import java.util.*;
class main
{
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>50&&y>60&&z>100)
        System.out.println(10);
        else if (x>50&&y>60)
        System.out.println(9);
        else if(y>60&&z>100)
        System.out.println(8);
        else if(x>50&&z>100)
        System.out.println(7);
        else if(x>50||y>60||z>100)
        System.out.println(6);
        else
        System.out.println(5);
    }
}