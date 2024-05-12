package org.gym;

import java.util.LinkedHashSet;

public class Combination {

    public LinkedHashSet<MuscleGroup> combination;

    public Combination(LinkedHashSet<MuscleGroup> combination) {
        this.combination = combination;
    }

    public LinkedHashSet<MuscleGroup> getCombination() {
        return combination;
    }

    public void setCombination(LinkedHashSet<MuscleGroup> combination) {
        this.combination = combination;
    }
}
