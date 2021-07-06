class Pattern_Crisscross_Using_Matrice
{
public static void main(String s1)
{
int l=s1.length(),n=l-1;char a[][]=new char[l][l];int s=n/2;
for(int j=0;j<l;j++)
{
a[j][j]=s1.charAt(j);
a[j][n--]=s1.charAt(j);
a[s][j]=s1.charAt(j);
a[j][s]=s1.charAt(j);
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