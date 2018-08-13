/********************
* Author: Micah Lund
*
* Final: Exercise 1
*********************/
import java.util.ArrayList;

public class Exercise1{
   public static void main(String[] args){
      ArrayList<Character> symbols = new ArrayList<Character>();
      
      //Add symbols
      symbols.add('+');
      symbols.add('-');
      symbols.add('*');
      symbols.add('\\');
      symbols.add('%');
      symbols.add('@');
      
      //Print symbols separated by a single blank
      System.out.print("symbols: ");
      for (Character el: symbols){
         System.out.print(el + " ");
      }
      System.out.println();
      
      //Remove @ sign
      symbols.remove((Character)'@');
      
      //Add two parenthesis to beginning of symbols list
      symbols.add(0, ')');
      symbols.add(1, '(');
      
      //Print updated symbols list
      System.out.println("updated symbols:" + symbols);
   
   }
}