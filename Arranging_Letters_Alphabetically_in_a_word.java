class Arranging_Letters_Alphabetically_in_a_word
{
public static void main(String s)
{
int l=s.length();
char a[]=s.toCharArray();
for(int i=0;i<l;i++)
{
char ch=s.charAt(i);
a[i]=ch;
}
for(int i=0;i<l-1;i++)
{
for(int j=0;j<l-1-i;j++)
{
if(a[j]>(a[j+1]))
{
char temp =a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.print("The String in Alphabetical order is: ");
for(int n=0;n<a.length;n++)
{
System.out.print(a[n]);
}
}
}