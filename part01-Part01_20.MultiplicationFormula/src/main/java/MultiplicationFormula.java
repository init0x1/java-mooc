
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextInt());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextInt()); 
        int mult = (firstNum*secondNum);
        System.out.println(firstNum+" * "+secondNum+" = "+mult );

    }
}
