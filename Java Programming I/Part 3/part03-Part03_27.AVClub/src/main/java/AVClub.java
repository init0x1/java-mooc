
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            
            for(String word:words){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
           
        }
        scanner.close();

    }
}
