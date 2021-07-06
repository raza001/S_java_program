import java.util.*;
class Check
{   
public static void main(String args[])throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt(),temp,end=n-1,l=0,mid=(n-1)/2,h=0,a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int k=0;k<n;k++)
{
for(int i=0;i<n-1;i++)
{
if(a[l]>a[i+1])
{
h=a[l];
}
else
{
h=a[i+1];l=i+1;
break;
}
}
}
temp=a[mid];
a[mid]=a[l];
a[l]=temp;
for(int r=0;r<=end;r++)
System.out.print(a[r]+"\t");
}
}