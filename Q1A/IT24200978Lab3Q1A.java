import java.util.Scanner;
  public class IT24200978Lab3Q1A {
     public static void main(String[] args) {
            //Declare variables
            double priceof1kg, noOfkg, totalAmount;
            
            //create a scanner object
            Scanner input = new Scanner(System.in);
            System.out.println("priceof1kg:");
            priceof1kg = input.nextDouble();
            System.out.println("noOfkg:");
            noOfkg = input.nextDouble();

            //calculate the total amount
            totalAmount = priceof1kg * noOfkg;

            System.out.println("Total amount is:" + totalAmount);
      }
   }