//WAP to insert the elements in an array as desired by the user.
import java.util.*;
class I
{
public static void main(String args[])throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array.");
int n= sc.nextInt();
int a[]= new int[n];
System.out.println("Enter the elements of the array.");
for(int i=0;i<n;i++)
a[i]= sc.nextInt();
System.out.println("Enter the element to be inserted.");
int i= sc.nextInt();
System.out.println("Enter the postion at which it has to be inserted.");
int p= sc.nextInt();
int b[]= new int[n+1];
for(int j= 0;j< p-1;j++)
b[j]=a[j];
b[p-1]=i;
for(int j= p;j< (n+1);j++)
b[j]=a[j-1];
System.out.println("Final array is given below :-");
for(int l= 0;l< (n+1);l++)
System.out.println(b[l]+"\t");
}
}