import java.util.*;

class Player {
    int height;
    int weight;

    Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
}

public class TeamSearch {

    public static void main(String[] args) {

        ArrayList<Player> teamA = new ArrayList<>();
        ArrayList<Player> teamB = new ArrayList<>();

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

        ArrayList<Integer> heightA = new ArrayList<>();
        ArrayList<Integer> heightB = new ArrayList<>();
        ArrayList<Integer> weightA = new ArrayList<>();
        ArrayList<Integer> weightB = new ArrayList<>();

        for (Player p : teamA) {
            heightA.add(p.height);
            weightA.add(p.weight);
        }

        for (Player p : teamB) {
            heightB.add(p.height);
            weightB.add(p.weight);
        }

        System.out.println("TEAM B");

        System.out.println(
                "Jumlah pemain tinggi 168 : "
                        + Collections.frequency(heightB, 168));

        System.out.println(
                "Jumlah pemain tinggi 160 : "
                        + Collections.frequency(heightB, 160));

        System.out.println("\nTEAM A");

        System.out.println(
                "Jumlah pemain berat 56 : "
                        + Collections.frequency(weightA, 56));

        System.out.println(
                "Jumlah pemain berat 53 : "
                        + Collections.frequency(weightA, 53));

        boolean sameHeight = !Collections.disjoint(heightA, heightB);
        boolean sameWeight = !Collections.disjoint(weightA, weightB);

        System.out.println("Ada tinggi yang sama? " + sameHeight);
        System.out.println("Ada berat yang sama? " + sameWeight);
    }
}