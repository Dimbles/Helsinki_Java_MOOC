
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        //reading data from file 
        try ( Scanner scanner = new Scanner(Paths.get(file));) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                data.add(line);

            }
        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }

        //counting number of games played by team
        System.out.println("Team: ");
        String team = scan.nextLine();

        //counting number of games, wins and losses 
        int count = 0;
        int wins = 0;
        int losses = 0;

        for (String line : data) {
            //split line into sections
            String winner = "no winner";
            String[] parts = line.split(",");
            String name1 = parts[0];
            String name2 = parts[1];
            int score1 = Integer.valueOf(parts[2]);
            int score2 = Integer.valueOf(parts[3]);

            
            //checking if line contains team name 
            if (line.contains(team)) {
                count += 1;
                //checking which team won
                if (score1 > score2) {
                    winner = name1;
                } else {
                    winner = name2;
                }

                if (winner.equals(team)) {
                    wins += 1;
                } else {
                    losses += 1;
                }
            }
            
            
            
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
