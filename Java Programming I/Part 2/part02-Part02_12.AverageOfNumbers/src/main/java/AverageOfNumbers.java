
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            totalSum += number;
            if (number == 0) {
                double avg = totalSum/counter;
                System.out.println("Average of the numbers: " + avg);
                break;
            }
            counter++;
        }
    }
}
