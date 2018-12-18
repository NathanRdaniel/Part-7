public class SquareCube{
    public static void main(String[] args) {
        int[] numberCounter = {0,0,0,0,0,0,0,0,0,0};
                             //0,1,2,3,4,5,6,7,8,9
        int number = 8;
        int square = number * number;
        int cube = number * number * number;
        int squareDivide;
        int cubeDivide;
       
        for(int i = 0; i <= 1;){
            squareDivide = square % 10;
            square = square / 10;
            System.out.println(squareDivide);
            numberCounter[squareDivide] =  numberCounter[squareDivide] + 1;
            if (square < 10){
                squareDivide = square % 10;
                numberCounter[squareDivide ] =  numberCounter[squareDivide] + 1;
                System.out.println(squareDivide);
                i = 2;
            }
            
            }
            for(int i = 0; i <= 1;){
                cubeDivide = cube % 10;
                cube = cube / 10;
                System.out.println(cubeDivide);
                numberCounter[cubeDivide] =  numberCounter[cubeDivide] + 1;
                if (cube < 10){
                    cubeDivide = cube % 10;
                    numberCounter[cubeDivide] =  numberCounter[cubeDivide] + 1;
                    System.out.println(cubeDivide);
                    i = 2;
                }
                
                }
                System.out.println(" ");
            for(int i = 0; i < numberCounter.length; i++){
                if (numberCounter[i] > 1){
                    System.out.println("Repeats");
                    i = numberCounter.length + 1;
                }if (i == numberCounter.length - 1){
                    System.out.println("No Repeats");
                }
            
        }
    }
}