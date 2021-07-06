import java.util.*;
class astrix_pattern
{
    public static void main(String args[])throws Exception
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit");
    int n=sc.nextInt();
    for(int i=0;i<=n;i++)
    {
        for(int j=i;j>=0;j--)
        {
            System.out.print("*");
        }
        System.out.println();
}
}
}
