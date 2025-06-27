
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int totalSum = 0;
        int totalNum = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + totalSum);
                System.out.println("Numbers: " + totalNum);
                System.out.println("Average: " + avg);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
            totalSum += input;
            totalNum++;
            avg = (totalNum > 0) ? (double) totalSum / totalNum : 0;

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
    }
}
