
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestOne = 0;
        while (scanner.hasNextLine()) {

            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] user = input.split(",");
            String userName = user[0];
            int userAge = Integer.valueOf(user[1]);

            if (userAge > oldestOne) {
                oldestOne = userAge;
            }
        }
        System.out.println("Age of the oldest: " + oldestOne);
        scanner.close();

    }
}
