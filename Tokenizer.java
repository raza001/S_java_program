import java.io.*;
class Tokenizer
{
public static void main()throws IOException
{
FileReader F1=new FileReader("II - B.txt");
StreamTokenizer st = new StreamTokenizer(F1);
int type = st.nextToken(),w=0,n=0;
while(type!=StreamTokenizer.TT_EOF)
{
if(type==StreamTokenizer.TT_WORD)
w++;
else if(type==StreamTokenizer.TT_NUMBER)
n++;
type=st.nextToken();
}
F1.close();
System.out.println("Total words="+w);
System.out.print("Total numbers="+n);
}
}