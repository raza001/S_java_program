import java.util.*;
class Matrix_at_90
{
public static void main(int n,int m)
{
Scanner sc = new Scanner(System.in);
int a[][]=new int[m][n];
int b[][]=new int [n][m];
System.out.println("Enter "+m*n+" values.");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Here's ur matrix");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
int r=0;
//Main program code
for(int i=m-1;i>=0;i--)
{
for(int j=0;j<n;j++)
{
b[j][i]=a[j][r];
}
r++;
}
System.out.println("Here,s the matrix at 90 degrees");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
}
}
