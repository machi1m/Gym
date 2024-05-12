package org.gym;

import java.util.Map;
import java.util.Set;

public enum MuscleGroup {

    CHEST(),
    BACK(),
    TRICEPS(),
    BICEPS(),
    LEGS(),
    CALVES(),
    SHOULDERS();

    private Set<SubGroup> subGroups;
    MuscleGroup(Set<SubGroup> subGroups) {
        this.subGroups = subGroups;
    }
}
