
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            System.out.println(words[(words.length)-1]);
        }
        scanner.close();

    }
}
