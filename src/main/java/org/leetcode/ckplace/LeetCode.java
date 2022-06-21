package org.leetcode.ckplace;

public interface LeetCode {
    int getProblemNumber();
    String getProblemLink();
    String getProblemDescription();
    ProblemExecutable getProblemExectable(); //responsible for everything to do with running
}
