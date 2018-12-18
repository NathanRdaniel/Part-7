import java.util.Scanner;
public class Panagram{
    public static void main(String[] args) {
        boolean isPanagram = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Sentence");
        String sentence = scan.nextLine();
        sentence = sentence.toLowerCase();
        sentence = sentence.trim();
        sentence = sentence.replaceAll(" ","");
        int length = sentence.length();
        int count;
        int[] alphabet = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        char[] sentenceArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] sentencetester = new char[length];
       if (length < 25){
            Panagram.endTask();
        }else{
        for(int i = 0; i < length; i++){
            sentencetester[i] = sentence.charAt(i);
            for(int a = 0; a < 25; a ++){
                if (sentencetester[i] == sentenceArray[a]){
                    alphabet[a] = alphabet[a] + 1;
                    System.out.print(alphabet[a]);
                }
            }

        }
        System.out.println(" ");
        count = 0;
        for(int index = 0; index < 25; index ++){
            if(alphabet[index] > 0){
                  count++;
            }
        }
        if(count == 25){
            System.out.println("This is a Panagram");
        }else{
            System.out.println("This is NOT a Panagram");
        }
        }
    }
    public static int endTask(){
        System.out.println("Good Bye");
        int b = 0;
        return b;
    }

}