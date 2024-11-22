import java.util.Scanner;
  public class IT24200978Lab3Q1B {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of 1kg of rice:");
        double pricePerkg = input.nextDouble();
        System.out.println("Enter the number of kilograms you want to buy:");
        double kilograms = input.nextDouble();
        double totalBill = pricePerkg * kilograms;
        double discountAmount = totalBill * 0.10;
        double finalAmount = totalBill - discountAmount;
        System.out.println("The total amount with 10% discount is:" + finalAmount);
     }
   }