
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestOneName = "";
        int oldestOneAge = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] user = input.split(",");
            String currentUserName = user[0];
            int currentUserAge = Integer.valueOf(user[1]);
            if (currentUserAge > oldestOneAge) {
                oldestOneAge = currentUserAge;
                oldestOneName = currentUserName;
            }
        }

        System.out.println("Name of the oldest: " + oldestOneName);
        scanner.close();

    }
}
