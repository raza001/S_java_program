import java.util.*;
class Insertion_Sort
{
public static void main(String args[])throws Exception
{
Scanner sc = new Scanner(System.in);
int p,t,n,i;
System.out.println("Enter the size of the array");
n=sc.nextInt();
int a[]=new int[n+1];
a[0]=-9999999;
System.out.println("Enter array elements");
for(i=1;i<n+1;i++)
a[i]=sc.nextInt();
for(i=1;i<n+1;i++)
{
t=a[i];p=i-1;
while(a[p]>t)
{
a[p+1]=a[p];
p--;
}
a[p+1]=t;
}
System.out.println("Elements in ascending order are:");
for(i=1;i<n+1;i++)
{
System.out.print(a[i]+"\t");
}
}
}