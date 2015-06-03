import java.util.Scanner;
public class Exercise3{
  
  public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    
    introduction();
    
    int i = myScanner.nextInt();
    int j = myScanner.nextInt();
    float quotient = (float)i/j;
    println("The quotient of the two provided numbers is: " + quotient);
    
  }
  
  private static void introduction(){
    println("Welcome to Exercise 3");
    println("Please provide 2 integer numbers: ");
  }

  
  
  
  private static void println(String s){
    System.out.println(s);
  }
}