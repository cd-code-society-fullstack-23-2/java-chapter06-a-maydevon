package cd.labs.chapter6.partB;

import cd.labs.chapter6.partB.players.Player;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("John Doe", 25, "Striker");
        Player player2 = new Player("Jane Smith", 28, "Defender");
        Player player3 = new Player("Michael Johnson", 22, "Midfielder");
        Player player4 = new Player("Emily White", 26, "Goalkeeper");
        Player player5 = new Player("David Brown", 24, "Midfielder");

        player1.addSkill("Passing");
        player1.addSkill("Shooting");
        player2.addSkill("Tackling");
        player3.addSkill("Dribbling");
        player4.addSkill("Saving");
        player5.addSkill("Heading");

        System.out.println(player1.competeWith(player3));
        System.out.println(player2.competeWith(player4));

        System.out.println("Total players created: " + Player.getPlayerCount());
    }
}






