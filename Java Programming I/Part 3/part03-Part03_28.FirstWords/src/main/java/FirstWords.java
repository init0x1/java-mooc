
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            System.out.println(words[0]);
        }
        scanner.close();

    }
}
