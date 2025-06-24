
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDays = scanner.nextInt();
        int result = numberOfSecondsPerDay(numberOfDays);
        System.out.println(result);
        
    }
    
    public static int numberOfSecondsPerDay(int days){
          return days*24*60*60;
    };
    
}
