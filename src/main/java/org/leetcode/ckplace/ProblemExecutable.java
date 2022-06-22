package org.leetcode.ckplace;

public interface ProblemExecutable {
    void run();
    float getRunTime();
    String getOutput();
    //used to determine if this executable is the same as another
    int problem_id();
    boolean isEqual(ProblemExecutable pxe);
}
