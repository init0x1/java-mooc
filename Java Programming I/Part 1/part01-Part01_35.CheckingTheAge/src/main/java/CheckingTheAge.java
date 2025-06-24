
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scan.nextInt();
        System.out.println((age<0||age>120)?"Impossible!":"OK");
        
        
    }
}
