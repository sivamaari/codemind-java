import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int count=1;
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            if((s1. charAt(i) == ' ') && (s1.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}