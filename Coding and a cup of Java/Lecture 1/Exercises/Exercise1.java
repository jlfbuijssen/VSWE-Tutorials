import java.util.Scanner;
import java.util.Random;
public class Exercise1 {
  
  public static void main(String[] args){
    int x,y;
    boolean choice;
    
    // Welcome user and ask for input
    introduction();
    //Wait for correct input
    choice = choice();
    
    // Either wait for value for x and y or generate random x and y depending on given choice
    x = initInteger(choice, 'x');
    y = initInteger(choice, 'y');
    
    // Swapp values of x and y and show results
    preformSwap(x,y);
  }
  
  private static void introduction(){
    println("Welcome to Exercise 1.");
    println("Would you like to set your own values for x and y? (y/n)");
  }
  
  private static boolean choice(){
    Scanner myScanner = new Scanner(System.in);
    // Create variable to store the choice in:
    char c = myScanner.next().charAt(0);
    boolean choice = false;
    
    if(c == 'y'){
      choice = true;
    } else if (c == 'n'){
      choice = false;
    } else {
      println("Incorrect input, please input y or n");
      choice = choice();
    }
    return choice;
  }
  
  private static int initInteger(boolean choice, char var){
    int i;
    Scanner myScanner = new Scanner(System.in);
    
    if (choice){
      println("Please set your value for " + var + ": ");
      i = myScanner.nextInt();
    } else {
      Random rand = new Random();
      println("Generating random value for " + var + "...");
      i = rand.nextInt();
    }
    return i;
  }
  
  private static void preformSwap(int x, int y){
    int temp;
    String s;
    
    s = "The value of x = ";
    s += x;
    s += " and y = ";
    s += y;
    s += ".";
    
    println(s);
    println("Interchanging x and y...");
    
    temp = x;
    x = y;
    y = temp;
    
    s = "The new values of x and y are: x = ";
    s += x;
    s += " and y = ";
    s += y;
    s +=".";
    
    println(s);
  }
  
  private static void println(String text){
    System.out.println(text);
  }
  

  
}