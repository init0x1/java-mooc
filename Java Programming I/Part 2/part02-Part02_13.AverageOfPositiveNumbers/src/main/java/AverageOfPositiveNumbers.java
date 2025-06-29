
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSumOfPositive = 0;
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());

            if (number == 0) {
                if(totalSumOfPositive==0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                double avg = totalSumOfPositive / counter;
                System.out.println("Average of the numbers: " + avg);
                break;
            }
            if(number>0){
                totalSumOfPositive += number;
                counter++;
            }
        }
    }
}
