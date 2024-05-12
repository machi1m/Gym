package org.gym;

import org.gym.workouts.*;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public enum SubGroup {

    /**
     * Chest
     *
     */
    LOWER_CHEST(
            getLinkedHashSet(
                    ChestWorkout.ELEVATED_PUSH_UPS,
                    ChestWorkout.DECLINED_BENCH_BB_PRESS,
                    ChestWorkout.DECLINED_NEUTRAL_GRIP_PRESS,
                    ChestWorkout.ALT_CABLE_FLIES,
                    ChestWorkout.CABLE_FLIES
                    )
    ),

    UPPER_CHEST(
            getLinkedHashSet(
                    ChestWorkout.ALT_PEC_FLIES,
                    ChestWorkout.PEC_FLIES,
                    ChestWorkout.INCLINED_CHEST_BB_PRESS,
                    ChestWorkout.INCLINED_CHEST_DB_PRESS,
                    ChestWorkout.INCLINED_DB_FLIES
            )
    ),
    PECTORALS_CHEST(
            getLinkedHashSet(
                    ChestWorkout.BB_WIDE_PRESS,
                    ChestWorkout.ALT_CABLE_PRESS_MID,
                    ChestWorkout.CABLE_PRESS_MID,
                    ChestWorkout.BENCH_PRESS,
                    ChestWorkout.DB_PRESS
            )
    ),

    /**
     * Shoulders
     *
     */

    SHOULDERS(
            getLinkedHashSet(ShoulderWorkout.SEATED_BB_BACK_MILITARY_PRESS,
                    ShoulderWorkout.SEATED_BB_MILITARY_PRESS,
                    ShoulderWorkout.ALT_MILITARY_DB_PRESS,
                    ShoulderWorkout.INCLINED_DB_PRESS
            )
    ),

    MEDIAL_DELTOID_SHOULDERS(
            getLinkedHashSet(ShoulderWorkout.STANDING_DB_LATERAL_RAISES,
                    ShoulderWorkout.STANDING_DB_LATERAL_RAISES_ALT,
                    ShoulderWorkout.STANDING_DB_LATERAL_RAISES_BACK,
                    ShoulderWorkout.UPRIGHT_ROPE_ROWS
            )
    ),

    FRONT_REAR_DELTOID_SHOULDERS(
            getLinkedHashSet(ShoulderWorkout.CABLE_REVERSE_FLIES,
                    ShoulderWorkout.NEUTRAL_ROPE_FRONT_RAISES,
                    ShoulderWorkout.SINGLE_CABLE_REVERSE_FLIES,
                    ShoulderWorkout.SINGLE_ARM_LOW_PULLEY_FRONT_RAISES)
    ),

    /**
     * Abs
     *
     */
    LOWER_ABS(
            getLinkedHashSet(AbsWorkout.LOW_RANGE_LEG_RAISES)
    ),
    OBLIQUES_ABS(
            getLinkedHashSet(AbsWorkout.RUSSIAN_TWISTS)
    ),

    MEDIAL_ABDOMINAL_ABS(
            getLinkedHashSet(AbsWorkout.PUSH_THROUGHS)
    ),

    /**
     * Biceps
     *
     */

    BICEPS_ONE(
            getLinkedHashSet(
                    BicepWorkout.NEUTRAL_GRIP_ROPE_CURLS,
                    BicepWorkout.EXTERNAL_ROTATION_ROPE_CURLS,
                    BicepWorkout.DB_CURLS_ALT_STAND,
                    BicepWorkout.SPIDER_CURLS_ALT)
    ),
    BICEPS_TWO(
            getLinkedHashSet(
                    BicepWorkout.DB_HAMMER_CURLS_STAND,
                    BicepWorkout.SEATED_CONCENTRATION_CURLS,
                    BicepWorkout.SEATED_NEUTRAL_GRIP_CONCENTRATION_CURLS,
                    BicepWorkout.HAMMER_CYCLIC_CURLS)
    ),
    BICEPS_THREE(
            getLinkedHashSet(
                    BicepWorkout.HIGH_PULLEY_BICEP_CURLS_SINGLE_ARM,
                    BicepWorkout.DRAG_CURLS,
                    BicepWorkout.CROSS_NEUTRAL_GRIP_MID_CHEST,
                    BicepWorkout.EZ_BAR_CURLS)
    ),

    /**
     * Triceps
     *
     */
    TRICEPS_ONE(
            getLinkedHashSet(
                    TricepWorkout.ROPE_PUSH_DOWNS_CLOSE_GRIP,
                    TricepWorkout.BODY_WEIGHT_PUSH_DOWNS,
                    TricepWorkout.SINGLE_ARM_PUSH_DOWNS,
                    TricepWorkout.SINGLE_ARM_PUSH_DOWNS_UH,
                    TricepWorkout.BB_PUSH_DOWNS,
                    TricepWorkout.SINGLE_PUSH_DOWNS)
    ),
    TRICEPS_TWO(
            getLinkedHashSet(
                    TricepWorkout.BENCH_DIPS,
                    TricepWorkout.KICK_BACKS_BENCH_SUPPORT,
                    TricepWorkout.KICK_BACKS_BENCH_SUPPORT_SINGLE_ARM,
                    TricepWorkout.SKULL_CRUSHERS,
                    TricepWorkout.SKULL_CRUSHERS_DECLINED_BENCH
                    )
    ),
    TRICEPS_THREE(
            getLinkedHashSet(
                    TricepWorkout.DECLINED_ALT_DB_EXT,
                    TricepWorkout.DECLINED_DB_EXT,
                    TricepWorkout.SINGLE_ARM_DB_EXT,
                    TricepWorkout.DOUBLE_ARM_EXTENSION,
                    TricepWorkout.OVER_HEAD_ROPE_EXT_75,
                    TricepWorkout.OVER_HEAD_V_BAR_EXT)
    ),

    /**
     * Legs
     *
     */

    LEGS_ONE(
            getLinkedHashSet(
                    LegWorkout.LEG_PRESS,
                    LegWorkout.SINGLE_LEG_PRESS,
                    LegWorkout.SQUATS,
                    LegWorkout.SUMO_SQUATS)
    ),

    LEGS_TWO(
            getLinkedHashSet(
                    LegWorkout.LEG_EXTENSIONS,
                    LegWorkout.SINGLE_LEG_EXTENSIONS,
                    LegWorkout.LUNGES_QUADS,
                    LegWorkout.DB_QUADS_SQUATS)
    ),

    LEGS_THREE(
            getLinkedHashSet(
                    LegWorkout.SINGLE_LEG_CURLS,
                    LegWorkout.LEG_CURLS,
                    LegWorkout.HIP_THRUSTS,
                    LegWorkout.DB_DEAD_LIFTS,
                    LegWorkout.DEAD_LIFTS,
                    LegWorkout.LUNGES_HAM_STRINGS)
    ),

    /**
     * Calves
     *
     */

    CALVES_ONE(
            getLinkedHashSet(
                    CalvesWorkout.FREE_STYLE_RAISES,
                    CalvesWorkout.FREE_STYLE_RAISES_INWARDS,
                    CalvesWorkout.FREE_STYLE_RAISES_OUTWARDS)

    ),
    CALVES_TWO(
            getLinkedHashSet(
                    CalvesWorkout.MACHINE_RAISES_INWARDS,
                    CalvesWorkout.MACHINE_RAISES_OUTWARDS,
                    CalvesWorkout.MACHINE_RAISES)
    ),
    CALVES_THREE(
            getLinkedHashSet(
                    CalvesWorkout.LEG_PRESS_RAISES_OUTWARDS,
                    CalvesWorkout.LEG_PRESS_RAISES,
                    CalvesWorkout.LEG_PRESS_RAISES_INWARDS)
    ),

    /**
     * Back
     *
     */


    BACK_ONE(
            getLinkedHashSet(
                    BackWorkout.PULL_DOWNS,
                    BackWorkout.PULL_DOWNS_WIDE,
                    BackWorkout.PULL_UPS,
                    BackWorkout.SINGLE_ARM_PULL_DOWNS,
                    BackWorkout.V_PULLS,
                    BackWorkout.NEUTRAL_GRIP_SINGLE_ARM_PULL_DOWNS)
    ),
    BACK_TWO(
            getLinkedHashSet(
                    BackWorkout.CABLE_ROWS,
                    BackWorkout.BENT_CABLE_PULLS,
                    BackWorkout.SINGLE_ARM_DB_ROWING,
                    BackWorkout.BENT_CABLE_PULLS_ROPE,
                    BackWorkout.DB_PULLS
            )
    ),
    BACK_THREE(
            getLinkedHashSet(
                    BackWorkout.BB_SHRUGS_FRONT,
                    BackWorkout.BB_SHRUGS_BACK,
                    BackWorkout.DB_SHRUGS,
                    BackWorkout.H_E,
                    BackWorkout.WIDE_GRIP_LATS_ROWING
            )
    );



    private static LinkedHashSet<Workout> getLinkedHashSet(Workout... workouts) {
        Set<Workout> workoutSet = new LinkedHashSet<Workout>(Arrays.asList(workouts));
        return new LinkedHashSet<>(workoutSet);
    }



    private LinkedHashSet<Workout> workouts;

    SubGroup(LinkedHashSet<Workout> workouts) {
        this.workouts = workouts;
    }

    public LinkedHashSet<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(LinkedHashSet<Workout> workouts) {
        this.workouts = workouts;
    }
}
