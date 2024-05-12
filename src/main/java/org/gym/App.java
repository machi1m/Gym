package org.gym;

import java.util.*;

/**
 * My Gym Application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Combination combination_1 = new Combination(
                getLinkedHashSet(MuscleGroup.CHEST,MuscleGroup.BACK)
        );
        Combination combination_2 = new Combination(
                getLinkedHashSet(MuscleGroup.TRICEPS,MuscleGroup.BICEPS,MuscleGroup.SHOULDERS)
        );
        Combination combination_3 = new Combination(
                getLinkedHashSet(MuscleGroup.LEGS,MuscleGroup.CALVES)
        );
        List<Combination> combinations = new ArrayList<>(Arrays.asList(combination_1, combination_2, combination_3));

        for (Combination combination: combinations) {
            LinkedHashSet<MuscleGroup> muscleGroupSet = combination.getCombination();
            for (MuscleGroup muscleGroup: muscleGroupSet) {
               LinkedHashSet<SubGroup> subGroupSet =  muscleGroup.getSubGroups();
                for (SubGroup subGroup : subGroupSet) {
                    LinkedHashSet<Workout> workouts = subGroup.getWorkouts();
                    System.out.println(workouts);
                }
            }

        }
    }

    private static LinkedHashSet<MuscleGroup> getLinkedHashSet(MuscleGroup... muscleGroups) {
        LinkedHashSet<MuscleGroup> muscleGroupSet = new LinkedHashSet<>(Arrays.asList(muscleGroups));
        return new LinkedHashSet<>(muscleGroupSet);
    }
}
