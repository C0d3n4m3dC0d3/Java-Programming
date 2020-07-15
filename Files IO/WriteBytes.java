import java.io.*;

class WriteBytes {
  public static void main(String args[])
  {
    byte cities[] = { 'D', 'E' ,'L', 'H', 'I', '\n', 'M', 'U', 'M', 'B', 'A', 'I', '\n', 'S', 'E', 'O', 'U', 'L', '\n' };
    FileOutputStream outFile = null;

    try{
      outFile = new FileOutputStream("cities.txt");
      outFile.write(cities);
      outFile.close();
    }
    catch(IOException e){
      System.out.println(e);
      System.exit(-1);
    }
  }
}
