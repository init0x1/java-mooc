
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String firstStr = scan.nextLine();
        System.out.println("Enter the second string:");
        String secondStr = scan.nextLine();
        //"Same". Otherwise, it prints "Different"
        System.out.println(firstStr.equals(secondStr)?"Same":"Different");

    }
}
