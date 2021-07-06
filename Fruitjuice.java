import java.util.*;
class Fruitjuice
{
String n,s;int m;
void enter()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the details");
n=sc.nextLine();
s=sc.nextLine();
m=sc.nextInt();
}
void display()
{
System.out.println("Name - "+n);
System.out.println("Subject - "+s);
System.out.println("Marks - "+m);
}
public static void main(String args[])
{
Fruitjuice ob = new Fruitjuice();
ob.enter();
ob.display();
}
}