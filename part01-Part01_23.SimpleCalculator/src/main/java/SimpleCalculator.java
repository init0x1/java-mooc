
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int sum=firstNum+secondNum;
        int sub = firstNum-secondNum;
        int mult = firstNum*secondNum;
        double div = (double)firstNum/(double)secondNum;
        
        System.out.println(firstNum+" + "+secondNum+" = "+sum);
        System.out.println(firstNum+" - "+secondNum+" = "+sub);
        System.out.println(firstNum+" * "+secondNum+" = "+mult);
        System.out.println(firstNum+" / "+secondNum+" = "+div);

    }
}
