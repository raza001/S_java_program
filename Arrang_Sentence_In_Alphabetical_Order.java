class Arrang_Sentence_In_Alphabetical_Order
{
public static void main(String s)
{
int c=0;
int l=s.length();
if(((s.endsWith("."))||(s.endsWith("?")))&&(s.equals(s.toUpperCase())))
{
for(int j=0;j<l;j++)
{
if((s.trim()).charAt(j)==' ')
{
c++;
}
}
String a[]=new String[c+1];
int i=0;
String s2=s;
while(s2.length()>0)
{
int h=s2.indexOf(' ');
if(h>0)
{
a[i]=s2.substring(0,h);
s2=s2.substring(h+1);
s2=s2.trim();
i++;
}
else
{
a[i]=s2;
s2="";
}
}
for(int g=0;g<a.length-1;g++)
{
for(int z=0;z<a.length-1-g;z++)
{
if(a[z].compareToIgnoreCase(a[z+1])>1)
{
String temp=a[z];
a[z]=a[z+1];
a[z+1]=temp;
}
}
}
String b="";
System.out.print("The String in Alphabetical order is: ");
for(int n=0;n<a.length;n++)
{
b=b+a[n]+" ";
}
System.out.print(b.trim());
}
else
{
System.out.println("Invalid Entry");
}
}
}