import java.util.Scanner;
public class  simpleCalculator {
 public static void main(String[]args){
 Scanner se = new Scanner(System.in);
 System.out.println("Welcome to calculator");
 System.out.println("Enter your first number");
 double num1 = se.nextDouble();
 System.out.println("Enter your second number");
 double num2 = se.nextDouble();
 System.out.println("Select an operator(+,-,*,/):");
 char operator = se.next().charAt(0);
 double Result ;
 switch(operator){
 case '+' :
 Result = num1 + num2;
 break;
 case '-':
 Result = num1 - num2;
 break;
 case '*':
 Result = num1 * num2;
 break;
 case '/':
 if(num2 != 0){
 Result = num1/num2;
   }else{
   System.out.println("Division by zero is not allowed.");
 return;
   }
 break;
 default:
 System.out.println("Invalid operator!");
   return;
  }
 System.out.println("The result is " + Result);
 se.close();
 }
}