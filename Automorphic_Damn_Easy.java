class Automorphic_Damn_Easy
{
public static void main(int n)
{
String s=Integer.toString(n);
String s1=Integer.toString(n*n);
if((s1).endsWith(s))
{
System.out.println("No. is Automorphic");
}
else
{
System.out.println("No. is not Automorphic");
}
}
}