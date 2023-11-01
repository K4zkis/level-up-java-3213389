package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class DoubleOrNothing {
  

  

  public void playGame() {
    int points = 10;
    boolean quitGame = false;
    Scanner scanner = new Scanner(System.in);
      
    while(quitGame != true) {
    
    System.out.println("your current points are: "+ points);  
    System.out.println("You wanna 'double or nothing' or walk away? (y/n)");

    String userInput = scanner.nextLine();
    
    if (userInput.equals("y")){
      if (Math.random()<0.5){
        points = points*2;
      }
      else {
        points = 0;
      }
    }
    else {
      System.out.println("final points = "+points);
      quitGame = true;
    }
  }
  scanner.close();
}
};