
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Enter numbers: ");
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            allNumbers.addNumber(input);

            if(input %2 == 0 ){
                evenNumbers.addNumber(input);
            }else{
                oddNumbers.addNumber(input);
            }

        }
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}
