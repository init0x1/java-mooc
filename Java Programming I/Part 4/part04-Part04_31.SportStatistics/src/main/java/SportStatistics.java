import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileName = scan.nextLine();

        ArrayList<Match> matches = readMatchesFromFile(fileName);

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        System.out.println("Games: " + getGames(matches, teamName));
        getTeamStatistics(matches, teamName);
    }

    public static ArrayList<Match> readMatchesFromFile(String fileName) {
        ArrayList<Match> matches = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.equals("")) {
                    break;
                }
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String homeTeam = parts[0];
                    String visitingTeam = parts[1];
                    int homePoints = Integer.parseInt(parts[2]);
                    int visitingPoints = Integer.parseInt(parts[3]);
                    matches.add(new Match(homeTeam, visitingTeam, homePoints, visitingPoints));
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
        return matches;
    }

    public static int getGames(ArrayList<Match> matches, String teamName) {
        int numberOfMatches = 0;
        for (Match match : matches) {
            if (match.getHomeTeam().equals(teamName) || match.getVisitingTeam().equals(teamName)) {
                numberOfMatches++;
            }
        }
        return numberOfMatches;
    }

    public static void getTeamStatistics(ArrayList<Match> matches, String teamName) {
        int wins = 0;
        int losses = 0;

        for (Match match : matches) {

            if (match.getHomeTeam().equals(teamName) || match.getVisitingTeam().equals(teamName)) {
                boolean teamWon = false;
                if (match.getHomeTeam().equals(teamName)) {
                    teamWon = match.getHomePoints() > match.getVisitingPoints();
                } else {
                    teamWon = match.getVisitingPoints() > match.getHomePoints();
                }

                if (teamWon) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
