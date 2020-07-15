import java.io.*;
public class BufferedFileWriterExample{
public static void main(String args[]){
try{
FileWriter fw=new FileWriter("Z:/Java Programming(2017 July-Dec)/Files Programs/file5.txt");
BufferedWriter br=new BufferedWriter(fw);
String s="Welcome to Java using Buffered Writer.";
br.write(s);
br.close();
fw.close();
System.out.println("Success");
}catch(Exception e){System.out.println(e);}
}
}