/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60.rock.paper.scissor.pkgfinal.game;

import java.util.Random;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication60RockPaperScissorFinalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        int target = (int) Math.floor(Math.random() * 50);
        int guess = (int) Math.floor(Math.random() * 50);

        while (true) {
            if (guess != target) {
                System.out.println("Target: " + target + " Guess: " + guess);
                guess = (int) Math.floor(Math.random() * 50);
                System.out.println("Please try again!");
                System.out.println("\n");
            } else if (guess == target) {
                System.out.println("Target: " + target + " Guess: " + guess);
                System.out.println("CONGRATS YOU WIN!");
                System.out.println("YOU ARE GREAT!!!");
                System.out.println("\n");
                break;
            }

            Thread.sleep(1000);

        }

//        while (player.playerScore() && computer.computerScore()) {
//            int attackPlayer = player.playerAttack();
//            int computerAttack = computer.computerAttack();
//
//            monster.takeDamage(heroAttackDamage);
//            hero.takeDamage(monsterAttackDamage);
//
//            System.out.println(hero.getName() + " attacks " + monster.getName() + " for " + heroAttackDamage + " damage.");
//            System.out.println(monster.getName() + " attacks " + hero.getName() + " for " + monsterAttackDamage + " damage.");
//
//            System.out.println(hero.getName() + " health: " + hero.getHealth());
//            System.out.println(monster.getName() + " health: " + monster.getHealth());
//            System.out.println("--------------------");
//
//            try {
//                Thread.sleep(1000); // Add a small delay between each attack for better readability
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (hero.isAlive() && !monster.isAlive()) {
//            System.out.println("Congratulations! " + hero.getName() + " defeated " + monster.getName() + "!");
//        } else {
//            System.out.println("Game over! " + monster.getName() + " defeated " + hero.getName() + ".");
//        }
    }

}
