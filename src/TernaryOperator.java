public class TernaryOperator {

    public static void main(String[] args) {
     


        int x = 4, y = 9;
        
         // Use a ternary operator to perform the same logic as above.
        x = (y / x < 3) ? (x += y) : (x *= y);
         System.out.println("After if stmt, x = " + x);
    }
}

      
    
