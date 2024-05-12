package org.gym;

import org.gym.workouts.AbsWorkout;
import org.gym.workouts.ChestWorkout;
import org.gym.workouts.ShoulderWorkout;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public enum SubGroup {

    LOWER_CHEST(
            getLinkedHashSet(ChestWorkout.ELEVATED_PUSH_UPS)
    ),

    UPPER_CHEST,
    PECTORIALS_CHEST(
            getLinkedHashSet(ChestWorkout.BB_WIDE_PRESS)
    ),
    LONGER_HEAD_BICEPS,
    BROCHIORADIOLOGIES_BICEPS,
    LOWER_ABS(
            getLinkedHashSet(AbsWorkout.LOW_RANGE_LEG_RAISES)
    ),
    OBLIQUES_ABS(
            getLinkedHashSet(AbsWorkout.RUSSIAN_TWISTS)
    ),

    MEDIAL_ABDOMINAL_ABS(
            getLinkedHashSet(AbsWorkout.PUSH_THROUGHS)
    ),


    MEDIAL_DELTOID_SHOULDERS(
            getLinkedHashSet(ShoulderWorkout.STANDING_DB_LATERAL_RAISES)
    ),

    REAR_DELTOID_SHOULDERS(
            getLinkedHashSet(ShoulderWorkout.SEATED_BB_BACK_MILITARY_PRESS)
    ),










    private static LinkedHashSet<Workout> getLinkedHashSet(Workout... workouts) {
        Set<Workout> workoutSet = new LinkedHashSet<Workout>(Arrays.asList(workouts));
        return new LinkedHashSet<>(workoutSet);
    }



    private Set<Workout> workouts;

    SubGroup(Set<Workout> workouts) {
        this.workouts = workouts;
    }
}
