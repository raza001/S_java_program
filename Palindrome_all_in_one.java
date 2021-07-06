import java.util.*;
class Palindrome_all_in_one
{
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();int dup = n;int r = 0;
        System.out.println("Please enter a string: ");
        String s = sc.next();
    while(n>0)
     {
        int m = n % 10;
        r = (r * 10) + m;
        n = n / 10;
     }
    if(r==dup)
     System.out.println(r+ " is a palindrome no.");
       else
     System.out.println(r+" is not a palindrome");String st = new String();
    for(int j=0;j<(s.length());j++)
    {
     char ch=s.charAt(j);
     st=ch+st;
    }
    if(s.equalsIgnoreCase(st))
        System.out.println("'"+s+"'"+" is a palindrome string");
        else
       System.out.println("'"+s+"'"+" is not a palindrome string");
}
}
