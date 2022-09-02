import java.util.*;
class palindrome
{ 
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int T,n,r,sum=0,temp;
   T=sc.nextInt();
 while(T > 0)
 {
   n=sc.nextInt();
   temp=n;  
   sum=0;
   while(n>0)           
    {
      r=n%10;       
      sum=(sum*10)+r;  
      n=n/10; 
    }
   
     if(temp==sum)
     System.out.println("True");
     else
     System.out.println("False");
     
     T--;
    }
  }
}