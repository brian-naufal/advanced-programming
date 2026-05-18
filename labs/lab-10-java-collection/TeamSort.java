import java.util.*;

class Player {
    int height;
    int weight;

    Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return "Height: " + height + ", Weight: " + weight;
    }
}

class SortByHeightAsc implements Comparator<Player> {
    public int compare(Player a, Player b) {
        return Integer.compare(a.height, b.height);
    }
}

class SortByHeightDesc implements Comparator<Player> {
    public int compare(Player a, Player b) {
        return Integer.compare(b.height, a.height);
    }
}

class SortByWeightAsc implements Comparator<Player> {
    public int compare(Player a, Player b) {
        return Integer.compare(a.weight, b.weight);
    }
}

class SortByWeightDesc implements Comparator<Player> {
    public int compare(Player a, Player b) {
        return Integer.compare(b.weight, a.weight);
    }
}

public class TeamSort {

    static void printTeam(String title, ArrayList<Player> team) {
        System.out.println("\n" + title);

        for (Player p : team) {
            System.out.println(p);
        }
    }

    static void findMinMax(ArrayList<Player> team, String teamName) {
        int minHeight = team.get(0).height;
        int maxHeight = team.get(0).height;

        int minWeight = team.get(0).weight;
        int maxWeight = team.get(0).weight;

        for (Player p : team) {
            if (p.height < minHeight) {
                minHeight = p.height;
            }

            if (p.height > maxHeight) {
                maxHeight = p.height;
            }

            if (p.weight < minWeight) {
                minWeight = p.weight;
            }

            if (p.weight > maxWeight) {
                maxWeight = p.weight;
            }
        }

        System.out.println("\n" + teamName);
        System.out.println("Tinggi Min : " + minHeight);
        System.out.println("Tinggi Max : " + maxHeight);
        System.out.println("Berat Min : " + minWeight);
        System.out.println("Berat Max : " + maxWeight);
    }

    public static void main(String[] args) {

        ArrayList<Player> teamA = new ArrayList<Player>();

        teamA.add(new Player(168, 50));
        teamA.add(new Player(170, 60));
        teamA.add(new Player(165, 56));
        teamA.add(new Player(168, 55));
        teamA.add(new Player(172, 60));
        teamA.add(new Player(170, 70));
        teamA.add(new Player(169, 66));
        teamA.add(new Player(165, 56));
        teamA.add(new Player(171, 72));
        teamA.add(new Player(166, 56));

        ArrayList<Player> teamB = new ArrayList<Player>();

        teamB.add(new Player(170, 66));
        teamB.add(new Player(167, 60));
        teamB.add(new Player(165, 59));
        teamB.add(new Player(166, 58));
        teamB.add(new Player(168, 58));
        teamB.add(new Player(175, 71));
        teamB.add(new Player(172, 68));
        teamB.add(new Player(171, 68));
        teamB.add(new Player(168, 65));
        teamB.add(new Player(169, 60));

        Collections.sort(teamA, new SortByHeightAsc());
        printTeam("Team A - Height Ascending", teamA);

        Collections.sort(teamB, new SortByHeightAsc());
        printTeam("Team B - Height Ascending", teamB);

        Collections.sort(teamA, new SortByHeightDesc());
        printTeam("Team A - Height Descending", teamA);

        Collections.sort(teamB, new SortByHeightDesc());
        printTeam("Team B - Height Descending", teamB);

        Collections.sort(teamA, new SortByWeightAsc());
        printTeam("Team A - Weight Ascending", teamA);

        Collections.sort(teamB, new SortByWeightAsc());
        printTeam("Team B - Weight Ascending", teamB);

        Collections.sort(teamA, new SortByWeightDesc());
        printTeam("Team A - Weight Descending", teamA);

        Collections.sort(teamB, new SortByWeightDesc());
        printTeam("Team B - Weight Descending", teamB);

        findMinMax(teamA, "Team A");
        findMinMax(teamB, "Team B");

        ArrayList<Player> teamC = new ArrayList<Player>();

        teamC.addAll(teamB);

        printTeam("Team C", teamC);
    }
}