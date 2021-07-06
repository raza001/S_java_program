import java.io.*;
import java.util.*;
class File_Reader
{
public static void main()throws IOException
{
File f= new File("II - B.txt");
Scanner sc = new Scanner(f);
while(sc.hasNext())
{
System.out.println(sc.nextLine());
}
}
}