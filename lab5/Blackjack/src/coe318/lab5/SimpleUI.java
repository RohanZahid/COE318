package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private int hscore, yscore;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }
    

  @Override
    public void display() {
        System.out.println("House holds:");//FIX THIS
        System.out.println(this.game.getHouseCards());
        System.out.println("You hold:");
        System.out.println(this.game.getYourCards());
    }

  @Override
    public boolean hitMe() {
        System.out.println("Do you want another card? (Y/N)");
        if(user.next().equalsIgnoreCase("N"))
            return false;
        return true;
    }

  @Override
    public void gameOver() {
        System.out.println("Game over.");
        System.out.println("House holds:");//FIX THIS
        System.out.println(this.game.getHouseCards());
        System.out.println("You hold:");
        System.out.println(this.game.getYourCards());
        hscore = this.game.score(this.game.getHouseCards());
        yscore = this.game.score(this.game.getYourCards());
        System.out.println("House score: " + hscore);
        System.out.println("Your score: " + yscore);
        if(yscore > 21 || yscore == hscore)
            System.out.println("The House wins. You lose!");
        else if(yscore <= 21 && hscore > 21)
            System.out.println("You Win!");
        else if(yscore <= 21 && hscore <= 21 && yscore > hscore)
            System.out.println("You Win!");
        else
            System.out.println("The House wins. You lose!");
        
    }

}