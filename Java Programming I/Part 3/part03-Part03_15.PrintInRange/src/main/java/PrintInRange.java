
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(2);
        list.add(-1);
        list.add(13);
        list.add(10);
        
        System.out.println("The numbers in the range [0, 7]");
        printNumbersInRange(list, 0, 7);
        
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int num:numbers){
            if(num>=lowerLimit && num<=upperLimit){
                System.out.println(num);
            }
        }
    }
}
