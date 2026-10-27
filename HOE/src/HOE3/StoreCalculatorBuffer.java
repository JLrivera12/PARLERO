package HOE3;

   import java.io.*;

public class StoreCalculatorBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        
 
         System.out.print("Enter the product name: ");
         String  ProductName= reader.readLine();
         
       
        System.out.print("Enter the product price: ");
        double price = Double.parseDouble(reader.readLine());
        
        
        System.out.print("Enter the product quantity: ");
         int quantity = Integer.parseInt(reader.readLine());
         
       
        System.out.print("Enter the product amountPaid: ");
        double amountPaid = Double.parseDouble(reader.readLine());
         
       
        System.out.print("Enter the product totalCost: ");
        double totalCost = Double.parseDouble(reader.readLine());
         
        
        System.out.print("Enter the product change: ");
        double change = Double.parseDouble(reader.readLine());
        
        
        System.out.print("Enter the product payment: ");
         boolean payment = Boolean.parseBoolean(reader.readLine());
         
        totalCost = quantity * price;
         change = amountPaid - totalCost;
        
         
         System.out.println("");
        System.out.println("Product: " + ProductName);
       System.out.println("Price: " + price);
       System.out.println("Quantity: " + quantity);
       System.out.println("Total Cost: " + totalCost);
        System.out.println("Ammount Paid: " + amountPaid);
        System.out.println("Change: " + change);
         System.out.println("Payment Enough: " + payment);
       
        
    }
}
