import java.io.* ;

public class Sum{
  public static void main ( String[] args ) {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    int evenSum = 0;
    int oddSum = 0;
    int overallSum = 0;
    
    // compute the sums
    for ( int i=0; i < data.length; i++)
    {
        int checker = data[i] % 2;
        if (checker == 0){
            evenSum = evenSum + data[i];
        }
        else{
                oddSum = oddSum + data[i];
        }
        overallSum = overallSum + data[i];
    }
      
    // write out the three sums 
    System.out.println(evenSum +" " + oddSum +" " + overallSum );

  }
}      