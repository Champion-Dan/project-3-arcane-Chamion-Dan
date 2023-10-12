package com.arcane;

import com.arcane.character.adventurer.Adventurer;
import com.arcane.engine.GameEngine;
import com.arcane.util.Constants;

public class GameDriver {

  public static void main(String[] args) {
    simulateSingleRun();
  }

  // Simulate the 30 games
  private static void simulateMultipleRun() {
    GameEngine gameEngine = new GameEngine();
    int allTreasuresFound = 0;
    int allCreaturesKilled = 0;
    int allAdventurersKilled = 0;

    // Based on win condition increment the counters
    for (int i = 0; i < 30; i++) {
      gameEngine.initialiseGame();
      switch (gameEngine.simulateGame(false)) {
        case Constants.ALL_TREASURES_FOUND:
          allTreasuresFound++;
          break;
        case Constants.ALL_ADVENTURERS_KILLED:
          allAdventurersKilled++;
          break;
        case Constants.ALL_CREATURES_KILLED:
          allCreaturesKilled++;
          break;
        default:
          break;
      }
    }

    /* TreasureBag bag = new TreasureBag();

    // Decorate the bag with different treasures
    bag.addTreasure(new Sword());
    bag.addTreasure(new Armor());
    bag.addTreasure(new Portal());
    bag.addTreasure(new Potion());
    bag.addTreasure(new Ether());
    bag.addTreasure(new Elixir()); 

    System.out.println("Total value: " + bag.getValue());
    System.out.println("Treasure types: " + bag.getTreasureTypes()); */
    
    
    
    System.out.println(
        "Win scenarios count=>"
            + " All treasures found: "
            + allTreasuresFound
            + ", All creatures killed: "
            + allCreaturesKilled
            + ", All adventurers killed: "
            + allAdventurersKilled);
  }

  // Simulate a single game
  private static void simulateSingleRun() {
    GameEngine gameEngine = new GameEngine();
    gameEngine.initialiseGame();
    gameEngine.simulateGame(true);
  }
}
