class Merging_Arrays
{
public static void main(int a[],int b[])
{
int m=a.length,n=b.length;
int c[]=new int [m+n],p=0,i=0,j=0;
while(i<m&&j<n)
{
if(a[i]<b[j])
c[p++]=a[i++];
else
c[p++]=b[j++];
}
while(i<m)
{
c[p++]=a[i++];
}
while(j<n)
{
c[p++]=b[j++];
}
for(i=0;i<(m+n);i++)
System.out.print(c[i]);
}
}