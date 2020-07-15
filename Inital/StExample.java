public class StExample{ 
static {
 System.out.println("This is first static block");
 } 
public StExample(){
 System.out.println("This is constructor");
 }
 public static String stString = "Static Variable"; 
static {
 System.out.println("This is second static block and " + stString); 
}
 public static void main(String[] args){
 StExample statEx = new StExample();
 StExample.stMethod2(); } 
static {
 stMethod1();
 System.out.println("This is third static block"); }
 
    public static void stMethod1(){
      System.out.println("This is static method1");} 
    public static void stMethod2() { 
      System.out.println("This is static method2");}
}
