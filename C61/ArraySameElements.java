class ArraySameElements
{
  
  
  
    public static boolean sameElts( int[] a, int[] b )
  {
      int[] arrayACounter = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      int[] arrayBCounter = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      for(int i = 0; i > a.length; i++){
          arrayACounter[a[i]] = arrayACounter[a[i]] + 1;
          arrayBCounter[b[i]] = arrayBCounter[b[i]] + 1;
      }
      int count = 0;
      System.out.println( "DIFFERENT elements" );
      System.out.println( "DIFFERENT elements" );
    for(int i = 0; i < a.length; i ++){  
    if(arrayACounter[i] == arrayBCounter[i] ){
          count = count + 1;
          
      }else{
      }
    }
    if(count== a.length){
        return true;
    }else{
        return false;
    }

  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    if ( ArraySameElements.sameElts( arrayA,arrayB )  == true){

      System.out.println( "Same Elements" );
    }else{
      System.out.println( "DIFFERENT elements" );      
    }
  }
}