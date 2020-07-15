import java.io.FileWriter;
public class FileWriterExample{
public static void main(String args[]){
try{
FileWriter fw=new FileWriter("Z:/Java Programming(2017 July-Dec)/Files Programs/file4.txt");
String s="Welcome to Java using File Writer.";
fw.write(s);
fw.close();
System.out.println("Success");
}catch(Exception e){System.out.println(e);}
}
}