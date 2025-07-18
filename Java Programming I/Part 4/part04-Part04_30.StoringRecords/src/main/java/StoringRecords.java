
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.equals("")) {
                    break;
                }
                String [] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                persons.add(new Person(name,age));
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
        return persons;

    }
}
