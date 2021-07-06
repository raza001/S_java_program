//WAP to insert the elements in an array as desired by the user.
import java.util.*;
class Insertion_II
{
public static void main(int position,int element)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array.");
int n= sc.nextInt();
int a[]= new int[n];
System.out.println("Enter the elements of the array.");
for(int i=0;i<n;i++)
a[i]= sc.nextInt();
int b[]= new int[n+1];
for(int j= 0;j< position-1;j++)
b[j]=a[j];
b[position-1]=element;
for(int j= position;j< (n+1);j++)
b[j]=a[j-1];
System.out.println("Final array is given below :-");
for(int l= 0;l< (n+1);l++)
System.out.println(b[l]+"\t");
}
}