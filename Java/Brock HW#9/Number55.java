
public class Number55 {
    public static void main( String [] args){
        int [ ] sums = new int [6];
        sums[0] = 5;
        sums[1] = 6;
        sums[2] = 8;
        sums[3] = 5;
        sums[4] = 9;
        sums[5] = 11;
        
        int totalsums = 0;
        for ( int i = 0; i < sums.length; i++)
        {
             if ( i%2 == 0)
             {
                 i++;
             }
             
             totalsums += sums[i];
        }
        
        System.out.println("The sum of the odd indexs of the array is: " + totalsums );
    }
}
