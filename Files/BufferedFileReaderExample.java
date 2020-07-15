import java.io.*;
public class BufferedFileReaderExample{
public static void main(String args[]){
try{
FileReader fr=new FileReader("Z:/Java Programming(2017 July-Dec)/Files Programs/file5.txt");
BufferedReader br=new BufferedReader(fr);
int i=0;
while((i=br.read())!=-1){
System.out.print((char)i);
}
br.close();
fr.close();
}
catch(Exception e){System.out.println(e);}
}
}