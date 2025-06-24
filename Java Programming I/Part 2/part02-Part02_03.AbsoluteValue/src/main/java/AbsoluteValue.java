
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        input=(input<0)?input*=-1:input;
        
        System.out.println(input);
        
    }
}
