import java.io.FileReader;
public class FileReaderExample{
public static void main(String args[]){
try{
FileReader fr=new FileReader("Z:/Java Programming(2017 July-Dec)/Files Programs/file4.txt");
int i=0;
while((i=fr.read())!=-1){
System.out.print((char)i);
}
fr.close();
}
catch(Exception e){System.out.println(e);}
}
}