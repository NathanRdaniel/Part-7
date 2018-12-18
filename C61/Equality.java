import java.util.Arrays;

public class Equality{
  
  
  public static void main ( String[] args ) {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };
 
    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayA, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( Arrays.equals( arrayA, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );   
      
      if(Equality.myEquals(arrayA, arrayB) == true){
        System.out.println( "Equal" );
      }
  }
  public static boolean myEquals( int[] a, int[] b ){
    int count = 0;
    for(int i = 0; i < a.length; i ++){  
    if(a[i] == b[i] ){
          count = count + 1;
          
      }else{
          return false;
      }
    }
    if(count== a.length){
        return true;
    }else{
        return false;
    }
      
  }
}