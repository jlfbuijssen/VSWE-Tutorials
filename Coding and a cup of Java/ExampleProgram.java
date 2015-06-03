import java.util.Scanner;

public class ExampleProgram {
  
  /* This is a multiline comment used for demonstration services
   */
  
  public static void main(String[] args){
    System.out.println("Please enter two integers");
    //We need a scanner to get some user input
    Scanner myScanner = new Scanner(System.in);
    
    int i1 = myScanner.nextInt();
    int i2 = myScanner.nextInt();
    int sum = i1 + i2;
    
    System.out.println("The sum of the integers is " + sum);
  }
  
}