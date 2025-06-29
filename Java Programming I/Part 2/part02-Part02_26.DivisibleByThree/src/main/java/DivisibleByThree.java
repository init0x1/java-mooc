
import java.util.Scanner;
import jdk.nashorn.api.tree.ContinueTree;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = Integer.valueOf(scanner.nextLine());
        int to = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(from, to);
    }

    public static void divisibleByThreeInRange(int from, int to){
        if(from>to){
            continue;
        }
        for(int i=from; i<=to; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
