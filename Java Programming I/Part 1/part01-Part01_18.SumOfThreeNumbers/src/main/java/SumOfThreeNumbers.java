
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextInt());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextInt()); 
        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scanner.nextInt()); 
        System.out.println("The sum of the numbers is "+(firstNum+secondNum+thirdNum));


    }
}
