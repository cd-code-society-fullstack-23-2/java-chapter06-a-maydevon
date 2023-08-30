package cd.labs.chapter6.partA.heros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class HeroTest {

    private Hero hero1;
    private Hero hero2;
    private Hero hero3;
    private Hero hero4;
    private Hero hero5;



    @BeforeEach
    public void setUp() {
        hero1 = new Hero("Peter Parker", "Spider-Man", "Avengers");
        hero2 = new Hero("Tony Stark", "Iron Man", "Avengers");
        hero3 = new Hero("Carol Danvers", "Captain Marvel", "Avengers");
        hero4 = new Hero("Thor Odinsion", "Thor", "Avengers");
        hero5 = new Hero("Steve Roger", "Captain America", "Avengers");
    }

    @Test
    public void testAddSuperpower() {
        hero1.addSuperpower("Web Slinging");
        hero1.addSuperpower("Wall Crawling");


        List<String> powers = hero1.displayPowers();
        assertEquals(2, powers.size());
        assertTrue(powers.contains("Web Slinging"));
        assertTrue(powers.contains("Wall Crawling"));
    }

    @Test
    public void testRemoveSuperpower() {
        hero1.addSuperpower("Web Slinging");
        hero1.addSuperpower("Wall Crawling");

        assertTrue(hero1.removeSuperpower("Web Slinging"));
        assertFalse(hero1.removeSuperpower("Super Strength"));
    }

    @Test
    public void testTeamUpWith() {
        String teamUpStatement = hero1.teamUpWith(hero2);
        assertEquals("Peter Parker is teaming up with Tony Stark!", teamUpStatement);
    }

    @Test
    public void testBattle() {
        hero1.battle(hero2);
        assertTrue(hero1.getHealthPoints() < 100 || hero2.getHealthPoints() < 100);
    }

    @Test
    public void testGetHeroCount() {
        assertEquals(5, Hero.getHeroCount());
        new Hero("Natasha Romanoff", "Black Widow", "Avengers");
        assertEquals(6, Hero.getHeroCount());
    }
}
