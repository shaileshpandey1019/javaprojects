//import java.util.*;
//
//class Team {
//    String name;
//    String votes; // votes represented as a string
//
//    public Team(String name, String votes) {
//        this.name = name;
//        this.votes = votes;
//    }
//
//    public int getVotesAsInt() {
//        return Integer.parseInt(votes); // convert string votes to integer
//    }
//
//    @Override
//    public String toString() {
//        return "Team{" +
//                "name='" + name + '\'' +
//                ", votes='" + votes + '\'' +
//                '}';
//    }
//}
//
//public class TeamRanking {
//    public static void main(String[] args) {
//        List<Team> teams = Arrays.asList(
//                new Team("Team A", "500"),
//                new Team("Team B", "1500"),
//                new Team("Team C", "800"),
//                new Team("Team D", "1200"),
//                new Team("Team E", "600")
//        );
//
//        // Sort the teams by votes in descending order using Collections.sort and a custom comparator
//        Collections.sort(teams, new Comparator<Team>() {
//            @Override
//            public int compare(Team t1, Team t2) {
//                return Integer.compare(t2.getVotesAsInt(), t1.getVotesAsInt()); // descending order
//            }
//        });
//
//        // Print the sorted teams
//        for (Team team : teams) {
//            System.out.println(team);
//        }
//    }
//}
