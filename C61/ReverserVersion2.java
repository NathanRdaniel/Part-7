import java.io.* ;

public class ReverserVersion2{
   public static void main ( String[] args ){
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int[] result = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int length = data.length / 2;
    
    // reverse the data
    for ( int j=0; j < length; j++)
    {
        int reverse = data[(data.length - 1)  - j];
        int temp = data[j];
        data[j] = reverse;
        data[(data.length - 1)  - j] = temp;
        result[j] = data[j];
        result[(data.length - 1)  - j] = data[(data.length - 1)  - j];
        reverse = data[(data.length - 1)  - j];
        temp = data[j];
        data[j] = reverse;
        data[(data.length - 1)  - j] = temp;
    }
      
    // write out the result
    for ( int j=0; j < result.length; j++)
    {
        System.out.print(data[j] + " ");

    }
    System.out.println(" ");
    for ( int j=0; j < result.length; j++)
    {
        System.out.print(result[j] + " ");

    }
    System.out.println(" ");
  }
}      