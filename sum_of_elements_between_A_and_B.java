import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x[],n,a,b,sum=0;
    n=sc.nextInt();
    x=new int[n];
    //Reading of an array elements
    for(int i=0;i<n;i++)
    {
        x[i]=sc.nextInt();
    }
    a=sc.nextInt();
    b=sc.nextInt();
    //Print the elements of an array
    for(int i=0;i<n;i++)
    {
        if(x[i]>=a && x[i]<=b)
        sum=sum+x[i];
    }
    System.out.println(sum);
  }
}