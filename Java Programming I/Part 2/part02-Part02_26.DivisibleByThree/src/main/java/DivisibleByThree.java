
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = Integer.valueOf(scanner.nextLine());
        int to = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(from, to);
    }

    public static void divisibleByThreeInRange(int from, int to){
        for(int i=from; i<=to; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
