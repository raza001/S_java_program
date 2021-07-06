class astrix_triangle
{
public static void main(int l)
{
int n=l-1,s=(l*2)-1,a1=0;
char a[][]=new char[l][(l*2)-1];
for(int i=l-1;i>=0;i--)
{
for(int j=a1;j<s;j++)
{
a[i][j]='*';
}
a1++;s--;
}
for(int i=0;i<l;i++)
{
for(int j=0;j<(l*2)-1;j++)
{
if(a[i][j]!='*')
{
a[i][j]=' ';
}
System.out.print(a[i][j]);
}
System.out.println();
}
}
}