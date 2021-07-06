import java.util.*;
class Matrix_Display
{
public static void main(String args[])throws Exception
{
Scanner sc = new Scanner(System.in);int i,j;
System.out.println("Enter m and n as column and row ");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("Enter "+(m*n)+" values");
int a[][]=new int[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Here's ur matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}