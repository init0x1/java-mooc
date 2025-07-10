
import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Numbers: "+numsFromFile(file,lowerBound,upperBound));
    }

    public static int numsFromFile(String file, int lowerBound, int upperBound){
        int result = 0;
        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()){
                int currentNum = Integer.valueOf(fileScanner.nextLine());
                if( currentNum >= lowerBound && currentNum<=upperBound){
                    result++;
                }
            }


        }catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return result;
    }

}
