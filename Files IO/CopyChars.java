import java.io.*;
class CopyChars {
  public static void main(String args[]){
    File in = new File("Dexter.txt");
    File out = new File("DiDee.txt");
    FileReader read = null;
    FileWriter write = null;

    try{
      read = new FileReader(in);
      write = new FileWriter(out);

      int ch;
      while((ch = read.read()) != -1) {
        write.write(ch);
      }
    }
    catch(IOException e)  {
      System.out.println(e);
      System.exit(-1);
    }
    finally {
      try {
        read.close();
        write.close();
      }
      catch (IOException e) { }
    }
  }
}
