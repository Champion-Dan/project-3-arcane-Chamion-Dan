package com.arcane.character.adventurer;

// CombatStrategy interface
interface CombatStrategy {
    void applyCombatBonus();
}

// NoviceCombatStrategy
class NoviceCombatStrategy implements CombatStrategy {
    @Override
    public void applyCombatBonus() {
        System.out.println("Congratulations! You have gained Novice Combat Expertise.");
    }
}

// SeasonedCombatStrategy
class SeasonedCombatStrategy implements CombatStrategy {
    @Override
    public void applyCombatBonus() {
        System.out.println("Congratulations! You have gained Seasoned Combat Expertise.");
    }
}

// VeteranCombatStrategy
class VeteranCombatStrategy implements CombatStrategy {
    @Override
    public void applyCombatBonus() {
        System.out.println("Congratulations! You have gained Veteran Combat Expertise.");
    }
}

// MasterCombatStrategy
class MasterCombatStrategy implements CombatStrategy {
    @Override
    public void applyCombatBonus() {
        System.out.println("Congratulations! You have gained Master Combat Expertise.");
    }
}

// SearchStrategy interface
interface SearchStrategy {
    void applySearchBonus();
}

// NoviceSearchStrategy
class NoviceSearchStrategy implements SearchStrategy {
    @Override
    public void applySearchBonus() {
        System.out.println("Congratulations! You have gained Novice Search Expertise.");
    }
}

// SeasonedSearchStrategy
class SeasonedSearchStrategy implements SearchStrategy {
    @Override
    public void applySearchBonus() {
        System.out.println("Congratulations! You have gained Seasoned Search Expertise.");
    }
}

// VeteranSearchStrategy
class VeteranSearchStrategy implements SearchStrategy {
    @Override
    public void applySearchBonus() {
        System.out.println("Congratulations! You have gained Veteran Search Expertise.");
    }
}

// MasterSearchStrategy
class MasterSearchStrategy implements SearchStrategy {
    @Override
    public void applySearchBonus() {
        System.out.println("Congratulations! You have gained Master Search Expertise.");
    }
}
