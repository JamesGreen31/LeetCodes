package org.problem7.leetcode.ckplace;

import org.leetcode.ckplace.DefaultProblemExecutable;

public class Problem7 extends DefaultProblemExecutable {

    public Problem7(){
        this.input=7;
        this.output=this.input;
    }

    @Override
    protected void catchInput(Object[] input) throws Exception {
         this.input = input[0];
    }

    @Override
    protected void runSolution() {
        output = Solution.reverse((Integer) input);
    }

    static class Solution {
        String instructions = """
                Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
                                
                Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
                                
                \s
                                
                Example 1:
                                
                Input: x = 123
                Output: 321
                Example 2:
                                
                Input: x = -123
                Output: -321
                Example 3:
                                
                Input: x = 120
                Output: 21
                \s
                                
                Constraints:
                                
                -231 <= x <= 231 - 1
                """;
        public static int reverse(int x) {
            return x;
        }
    }

    @Override
    public int problem_id() {
        return 7;
    }

}
