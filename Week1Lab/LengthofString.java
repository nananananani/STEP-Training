package Week1Lab;
import java.util.Scanner;

public class LengthofString {
    static int findlength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.println("Length of the string using user defined function: " + findlength(str));
        System.out.println("Length of the string using inbuilt function: " + str.length());

    }

    
}
