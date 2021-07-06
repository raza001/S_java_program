class Matrix_at_90_degrees
{
public static void main(int m,int n)
{
int a[][]=new int[m][n],x=1,a1=m,dup=a1;
//Storing values in the matrix
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
a[j][i]=x++;
}
}
//Display of matrix to be rotated
System.out.println("Here's ur matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
System.out.print(a[j][i]+"\t");
}
System.out.println();
}
//Main program code
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
a[j][i]=a1;a1--;
}
a1=dup+m;dup=a1;
}
//Display of matrix after rotation
System.out.println("Here's ur matrix at 90 degrees");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}
