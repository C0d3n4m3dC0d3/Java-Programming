import java.io.FileOutputStream;
public class FileOutputStreamExample{
public static void main(String args[]){
try{
FileOutputStream fout=new FileOutputStream("Z:/Java Programming(2017 July-Dec)/Files Programs/file1Ex.txt");
String s="Welcome to Java using FileOutputStream.";
byte b[]=s.getBytes();
fout.write(b);
fout.close();
System.out.println("Success");
}catch(Exception e){System.out.println(e);}
}
}