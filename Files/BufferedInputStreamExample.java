import java.io.*;  
public class BufferedInputStreamExample{    
 public static void main(String args[]){    
  try{    
    FileInputStream fin=new FileInputStream("Z:/Java Programming(2017 July-Dec)/Files Programs/file3.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  