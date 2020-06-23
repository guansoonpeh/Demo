

import java.util.InputMismatchException;
import java.util.Scanner;


public class DemoException {
 
    public static void main(String[] args) {
         System.out.println("Begin");
         
         try{
            int num1 = 0;
            int num2 = 62 / num1;
            
            System.out.println("Num2 = "+ num2);
        
         }catch(Exception ex){
             System.out.println("error");
         }
        
    }
    
   

}
