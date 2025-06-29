
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int target = 100;
        
        for(int i=number;number<=target;number++){
            System.out.println(number);
        }
    }
}
