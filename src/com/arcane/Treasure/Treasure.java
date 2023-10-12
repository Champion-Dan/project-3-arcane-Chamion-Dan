package com.arcane.Treasure;
import java.util.ArrayList;
import java.util.List;

// Update class insertion for project 3.2
// Base class for Treasure
public abstract class Treasure {
    // Attributes to store value and type of the treasure
    protected int value;
    protected String type;

    // Constructor to initialize the treasure with a given value and type
    public Treasure(int value, String type) {
        this.value = value;
        this.type = type;
    }

    // Getter method to retrieve the value of the treasure
    public int getValue() {
        return value;
    }

    // Getter method to retrieve the type of the treasure
    public String getType() {
        return type;
    }
}

// Concrete treasure classes

// Sword class representing a type of treasure
class Sword extends Treasure {
    // Constructor to set the value and type for the Sword
    public Sword() {
        super(1100, "Sword");
    }
}

// Armor class representing a type of treasure
class Armor extends Treasure {
    // Constructor to set the value and type for the Armor
    public Armor() {
        super(800, "Armor");
    }
}

// Portal class representing a type of treasure
class Portal extends Treasure {
    // Constructor to set the value and type for the Portal
    public Portal() {
        super(1200, "Portal");
    }
}

// Potion class representing a type of treasure
class Potion extends Treasure {
    // Constructor to set the value and type for the Potion
    public Potion() {
        super(500, "Potion");
    }
}

// Ether class representing a type of treasure
class Ether extends Treasure {
    // Constructor to set the value and type for the Ether
    public Ether() {
        super(900, "Ether");
    }
}

// Elixir class representing a type of treasure
class Elixir extends Treasure {
    // Constructor to set the value and type for the Elixir
    public Elixir() {
        super(500, "Elixir");
    }
}

// Gem class representing a type of treasure
class Gem extends Treasure {
    // Constructor to set the value and type for the Gem
    public Gem() {
        super(1000, "Gem");
    }
}
