package cd.labs.chapter6.partA;

import cd.labs.chapter6.partA.heros.Hero;

import java.util.List;

public class Main {
    public static void main (String[] args){

        Hero hero1 = new Hero("Peter Parker", "Spider-Man", "Avengers");
        Hero hero2 = new Hero("Tony Stark", "Iron Man", "Avengers");
        Hero hero3 = new Hero("Carol Danvers", "Captain Marvel", "Avengers");
        Hero hero4 = new Hero("Thor Odinsion", "Thor", "Avengers");
        Hero hero5 = new Hero("Steve Roger", "Captain America", "Avengers");

        hero1.addSuperpower("Web Slinging");
        hero2.addSuperpower("Wall Crawling");
        hero3.addSuperpower("Web Slinging");
        hero4.addSuperpower("Wall Crawling");
        hero5.addSuperpower("Web Slinging");



        List<String> powers = hero1.displayPowers();
        System.out.println(hero1.getAlias() + "'s superpowers: " + powers);

        // Remove a superpower from hero1
        boolean removed = hero1.removeSuperpower("Web Slinging");
        System.out.println("Removed Web Slinging: " + removed);

        // Team up hero1 with hero2
        String teamUpStatement = hero1.teamUpWith(hero2);
        System.out.println(teamUpStatement);

        // Simulate a battle between hero1 and hero2
        String battleResult = hero1.battle(hero2);
        System.out.println(battleResult);

        // Display the remaining health points of hero1 and hero2
        System.out.println(hero1.getAlias() + "'s Health Points: " + hero1.getHealthPoints());
        System.out.println(hero2.getAlias() + "'s Health Points: " + hero2.getHealthPoints());

        // Get the total number of heroes
        int totalHeroes = Hero.getHeroCount();
        System.out.println("Total number of heroes: " + totalHeroes);
    }
}
