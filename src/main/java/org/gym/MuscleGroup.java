package org.gym;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public enum MuscleGroup {

    CHEST(
            getLinkedHashSet(
            SubGroup.UPPER_CHEST, SubGroup.LOWER_CHEST, SubGroup.PECTORALS_CHEST
            )
    ),
    BACK(
            getLinkedHashSet(
                    SubGroup.BACK_ONE, SubGroup.BACK_TWO, SubGroup.BACK_THREE
            )
    ),
    TRICEPS(
            getLinkedHashSet(
                    SubGroup.TRICEPS_ONE, SubGroup.TRICEPS_TWO, SubGroup.TRICEPS_THREE
            )
    ),
    BICEPS(
            getLinkedHashSet(
                    SubGroup.BICEPS_ONE, SubGroup.BICEPS_TWO, SubGroup.BICEPS_THREE
            )
    ),
    LEGS(
            getLinkedHashSet(
                    SubGroup.LEGS_ONE, SubGroup.LEGS_TWO, SubGroup.LEGS_THREE
            )
    ),
    CALVES(
            getLinkedHashSet(
                    SubGroup.CALVES_ONE, SubGroup.CALVES_TWO, SubGroup.CALVES_THREE
            )
    ),
    SHOULDERS(
            getLinkedHashSet(
                    SubGroup.FRONT_REAR_DELTOID_SHOULDERS, SubGroup.MEDIAL_DELTOID_SHOULDERS, SubGroup.SHOULDERS
            )
    );

    private static LinkedHashSet<SubGroup> getLinkedHashSet(SubGroup... subGroups) {
        Set<SubGroup> subGroupSet = new LinkedHashSet<SubGroup>(Arrays.asList(subGroups));
        return new LinkedHashSet<>(subGroupSet);
    }

    private LinkedHashSet<SubGroup> subGroups;
    MuscleGroup(LinkedHashSet<SubGroup> subGroups) {
        this.subGroups = subGroups;
    }

    public LinkedHashSet<SubGroup> getSubGroups() {
        return subGroups;
    }

    public void setSubGroups(LinkedHashSet<SubGroup> subGroups) {
        this.subGroups = subGroups;
    }
}
