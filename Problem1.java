package assignment;
import java.util.*;
public class Problem1 {
	   public static void main(String args[]) 
	   {
	    
	     Scanner input = new Scanner(System.in);
	     
	     int num1, num2,total, result;
	     
	     
	    System.out.print("Please enter 1st number :");
	    
	    
	    num1 = input.nextInt();
	    
	    System.out.print("Please enter 2nd number :");
	    
	    num2 = input.nextInt();
	    
	    System.out.println("( Press 1 to add )");
	    System.out.println("( Press 2 to substract )");
	    System.out.println("( Press 3 to multiply )");
	    System.out.println("( Press 4 to divide )");
	    
	    System.out.print("Enter any number :");
	    total = input.nextInt ();
	    
	    System.out.println();
	    if (total == 1){
	      
	   result =   num1 + num2;
	   
	   System.out.print("Result :"+result);
	      
	    }
	    if(total == 2){
	      result = num1 - num2;
	      System.out.print("Result :"+result);
	    }
	    if (total == 3){
	      
	      result = num1 * num2;
	      System.out.print("Result :"+result);
	      
	    }
	    if (total == 4){
	      
	      double sum;
	      sum = num1 / num2 ;
	      
	      System.out.print("Result :"+sum);
	    }
	   }	   
}