
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String input = scanner.nextLine();
        String msg =  (!(input.equals("true"))) ? "Try again!" : "You got it right!"; 
        System.out.println(msg);
    }
}
