
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSumOfYears = 0;
        String longestUserName = "";
        int counter = 0;
        double avg = 0.0;
        while (scanner.hasNextLine()) {

            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] user = input.split(",");
            String userName = user[0];
            int userBithYear = Integer.valueOf(user[1]);

            if (userName.length() > longestUserName.length()) {
                longestUserName = userName;
            }

            totalSumOfYears += userBithYear;
            counter++;

            avg = totalSumOfYears / (double) counter;


        }

        System.out.println("Longest name: " + longestUserName);
        System.out.println("Average of the birth years: " + avg);

    }
}
