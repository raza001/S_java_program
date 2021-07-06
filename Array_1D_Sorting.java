//This program brings the even nos. before the odd nos. eg- input=24356; output=24635
import java.util.*;
class Array_1D_Sorting
  {
   public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   int n;
   System.out.println("Enter the length of an array");
   n=sc.nextInt();int f=n;
   int a[]= new int[n];int temp=0;int k;
   System.out.println("Enter the values of an array");
   for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
     }
   for(int j=0;j<n;j++)
    {
      for(int i=0;i<f-1;i++)
      {
          if((a[i]%2)==1&&(a[i+1]%2)==0)
          {    temp=a[i];
              a[i]=a[i+1];
              a[i+1]=temp;
          }
          }
    }System.out.println();
   for(k=0;k<n;k++)
    {
     System.out.print(a[k]);
    }
   }
  }