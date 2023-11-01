package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class DoubleOrNothing {
  

  

  public void playGame() {
    int points = 10;
    boolean quitGame = false;
    String continueInput = "y";
    Scanner scanner = new Scanner(System.in);
      
    while(quitGame != true) {
    
      gameStartMessage(points);
      String userInput = scanner.nextLine();
      
      if (userInput.equals(continueInput)){
        points = gamblePoints(points);
      }
      else {
        gameExitMessage(points);
        quitGame = true;
      }
  }
  scanner.close();
}

  private void gameExitMessage(int points) {
    System.out.println("final points = "+points);
  }

  private int gamblePoints(int points) {
    if (Math.random()<0.5){
      points = points*2;
    }
    else {
      points = 0;
    }
    return points;
  }

  private void gameStartMessage(int points) {
    System.out.println("your current points are: "+ points);  
    System.out.println("You wanna 'double or nothing' or walk away? (y/n)");
  }
};