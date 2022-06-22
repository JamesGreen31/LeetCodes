package org.leetcode.ckplace;

import org.problem1.leetcode.ckplace.LeetOne;
import org.problem1.leetcode.ckplace.ProblemOne;

public class ProblemFinder {
    ProblemExecutable find(int problem_num){
        return find(problem_num,null);
    }

    ProblemExecutable find(int problem_num, Object[] input){
        return switch (problem_num) {
            case 1 -> input == null ? new ProblemOne(): new ProblemOne(input);
            default -> new ProblemExecutable() {
                @Override
                public void run() {
                    //do nothing
                }

                @Override
                public float getRunTime() {
                    return 0f;
                }

                @Override
                public String getOutput() {
                    return "Could not find the requested problem";
                }

                @Override
                public int problem_id() {
                    return 0;
                }

                @Override
                public boolean isEqual(ProblemExecutable pxe) {
                    return pxe.problem_id() == problem_id();
                }
            };
        };
    }
    LeetCode findleets(int num, Object[] input){
        return switch (num){
            case 1->  input==null ? new LeetOne(): new LeetOne(input);
            default -> new LeetProblem();
        };
    }

}
