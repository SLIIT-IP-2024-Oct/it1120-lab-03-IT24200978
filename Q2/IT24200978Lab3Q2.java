import java.util.Scanner;
   public class IT24200978Lab3Q2 {
      public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.println("Enter the monthly salary:");
         double monthlySalary = input.nextDouble();
         System.out.println("Enter the number of otHours:");
         double otHours = input.nextDouble();
         System.out.println("Enter the OT rate per hour:");
         double otRate = input.nextDouble();
         double otAmount = otHours * otRate;
         double totalSalary = monthlySalary + otAmount;
         System.out.println("The total salary including OT is:" + totalSalary);
       }
    } 
