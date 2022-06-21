package org.problem1.leetcode.ckplace;

import org.leetcode.ckplace.ProblemExecutable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode problem one: TwoSum.
 * Completed 6/20/2022
 */
//TODO Read about hashmaps as you had the solution, but didn't know how to properly implement it
//  Hashmaps would have solved that for you/
public class ProblemOne implements ProblemExecutable {
    private  String output;
    private long startTime;
    private long endtime;
    private int[][] input = new int[][]{{3,3},{6}}; //example data

    @Override
    public void run() {
        /*
        Given an array of integers nums and an integer target, return indices of
            the two numbers such that they add up to target.
            You may assume that each input would have exactly one solution,
            and you may ** NOT ** use the same element twice.
            You can return the answer in any order.
         */

        //sort the array using quicksort O(n*log(n))
        output = "";
        output += "input: " +"\n" + Arrays.toString(input[0]) + " target: "
                + Arrays.toString(input[1]);
        output += "\n"+"result: " + Arrays.toString(TwoSum(input[0],input[1][0]));
        long leetcode_time = System.currentTimeMillis();
        int[] dead = TwoSumSolution(input[0],input[1][0]); // to calculate the solution
        long leetcode_endtime = System.currentTimeMillis();
        output+= "\n-----" + "\nLeet Code prefered time solved this in " + (leetcode_endtime-leetcode_time);
    }

    private int[] TwoSum(int[] nums, int target) {
        this.startTime = System.currentTimeMillis();
        int startIndex = 0;
        int endIndex = 1;
        while(startIndex<nums.length-1){

            if(nums[startIndex] + nums[endIndex] != target){
                endIndex++;
            }else{
                break;
            }
            if(endIndex == nums.length){
                startIndex++;
                endIndex =startIndex+1;
            }
        }
        //we can assume that only valid input is given
        this.endtime = System.currentTimeMillis();
        return new int[]{startIndex,endIndex};
    }

    private int[] TwoSumSolution(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    @Override
    public void runWithInput(Object[] args) {
        catchInput(args);
        run();
    }

    private void catchInput(Object[] args) {
        try{
            input[0] = (int[]) args[0];
            input[1] = (int[]) args[1];
        }catch (Exception e){
            System.err.println("Input is not good");
            System.exit(-1);
        }
    }

    @Override
    public float getRunTime() {
        return (endtime - startTime);
    }

    @Override
    public String getOutput() {
        run();
        return output;
    }

    @Override
    public int problem_id() {
        return 1;
    }

    @Override
    public boolean isEqual(ProblemExecutable pxe) {
        return pxe.problem_id() == this.problem_id();
    }
}
