package org.problem1.leetcode.ckplace;

import org.leetcode.ckplace.ProblemExecutable;

import java.util.Arrays;

public class ProblemOne implements ProblemExecutable {
    private  String output;
    private long startTime;
    private long endtime;
    private int[][] input = new int[][]{{3,2,4},{6}};

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
        startTime = System.currentTimeMillis();
        output = "";
        output += "input: " +"\n" + Arrays.toString(input[0]) + " target: "
                + Arrays.toString(input[1]);
        output += "\n"+"result: " + Arrays.toString(TwoSum(input[0],input[1][0]));
        endtime = System.currentTimeMillis();
    }

    private int[] TwoSum(int[] nums, int target) {

/*        //cannot sort the array because pickles
        int minIndex = 0;
        int maxIndex = nums.length-1;
        while(minIndex<maxIndex){
            int low_target = nums[minIndex];
            int high_target = nums[maxIndex];
            if(low_target + high_target < target){
                minIndex++;
            }else if(low_target + high_target > target){
                minIndex = 0;
                maxIndex--;
            }else{
                //we found the answer.
                break;
            }
        }
        if(maxIndex>minIndex){
            return new int[]{minIndex,maxIndex};
        }else{
            return new int[]{-1}; // no solution
        }*/
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
        return (endtime - startTime)/1000;
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
