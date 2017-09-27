import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias
 */
public class Suitcase {
    private final int maxWeight;
    private final ArrayList<Thing> things;
    
    public Suitcase(int maxweight) {
        this.maxWeight = maxweight;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
        int weight = totalWeight();
        weight += thing.getWeight();
        if (weight <= this.maxWeight) {
            things.add(thing);
        }
    }
    
    public String toString() {
        int weight = totalWeight();
        
        if (things.isEmpty()) {
            return "empty (0 kg)";
        } else if (things.size() == 1){
            return things.size() + " thing (" + weight + " kg)";
        }
        return things.size() + " things (" + weight + " kg)";
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }
    
    public Thing heaviestThing() {
        Thing heaviest = null;
        if (things.size() > 0) {
            heaviest = things.get(0);
            for (Thing thing : things) {
                if (heaviest.getWeight() < thing.getWeight()) {
                    heaviest = thing;
                }
            }
        }
        return heaviest;
    }
}
