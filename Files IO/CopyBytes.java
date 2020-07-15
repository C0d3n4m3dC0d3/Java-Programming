import java.io.*;

class CopyBytes{
  public static void main(String args[]) {
    FileInputStream inFile = null;
    FileOutputStream outFile = null;

    try{
      inFile = new FileInputStream("cities.txt");
      outFile = new FileOutputStream("cities(copy).txt");

      int b;
      while((b = inFile.read()) != -1) {
        outFile.write((char) b);
      }
      inFile.close();
      outFile.close();
    }

    catch(IOException e){
      System.out.println(e);
      System.exit(-1);
    }
  }
}
