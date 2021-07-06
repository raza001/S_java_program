class Pattern_Crisscross_Using_Matrix
{
public static void main(String s1)
{
int l=s1.length(),n=l-1;char a[][]=new char[l][l];int s=n/2;
char ch[]=s1.toCharArray();
for(int j=0;j<l;j++)
{
a[j][j]=ch[j];
a[j][n--]=ch[j];
a[s][j]=ch[j];
a[j][s]=ch[j];
}
for(int j=0;j<l;j++)
{
for(int i=0;i<l;i++)
{
if(a[i][j]==0)
a[i][j]=' ';
}
}
for(int j=0;j<l;j++)
{
for(int i=0;i<l;i++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
} 