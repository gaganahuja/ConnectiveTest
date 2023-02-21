import java.util.HashMap;
import java.util.Map;

public class Task1 {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such
     * that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use
     * the same element twice.
     * You can return the answer in any order.
     */

    public  int[] findTupleToAffUpToTarget(int [] inputArray, int target) {
        Map<Integer,Integer> inputMap= new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            inputMap.put(inputArray[i],i);
        }
        for (int i = 0; i < inputArray.length; i++) {
            int counterToTarget = target - inputArray[i];
           if(inputMap.containsKey(counterToTarget) && inputMap.get(counterToTarget)!=i)
           {
               return new int[] { i, inputMap.get(counterToTarget)};
           }
        }
        return null;
    }





}
