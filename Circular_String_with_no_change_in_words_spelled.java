class Circular_String_with_no_change_in_words_spelled
{
public static void main(String s)
{
String s5=s.substring(0,s.length()-1);
String s0=s.substring(s.length()-1,s.length());
String s1=new String();
String s2=new String();
String s3=" ";
String s4=new String();
System.out.println(s);
for(int i=0;i<=(s5.length())-1;i++)
{
char ch=s5.charAt(i);
 if(ch==' ')
  {
  s1=s5.substring(0,i);
  s2=s5.substring(i,s5.length());
  System.out.println((s2+s3+s1).trim()+s0);
  s4=(s2+s3+s1).trim();
}
}
for(int i=0;i<=(s4.length())-1;i++)
{
 char ch=s4.charAt(i);
 if(ch==' ')
  {
  s1=(s4.trim()).substring(0,i);
  s2=(s4.trim()).substring(i,(s4.length()));
  System.out.println((s2+s3+s1).trim()+s0);
break;
}
}
}
}