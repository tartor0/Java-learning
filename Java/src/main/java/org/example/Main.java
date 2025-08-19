package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Highest single-day discovery
        int[] barrels = {300, 450, 120, 800, 540, 760, 310, 900, 500, 620};
        System.out.println(DataProcessingTasks.highestDiscovery(barrels));

        // 2. Total liters delivered
        int[] deliveries = {1200, 1800, 1500, 2000, 1750, 1400, 1650};
        System.out.println(DataProcessingTasks.totalDeliveries(deliveries));

        // 3. Defects above limit
        int[] defects = {2, 8, 1, 0, 6, 7, 3, 9, 5};
        System.out.println("Defects above 5: " + DataProcessingTasks.defectsAboveLimit(defects, 5));

        // 4. Medicines with two consecutive zero days
        int[][] medicines = {
                {5, 0, 0, 4, 6, 5, 4},
                {3, 1, 0, 2, 0, 1, 2},
                {0, 0, 0, 0, 0, 0, 0}
        };
        List<int[]> flagged = DataProcessingTasks.medicinesWithTwoZeros(medicines);
        System.out.println("Medicines with two zero-days:");
        for (int[] arr : flagged) {
            System.out.println(Arrays.toString(arr));
        }

        // 5. Bus routes with average >= 100
        int[][] routes = {
                {80, 90, 120},
                {105, 110, 115},
                {70, 85, 95},
                {130, 140, 125}
        };
        System.out.println("Overcrowded routes (avg >= 100): " + DataProcessingTasks.overcrowdedRoutes(routes));

        // 6. Lowest yield day
        int[] yields = {45, 60, 38, 55, 70, 42, 39, 48};
        System.out.println(DataProcessingTasks.lowestYield(yields));

        // 7. Hypertension readings
        int[][] bp = {
                {120, 80},
                {150, 95},
                {138, 85},
                {145, 92},
                {160, 100}
        };
        System.out.println("Hypertension readings (>140 systolic):");
        List<int[]> highBP = DataProcessingTasks.hypertensionReadings(bp);
        for (int[] r : highBP) {
            System.out.println(Arrays.toString(r));
        }
    }
}
