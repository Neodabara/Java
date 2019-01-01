
import java.util.ArrayList;

public class Number83 {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>( );
        list.add( new Integer( 34 ) );
        list.add( new Integer( 89 ) );
        list.add(65);
        
        int sum = 0;
        for ( int i = 0; i < list.size( ); i++)
        {
            sum += list.get(i);
        }
        
        System.out.println("The sum of the ArrayList is: " + sum);
    }
}
