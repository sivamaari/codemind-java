import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int vc=0,cc=0,dc=0,wc=0;
        String vowels="AEIOUaeiou";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
            {
                vc++;
            }
            else if(ch==' ')
            {
                wc++;
            }
            else if(ch>=48 && ch<=57)
            {
                dc++;
            }
            else 
            {
                cc++;
            }
        }
        System.out.println("Vowels: "+vc);
        System.out.println("Consonants: "+cc);
        System.out.println("Digits: "+dc);
        System.out.println("White spaces: "+wc);
    }
}