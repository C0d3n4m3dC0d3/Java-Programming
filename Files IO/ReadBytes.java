import java.io.*;

class ReadBytes {
  public static void main(String args[])  {

    FileInputStream inFile = null;

    try{
      inFile = new FileInputStream("cities.txt");
      int b;
      while((b = inFile.read()) != -1)  {
        System.out.print((char)b);
      }
      inFile.close();
    }
    catch(IOException e){
      System.out.println(e);
      System.exit(-1);
    }
  }
}
