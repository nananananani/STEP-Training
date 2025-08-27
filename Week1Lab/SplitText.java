package Week1Lab;
import java.util.Scanner;

public class SplitText {
  
    static int SLength1(String str){
          str.replace(" ", "");
        for(char i: str.toCharArray()){
            strlen++;
        }
        return strlen;

       }
    static String[] StoWords(String str){
        int len =  SLength1(str);
        int wordcount = 1;
        for(int i=0; i< len; i++){
            if(str.charAt(i)==' '){
               wordcount++;
            }
      
        }
        String[] words = new String[wordcount];
        int wordIndex = 0;
        StringBuilder current = new StringBuilder();
        for(int i=0; i< len; i++){
            if(str.charAt(i)==' '){
                words[wordIndex] = current.toString();
                wordIndex++;
                current.setLength(0);
            }
            else{
                current.append(str.charAt(i));
            }
        }
        words[wordIndex] = current.toString();
        return words;
    }
    public static void main(String[] args){
        int strlen = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Length of the string using user defined function: " + SLength1(str));

    }

    
}
