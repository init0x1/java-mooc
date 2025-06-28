import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());
        printFromNumberToOne(input);
    }
    public static void printFromNumberToOne(int num){
        for(int i=num; i>0; i--){
            System.out.println(i);
        }
    }
}
