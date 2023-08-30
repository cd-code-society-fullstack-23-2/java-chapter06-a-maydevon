package cd.labs.chapter6.partB.players;

import cd.labs.chapter6.partA.heros.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    void testAddSkill() {
        Player player = new Player("John Doe", 25, "Striker");
        player.addSkill("Passing");
        player.addSkill("Shooting");

        Assertions.assertTrue(player.displaySkills().contains("Passing"));
        Assertions.assertTrue(player.displaySkills().contains("Shooting"));
    }

    @Test
    void testRemoveSkill() {
        Player player = new Player("Jane Smith", 28, "Defender");
        player.addSkill("Tackling");
        player.addSkill("Blocking");

        Assertions.assertTrue(player.removeSkill("Tackling"));
        Assertions.assertFalse(player.displaySkills().contains("Tackling"));
    }

    @Test
    void testTeamUpWith() {
        Player player1 = new Player("Michael Johnson", 22, "Midfielder");
        Player player2 = new Player("Emily White", 26, "Goalkeeper");

        Assertions.assertEquals("Michael Johnson is teaming up with Emily White", player1.teamUpWith(player2));
    }

    @Test
    void testCompeteWith() {
        Player player1 = new Player("David Brown", 24, "Midfielder");
        Player player2 = new Player("Opponent Player", 25, "Defender");

        String result = player1.competeWith(player2);
        Assertions.assertTrue(result.equals("David Brown scores!") || result.equals("Opponent Player scores!"));
    }

    @Test
    void testGetPlayerCount() {
        int initialCount = Player.getPlayerCount();
        Player player1 = new Player("John Doe", 25, "Striker");
        Player player2 = new Player("Jane Smith", 28, "Defender");

        int finalCount = Player.getPlayerCount();
        Assertions.assertEquals(initialCount + 2, finalCount);
    }

}
