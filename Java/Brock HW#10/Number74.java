
public class Number74 {
    public static void main(String [] args){
        int [ ][ ]sums = new int [6][2];
        sums[0][0] = 5;
        sums[0][1] = 1;
        sums[1][0] = 2;
        sums[1][1] = 6;
        sums[2][0] = 8;
        sums[2][1] = 3;
        sums[3][0] = 4;
        sums[3][1] = 5;
        sums[4][0] = 9;
        sums[4][1] = 6;
        sums[5][0] = 7;
        sums[5][1] = 11;
        
        int lastsum = sums[0].length;
        for ( int i = 1; i < sums.length; i++)
        {
            if ( sums[i].length > lastsum)
            {
                lastsum = sums[i].length;
            }
        }
        for ( int j = 0; j < lastsum; j++)
        {
            for ( int i = 0; i < sums.length; i++)
            {
                if( j < sums[i].length){
                    lastsum += sums[i][sums[sums.length-1].length-1];
                    System.out.println("The sum of the last coloum is:" + lastsum);
               }
            }
        }
        }
    }

