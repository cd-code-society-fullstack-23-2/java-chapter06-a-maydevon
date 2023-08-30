package cd.labs.chapter6.partB.players;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private String name;
    private int age;
    private String[] skills = new String[5];
    private String position;
    private int goalsScored;
    private static int playerCount = 0;

    //-------------------------------------------------------//

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
        playerCount++;
    }

    public void addSkill(String skill) {
        for (int i = 0; i < skills.length; i++) {
            if (skills[i] == null) {
                skills[i] = skill;
                break;
            }
        }
    }

    protected boolean removeSkill(String skill) {
        for (int i = 0; i < skills.length; i++) {
            if (skills[i] != null && skills[i].equals(skill)) {
                skills[i] = null;
                return true;
            }
        }
        return false;
    }

    public List<String> displaySkills() {
        List<String> skillList = new ArrayList<>();
        for (String skill : skills) {
            if (skill != null) {
                skillList.add(skill);
            }
        }
        return skillList;
    }

    public String teamUpWith(Player player) {
        return this.name + " is teaming up with " + player.name;
    }

    public String competeWith(Player opponent) {
        Random random = new Random();
        if (random.nextBoolean()) {
            this.goalsScored++;
            return this.name + " scores!";
        } else {
            opponent.goalsScored++;
            return opponent.name + " scores!";
        }
    }
    //-------------------------------------------------------//

    public static int getPlayerCount() {
        return playerCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

}

