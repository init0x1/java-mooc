import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        double avg = (firstNum + secondNum) / 2.0;

        System.out.println("The average is " + avg);
    }
}
