import java.util.*;
class freq_and
{
public static void main(String args[])throws Exception
{
Scanner sc = new Scanner(System.in);
String st="",stt="and";
int l;
char ch2;
System.out.println("Enter a sentence");
String s=sc.nextLine();s=s+" ";
l=s.length();int a=0;
for(int j=0;j<l;j++)
{
 ch2=s.charAt(j);
 if(ch2!=' ')
  st=st+ch2;
  if(ch2==' ')
 {
   if(st.equals(stt))
     a++;
   st="";
 }
}
System.out.println(a);
}
}