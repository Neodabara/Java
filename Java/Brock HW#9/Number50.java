
public class Number50 {
    public static void main( String [] args){
        int [ ] products = new int [6];
        products[0] = 5;
        products[1] = 6;
        products[2] = 8;
        products[3] = 5;
        products[4] = 9;
        products[5] = 11;
        
        int totalproducts = 1;
        for ( int i = 0; i < products.length; i++)
        {
            totalproducts = totalproducts * products[i]; 
        }
        
        System.out.println("The product of the array is: " + totalproducts);
    }
}
