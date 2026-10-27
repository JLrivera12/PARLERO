
package HOE4;

public class Geeks {
    public static void main(String[] args) {
        
        int n = 10;
        int m = 0;
        
        try {
            int ans = n / m;
            System.out.println("Answer: " + ans);
        }catch (ArithmeticException e){
            System.out.println("Error: Devision by 0!");
        }
        finally{
            System.out.println("This line will execute every time the program run");
        
        }
    }
  
}
