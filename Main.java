import java.util.Scanner;  	  	   
	
public class Main {  		  	 	
	
  public static void main(String[]args){		 		  
	
  Scanner input=new Scanner(System.in); 		 		  
	
  System.out.print("Enter a number:"); 		 				
	
  Integer num1=input.nextInt();  	 		  
	
  System.out.print("Enter a second number:"); 	     
	
  Integer num2=input.nextInt();  			 			
	
  Integer result;  		 				
	
  result = num1+num2; 			  	 
	
  System.out.print(num1+" + "+num2); 		 		  
	
  System.out.print(" = "+result); 		  	  
	
  input.close();
}
}
