import java.io.*;
class File_Writer
{
public static void main(int n)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
FileWriter fw = new FileWriter("II - B.txt");
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter pw = new PrintWriter(bw);
{
for(int i=0;i<n;i++)
{
System.out.println("Name,Subject and Marks");
String name = new String();
String sub = new String();
int stark;
fw.write(name = br.readLine());
fw.write(sub = br.readLine());
fw.write(stark=Integer.parseInt(br.readLine()));
}
bw.close();
pw.close();
fw.close();
}
}
}