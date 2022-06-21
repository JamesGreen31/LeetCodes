package org.leetcode.ckplace;

import org.problem1.leetcode.ckplace.LeetOne;

public class Main {
    public static void main(String[] arg){
        //console based for now

        int leetToFind = 1; //set to 0 for testing the run time setup
        ProblemFinder dictionary = new ProblemFinder();
        System.out.println(generateOutput(dictionary.findleets(leetToFind)));


    };
    static String generateOutput(LeetCode leetcode){
        return "leetcode problem: " + leetcode.getProblemNumber() + "\n" +
                "leetcode description: " + leetcode.getProblemDescription() + "\n" +
                "leetcode url: " + leetcode.getProblemLink() + "\n\n" +
                "output:\n" + leetcode.getProblemExectable().getOutput() + "\n" +
                "time: " + leetcode.getProblemExectable().getRunTime();
    }
}
