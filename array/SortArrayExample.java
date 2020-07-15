//How to sort an Array in Java
//Here we have two arrays, one is an integer array and another one is a String array and we are sorting both of them using Arrays.sort() method.
import java.util.Arrays;
class SortArrayExample {
 
  public static void main(String[] args) {
    // int Array
    int[] intArr = 
        new int[] { 14, 16, 3, 15, 8, 5, 9, 11, 30 };

    // Sorting int Array
    Arrays.sort(intArr);
 
    // Displaying elements of int Array
    System.out.println("Int Array Elements:");
    for (int i = 0; i < intArr.length; i++)
    System.out.println(intArr[i]);
 
    // String Array
    String[] stringArr = 
        new String[] { "F", "P", "A", "O", "D" };

    // Sorting String Array
    Arrays.sort(stringArr);

    // Displaying elements of String Array
    System.out.println("String Array:");
    for (int i = 0; i < stringArr.length; i++)
        System.out.println(stringArr[i]);
  }
}