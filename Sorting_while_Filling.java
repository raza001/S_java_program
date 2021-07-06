import java.util.*;
class Sorting_while_Filling
{
public static void main(String args[])throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array.");
int n=sc.nextInt();int s;int temp;
int a[]=new int[n];
for(int i=0;i<n;)
{
for(int j=0;j<=0;j++)
{
System.out.println("Enter an element.");
a[i]=sc.nextInt();
}s=i;
if(i>0&&i<n)
{
for(int k=i;k>0;k--)
{
if(a[s]<a[k-1])
{
temp=a[s];
a[s]=a[k-1];
a[k-1]=temp;
s=k-1;
}
}
}
i++;
System.out.println("Sorted array -->");
for(int l=0;l<i;l++)
System.out.print(a[l]+"\t");
System.out.println();
}
}
}