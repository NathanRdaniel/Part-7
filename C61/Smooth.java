import java.io.* ;

class Smooth
{

  public static void main ( String[] args )  
  {
    int[] signal  = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
    int[] smooth = new int[ signal.length];
    int sum;
    int add;
    // compute the smoothed value for each
    //  cell of the array smooth
    for (int i = 0; i <  signal.length; i++  )
    {
        if(i == 0){
            add = signal [i] + signal[i + 1];
            sum = add/2;
        } else if(i == signal.length - 1 ){
            add = signal [i - 1] + signal[i];
            sum = add/2;
        }else{
    add = signal[i -1] + signal [i] + signal[i + 1];
    sum = add / 3;
        }
smooth[i] = sum;
    }
      
    // write out the input
    System.out.print("Signal:  ");
    for ( int i=0; i < smooth.length; i++)
    {
System.out.print(signal[i]);
    }
    System.out.println("");
    // write out the result
System.out.print("Smooth:  ");
    for ( int i=0; i < smooth.length; i++)
    {
        System.out.print(smooth[i]);
    }
    System.out.println("");

  }
}      