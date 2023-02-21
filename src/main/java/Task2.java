import java.util.Arrays;

public class Task2 {


    /**
     * Given n non-negative integers a1, a2, ..., an , where each represents a point at
     * coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i,
     * ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the
     * container contains the most water.
     */


    public static int findMaxWaterRetention(int[] inputArray) {
        return findMax(0, inputArray);
    }

    public static int findMax(int max, int[] inputArray) {
        int startIndex = 0;
        int lastIndex = inputArray.length - 1;
        int maxWaterContained = (Math.min(inputArray[startIndex], inputArray[lastIndex]) * (lastIndex-startIndex));
        if (maxWaterContained >= max) {
            max = maxWaterContained;
            if (inputArray.length > 2 && inputArray[startIndex] < inputArray[lastIndex]) {
                max = findMax(max, Arrays.stream(inputArray).skip(1).toArray());
            } else if (inputArray.length > 2 && inputArray[startIndex] > inputArray[lastIndex]) {
                max = findMax(max, Arrays.stream(inputArray).limit(lastIndex - 1).toArray());
            }
        }
        return max;
    }
}
