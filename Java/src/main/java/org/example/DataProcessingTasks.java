package org.example;
import java.util.*;

public class DataProcessingTasks {
    public static String highestDiscovery(int[] data) {
        int max = data[0];
        int pos = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                pos = i;
            }
        }
        return "Highest discovery: " + max + " barrels at position " + pos;
    }

    // 2. Total liters delivered
    public static String totalDeliveries(int[] data) {
        int total = 0;
        for (int val : data) {
            total += val;
        }
        if (total > 10000) {
            return "Total delivered: " + total + " liters ALERT: Capacity Exceeded!";
        } else {
            return "Total delivered: " + total + " liters";
        }
    }

    // 3. Defects above limit
    public static List<Integer> defectsAboveLimit(int[] data, int limit) {
        List<Integer> result = new ArrayList<>();
        for (int val : data) {
            if (val > limit) result.add(val);
        }
        return result;
    }

    // 4. Medicines with two consecutive zero days
    public static List<int[]> medicinesWithTwoZeros(int[][] data) {
        List<int[]> flagged = new ArrayList<>();
        for (int[] medicine : data) {
            for (int i = 0; i < medicine.length - 1; i++) {
                if (medicine[i] == 0 && medicine[i+1] == 0) {
                    flagged.add(medicine);
                    break;
                }
            }
        }
        return flagged;
    }

    // 5. Bus routes with average >= 100
    public static List<Integer> overcrowdedRoutes(int[][] data) {
        List<Integer> result = new ArrayList<>();
        for (int[] route : data) {
            int sum = 0;
            for (int val : route) sum += val;
            int avg = Math.round((float) sum / route.length);
            if (avg >= 100) result.add(avg);
        }
        return result;
    }

    // 6. Lowest yield day
    public static String lowestYield(int[] data) {
        int min = data[0];
        int pos = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
                pos = i;
            }
        }
        return "Lowest yield: " + min + " bags on day " + pos;
    }

    // 7. Hypertension readings
    public static List<int[]> hypertensionReadings(int[][] data) {
        List<int[]> result = new ArrayList<>();
        for (int[] reading : data) {
            if (reading[0] > 140) result.add(reading);
        }
        return result;
    }

    // Main method to test all
    public static void main(String[] args) {
        // 1
        int[] barrels = {300, 450, 120, 800, 540, 760, 310, 900, 500, 620};
        System.out.println(highestDiscovery(barrels));

        // 2
        int[] deliveries = {1200, 1800, 1500, 2000, 1750, 1400, 1650};
        System.out.println(totalDeliveries(deliveries));

        // 3
        int[] defects = {2, 8, 1, 0, 6, 7, 3, 9, 5};
        System.out.println(defectsAboveLimit(defects, 5));

        // 4
        int[][] medicines = {
                {5, 0, 0, 4, 6, 5, 4},
                {3, 1, 0, 2, 0, 1, 2},
                {0, 0, 0, 0, 0, 0, 0}
        };
        List<int[]> flagged = medicinesWithTwoZeros(medicines);
        for (int[] arr : flagged) {
            System.out.println(Arrays.toString(arr));
        }

        // 5
        int[][] routes = {
                {80, 90, 120},
                {105, 110, 115},
                {70, 85, 95},
                {130, 140, 125}
        };
        System.out.println(overcrowdedRoutes(routes));

        // 6
        int[] yields = {45, 60, 38, 55, 70, 42, 39, 48};
        System.out.println(lowestYield(yields));

        // 7
        int[][] bp = {
                {120, 80},
                {150, 95},
                {138, 85},
                {145, 92},
                {160, 100}
        };
        List<int[]> highBP = hypertensionReadings(bp);
        for (int[] r : highBP) {
            System.out.println(Arrays.toString(r));
        }
    }
}
