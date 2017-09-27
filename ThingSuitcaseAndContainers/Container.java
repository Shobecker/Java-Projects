
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
public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maximumWeight) {
        this.maxWeight = maximumWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = totalWeight();
        weight += suitcase.totalWeight();
        if (weight <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public String toString() {
        int weight = totalWeight();

        if (suitcases.isEmpty()) {
            return "empty (0 kg)";
        } else if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + weight + " kg)";
        }
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
