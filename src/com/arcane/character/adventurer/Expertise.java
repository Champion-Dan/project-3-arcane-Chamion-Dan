package com.arcane.character.adventurer;

public class Expertise {

    private String name;
    private int mastery;
    private int level;
    private CombatStrategy combatStrategy;
    private SearchStrategy searchStrategy;

    public Expertise() {
        this.combatStrategy = new NoviceCombatStrategy();
        this.searchStrategy = new NoviceSearchStrategy();
    }

    public void killCreature() {
        combatStrategy.applyCombatBonus();
    }

    public void completeTask() {
        searchStrategy.applySearchBonus();
    }

    public void levelUp() {
        this.level += 1;

        if (level == 1) {
            this.combatStrategy = new SeasonedCombatStrategy();
            this.searchStrategy = new SeasonedSearchStrategy();
        } else if (level == 2) {
            this.combatStrategy = new VeteranCombatStrategy();
            this.searchStrategy = new VeteranSearchStrategy();
        } else if (level == 3) {
            this.combatStrategy = new MasterCombatStrategy();
            this.searchStrategy = new MasterSearchStrategy();
        }
    }
}