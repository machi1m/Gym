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
                getLinkedHashSet(MuscleGroup.TRICEPS,MuscleGroup.BACK)
        );
        Combination combination_2 = new Combination(
                getLinkedHashSet(MuscleGroup.BICEPS,MuscleGroup.CHEST)
        );
        Combination combination_3 = new Combination(
                getLinkedHashSet(MuscleGroup.TRICEPS,MuscleGroup.BACK)
        );
        Combination combination_4 = new Combination(
                getLinkedHashSet(MuscleGroup.BICEPS,MuscleGroup.SHOULDERS)
        );
        Combination combination_5 = new Combination(
                getLinkedHashSet(MuscleGroup.TRICEPS,MuscleGroup.LEGS)
        );
        List<Combination> combinations = new ArrayList<>(Arrays.asList(combination_1, combination_2, combination_3
        , combination_4, combination_5));

        int input = Integer.parseInt(args[0]);
        int rotation = input % 5;

        Combination todaysCombination = combinations.get(rotation);

        LinkedHashSet<MuscleGroup> muscleGroupSet = todaysCombination.getCombination();
        for (MuscleGroup muscleGroup: muscleGroupSet) {
            LinkedHashSet<SubGroup> subGroupSet =  muscleGroup.getSubGroups();
            for (SubGroup subGroup : subGroupSet) {
                LinkedHashSet<Workout> workouts = subGroup.getWorkouts();
                Object[] todaysWorkouts = workouts.toArray();
                int size = todaysWorkouts.length;
                System.out.println(todaysWorkouts[input % size]);
            }
        }
    }

    private static LinkedHashSet<MuscleGroup> getLinkedHashSet(MuscleGroup... muscleGroups) {
        LinkedHashSet<MuscleGroup> muscleGroupSet = new LinkedHashSet<>(Arrays.asList(muscleGroups));
        return new LinkedHashSet<>(muscleGroupSet);
    }
}
