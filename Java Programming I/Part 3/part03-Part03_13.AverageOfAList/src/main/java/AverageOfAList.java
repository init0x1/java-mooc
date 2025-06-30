
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

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
        
        int totalSum=0;
        double listSize = list.size();
        for(int num:list){
            totalSum+=num;
        }
        
        System.out.println("Average: "+(totalSum/listSize));
        
    }
}
