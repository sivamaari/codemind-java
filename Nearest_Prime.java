import java.util.*;
class main
{
     public static boolean isprime(int x)
      {
        int count=0;
        for (int i=2;i<=(int)Math.sqrt(x);i++)
        {
          if (x%i==0)
           count++;
        }
        if (count==0)
        return true;
        else
        return false;
      }
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          int n,d1=0,d2=0,d3,d4,t;
          t=sc.nextInt();
          while(t>0)
          {
              n=sc.nextInt();
              for(int i=n;;i--)
              {
                  if (isprime(i))
                  {
                      d1=i;
                      break;
                  }
              }
              for (int i=n;;i++)
              {
                  if(isprime(i))
                  {
                      d2=i;
                      break;
                  }
              }
              d3=n-d1;
              d4=d2-n;
              if(d3>d4)
              System.out.println(d2);
              else
              System.out.println(d1);
              t--;
          }
          
      }
}