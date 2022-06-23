import java.util.Scanner;
public class ReverseNumber {
   public static void main (String[] args) {
   int number, initialNumber, lastDigit, reverse = 0;
   
   Scanner scan = new Scanner (System.in);
   System.out.print ("Enter a positive integer: ");
   number = scan.nextInt();

   while (number <= 0){
       System.out.print("Please enter a positive number: ");
       number = scan.nextInt();
   }

   initialNumber = number;
   do {
         lastDigit = number % 10;
         reverse = (reverse * 10) + lastDigit;
         number = number / 10; }
   while (number > 0);
   System.out.println (initialNumber + " reversed is " + reverse);
   }
  }