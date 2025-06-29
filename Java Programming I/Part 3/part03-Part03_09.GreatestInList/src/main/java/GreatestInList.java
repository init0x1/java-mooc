
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int greatest = list.get(0);
        for(int i=0; i<list.size(); i++){
            int currentNum = list.get(i);
            if(currentNum>greatest){
                greatest=currentNum;
            }
        }
        System.out.println("The greatest number: "+greatest);
    }
}
