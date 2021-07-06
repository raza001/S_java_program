import java.util.*;
class Palindrome_String
{
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = sc.next();String st="";
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