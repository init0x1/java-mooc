
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchKey = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            boolean found = false;
            while (fileScanner.hasNextLine()) {
                if (searchKey.equals(fileScanner.nextLine())) {
                    System.out.println("Found!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }
}
