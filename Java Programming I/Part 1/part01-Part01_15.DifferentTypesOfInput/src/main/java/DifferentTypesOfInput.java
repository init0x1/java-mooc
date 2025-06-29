
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String strInput = scan.nextLine();
        //System.out.println(strInput);
        System.out.println("Give an integer:");
        int intIput = Integer.valueOf(scan.nextLine());
        //System.out.println(intIput);
        System.out.println("Give a double:");
        double doubleInput = Double.valueOf(scan.nextLine());
        //System.out.println(doubleInput);
        System.out.println("Give a boolean:");
        boolean boolInput = Boolean.valueOf(scan.nextLine());
        //System.out.println(boolInput);
        System.out.println("You gave the string "+strInput);
        System.out.println("You gave the integer "+intIput);
        System.out.println("You gave the double "+doubleInput);
        System.out.println("You gave the boolean "+boolInput);
        
        

    }
}
