package HOE5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.Scanner;

public class StoreCalculatorIO {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    try {
        FileWriter myObj = new FileWriter("src/HOE5/StoreRecord.txt");
        
        System.out.println("Enter the product name: ");
        String productName = input.nextLine();
        myObj.write(productName + "\n");
   
        System.out.print("Enter the product price: ");
        double price = input.nextDouble();
        myObj.write("Price: " + price + "\n");
        
        System.out.print("Enter the product quantity: ");
        int quantity = input.nextInt();
        myObj.write("Quantity: " + quantity + "\n");
        
        System.out.print("Enter the product ammountPaid: ");
         double amountPaid = input.nextDouble();
         myObj.write("Amount Paid: " + amountPaid + "\n");
         
        System.out.print("Enter the product totalCost: ");
        double totalCost = input.nextDouble();
         myObj.write("Total Cost: " + totalCost + "\n");
        
        System.out.print("Enter the product change: ");
        double change = input.nextDouble();
        myObj.write("Change: " + change + "\n");
       
        System.out.print("Payment is Enough?: ");
         boolean payment = input.nextBoolean();
        myObj.write("Payment is Enough: " + payment + "\n");
        
       System.out.println("Product: " + productName);
       System.out.println("Price: " + price);
       System.out.println("Quantity: " + quantity);
       System.out.println("Total Cost: " + totalCost);
       System.out.println("Amount Paid: " + amountPaid);
       System.out.println("Change: " + change);
       System.out.println("Payment Enough: " + payment);
       
        myObj.close();
    }catch (IOException e){
        System.out.println("An error occcured.");
        e.printStackTrace();
    }finally {
        input.close();
    }
    }
}
