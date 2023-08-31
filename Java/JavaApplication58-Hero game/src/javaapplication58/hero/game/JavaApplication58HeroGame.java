/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58.hero.game;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Random;

public class JavaApplication58HeroGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero hero = new Hero("Saitama");
        Monster monster = new Monster("Guko");

        System.out.println("Welcome to the Hero vs. Monster game!");
        System.out.println(hero.getName() + " vs. " + monster.getName());

        Random random = new Random();
        while (hero.isAlive() && monster.isAlive()) {
            int heroAttackDamage = hero.attack();
            int monsterAttackDamage = monster.attack();

            monster.takeDamage(heroAttackDamage);
            hero.takeDamage(monsterAttackDamage);

            System.out.println(hero.getName() + " attacks " + monster.getName() + " for " + heroAttackDamage + " damage.");
            System.out.println(monster.getName() + " attacks " + hero.getName() + " for " + monsterAttackDamage + " damage.");

            System.out.println(hero.getName() + " health: " + hero.getHealth());
            System.out.println(monster.getName() + " health: " + monster.getHealth());
            System.out.println("--------------------");

            try {
                Thread.sleep(1000); // Add a small delay between each attack for better readability
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (hero.isAlive() && !monster.isAlive()) {
            System.out.println("Congratulations! " + hero.getName() + " defeated " + monster.getName() + "!");
        } else {
            System.out.println("Game over! " + monster.getName() + " defeated " + hero.getName() + ".");
        }
    }

}

class Hero {

    private String name;
    private int health;
    private Random random = new Random();

    public Hero(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health >= 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int attack() {
        return random.nextInt(10) + 1; // Random damage from 1 to 10
    }
}

class Monster {

    private String name;
    private int health;
    private Random random = new Random();

    public Monster(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health >= 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int attack() {
        return random.nextInt(10) + 1; // Random damage from 1 to 10
    }
}
