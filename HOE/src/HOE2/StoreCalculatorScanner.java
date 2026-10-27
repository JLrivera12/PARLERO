package HOE2;

import java.util.Scanner;

public class StoreCalculatorScanner {
    public static void main(String[] args){
        
         Scanner stdin = new Scanner (System.in);
                 
        String productName;
        
         System.out.print("Enter the product name: ");
         product = stdin.nextLine();
         
        double price;
        System.out.print("Enter the product price: ");
    price = stdin.nextDouble();
        
        int quantity;
        System.out.print("Enter the product quantity: ");
         quantity = stdin.nextInt();
         
        double amountPaid;
        System.out.print("Enter the product ammountPaid: ");
         amountPaid = stdin.nextDouble();
         
        double totalCost;
        System.out.print("Enter the product totalCost: ");
         totalCost = stdin.nextDouble();
         
        double change;
        System.out.print("Enter the product change: ");
        change = stdin.nextDouble();
        
        boolean payment;
        System.out.print("Enter the product payment: ");
         payment = stdin.nextBoolean();
         
        totalCost = (price * quantity);
         change = amountPaid - totalCost;
        
       System.out.println("Product: " + productName);
       System.out.println("Price: " + price);
       System.out.println("Quantity: " + quantity);
       System.out.println("Total Cost: " + totalCost);
       System.out.println("Amount Paid: " + amountPaid);
       System.out.println("Change: " + change);
       System.out.println("Payment Enough: " + payment);
       
        
    }
}