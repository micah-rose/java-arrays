/********************
* Author: Micah Lund
*
* Final: Exercise 2
*********************/
import java.util.Arrays;
import java.util.Random;

public class Exercise2{
   public static void main(String[] args){
      boolean[] myArray = new boolean[7];
      
      //Print all elements of myArray
      System.out.println("myArray:");
      System.out.println(Arrays.toString(myArray));
      System.out.println();
      
      Random rand = new Random();
      for(int i = 0; i < 3; i++){
         int n = rand.nextInt(myArray.length-1);
         myArray[n] = true;
      }
      
      for(boolean array: myArray){
         System.out.printf("%-6s ", array);
      }
      System.out.println();
      
      for(int i = 0; i < myArray.length; i++){
         System.out.printf("%-6d ", i);
      }
   }
}