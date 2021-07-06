class Circular_Form_String
{
public static void main(String s)
{
s=s+" ";
String s1=new String();
String s2=new String();
int l=s.length(),i;
for(i=0;i<l;i++)
{
 char ch=s.charAt(i);
  s1=s.substring(0,i);
  s2=s.substring(i,l);
  System.out.println(s2+s1);
}
for(i=0;i<l;i++)
{
 char ch=s.charAt(i);
  s1=s.substring(0,i);
  s2=s.substring(i,l);
  System.out.println(s2+s1);
  break;
}
}
}