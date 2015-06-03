import java.util.Scanner;

public class ExampleProgram {
  
  /* This is a multiline comment used for demonstration services
   */
  
  public static void main(String[] args){
    System.out.println("Please enter two integers");
    //We need a scanner to get some user input
    Scanner myScanner = new Scanner(System.in);
    
    //print out the result
    System.out.println("The sum of the integers is");
    System.out.println(myScanner.nextInt() + myScanner.nextInt());
  }
  
}