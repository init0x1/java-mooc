
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        int smallestNum = smallestInList(list);
        System.out.println("Smallest number: "+smallestNum);
        indexOf(smallestNum, list);
        
    }

    public static void indexOf(int query, ArrayList<Integer> list) {
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (query == list.get(i)) {
                index.add(i);
            }
        }

        for (int i = 0; i < index.size(); i++) {
            System.out.println("Found at index: " + index.get(i));
        }
    }
    
    public static int smallestInList(ArrayList<Integer> list){
        int smallestNum = list.get(0);
        for(int i=0; i<list.size(); i++){
            int currentNum = list.get(i); 
            if(currentNum<smallestNum){
                smallestNum=currentNum;
            }
        }
        return smallestNum;
    }

}
