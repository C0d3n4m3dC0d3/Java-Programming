//Java Program to copy a source array into a destination array in Java  
//We can copy an array to another by the arraycopy() method of System class.
//public static void arraycopy(  
Object src, int srcPos,Object dest, int destPos, int length  
)  
class TestArrayCopyDemo {  
    public static void main(String[] args) {  
        //declaring a source array  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        //declaring a destination array  
        char[] copyTo = new char[7];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        //printing the destination array  
        System.out.println(String.valueOf(copyTo));  
    }  
}  
