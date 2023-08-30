package cd.labs.chapter6.partA.heros;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Hero {
    private String name;
    private String alias;
    private String[] superPowers = new String[5];
    private String affiliation;
    private int healthPoints;
    private static int heroCount = 0;

    public Hero(String name, String alias, String affiliation) {
        this.name = name;
        this.alias = alias;
        this.affiliation = affiliation;
        this.healthPoints = 100; // Starting health points
        heroCount++;
    }

    public void addSuperpower(String power) {
        for (int i = 0; i < superPowers.length; i++) {
            if (superPowers[i] == null) {
                superPowers[i] = power;
                break;
            }
        }
    }

    public boolean removeSuperpower(String power) {
        for (int i = 0; i < superPowers.length; i++) {
            if (superPowers[i] != null && superPowers[i].equals(power)) {
                superPowers[i] = null;
                return true;
            }
        }
        return false;
    }

    public List<String> displayPowers() {
        List<String> powersList = new ArrayList<>();
        for (String power : superPowers) {
            if (power != null) {
                powersList.add(power);
            }
        }
        return powersList;
    }

    public String teamUpWith(Hero hero) {
        return this.name + " is teaming up with " + hero.name + "!";
    }

    public String battle(Hero opponent) {
        Random rand = new Random();
        int thisHeroDamage = rand.nextInt(20) + 1;
        int opponentDamage = rand.nextInt(20) + 1;

        if (thisHeroDamage > opponentDamage) {
            opponent.healthPoints -= thisHeroDamage;
            return this.name + " wins the battle!";
        } else if (opponentDamage > thisHeroDamage) {
            this.healthPoints -= opponentDamage;
            return opponent.name + " wins the battle!";
        } else {
            return "It's a draw!";
        }
    }

    public static int getHeroCount() {
        return heroCount;
    }

    // Getters and setters for properties (excluding heroCount)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
