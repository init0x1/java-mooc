
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String[] user1 = {"alex", "sunshine"};
        String[] user2 = {"emma", "haskell"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (userName.equals(user1[0]) && password.equals(user1[1])
                || userName.equals(user2[0]) && password.equals(user2[1])) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
