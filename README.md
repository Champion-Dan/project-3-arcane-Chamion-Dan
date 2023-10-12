# A.R.C.A.N.E.: Adventurers of the Realm: Chronicles of Ancient Nexus Elements

### Authors: Rajiv Srivatsava Vangala

### Java Version: Java 17

Description: https://docs.google.com/document/d/1-HKdT9F_8kgBhpkgIvoFlkFORN0IDuijWRI0Twq9RVI/edit


updates by Daniel Hernandez for project 3.2 

Decorator Pattern
Description: Treasure objects can decorate a treasure bag.
Classes:
Treasure: Base interface or class for a treasure.
TreasureDecorator: Abstract class or interface for decorators.
TreasureBag: Concrete component that can be decorated.
Example: GemDecorator adds a gem to a treasure bag.



Strategy Pattern
Description: Experience bonus applied to both strategy and combat.
Classes:
CombatStrategy: Interface defining the strategy for combat.
NoviceCombatStrategy, SeasonedCombatStrategy: Concrete strategy implementations.
Adventurer: Context class using the combat strategy.
Example: Adventurer with a novice combat strategy.



Observer Pattern
Description: Event publishers (Adventurer, Creature) and consumers (Logger, Tracker).
Classes:
GameObservable: Subject class maintaining a list of observers.
GameObserver: Observer interface with an update method.
Logger: Concrete observer logging events to a file.
Tracker: Concrete observer maintaining game status in memory.
Example: Adventurer publishing events, Logger subscribing to log events.