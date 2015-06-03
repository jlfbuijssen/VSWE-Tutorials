import java.util.Scanner;

public class Exercise2 {
  
  public static void main(String[] args){
    int[] number = new int[3];
    
    introduction();
    
    for (int i = 0; i < 3; i++){
      number[i] = inputNumber(i);
    }
    
    executeProgram(number);
    
  }
  
  private static void introduction(){
    println("Welcome to Exercise2");
    println("Please enter 3 integer numbers: ");
  }
  
  private static int inputNumber(int i){
    Scanner myScanner = new Scanner(System.in);
    println("Number " + ++i +":");
    return myScanner.nextInt();
  }
  
  private static void executeProgram(int[] i){
    String conclusion = "(" + i[0] + " + " + i[1] +") * " + i[2] + " = ";
    int sum = i[0] + i[1];
    int result = sum * i[2];
    conclusion += result;
    
    println(conclusion);
    
  }
  
  private static void println(String s){
    System.out.println(s);
  }
  
}