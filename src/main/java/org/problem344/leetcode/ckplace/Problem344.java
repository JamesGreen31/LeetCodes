package org.problem344.leetcode.ckplace;

import org.leetcode.ckplace.ProblemExecutable;

import java.util.Arrays;

public class Problem344 implements ProblemExecutable {
    private  char[] output;
    private long startTime;
    private long endtime;
    private char[] input;
    public Problem344(Object[] input) {
        catchInput(input);
        output = this.input;
        run();
    }

    private void catchInput(Object[] input) {
        try{
            this.input=input[0].toString().toCharArray();
        }catch(Exception e){
            System.err.println("cannot convert that object to a string.\n");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public Problem344(){
        input = "hello".toCharArray();
        output = this.input;
        run();
    }

    @Override
    public void run() {
        startTime = System.nanoTime();
        reverse_string(output);
        endtime = System.nanoTime();
    }

    /**
     * My solution
     * @param s char[] to be reversed
     */
    private void reverse_string(char[] s) { //may not work
        for(int i=0; i<s.length/2;i++){
            char temp = s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }

    /**
     * The leet code solution
     * @param s char[] to be reversed
     */
    private void reverse_string_optimal(char[] s){
        //CONGRATS YOURS IS THE MOST OPTIMAL JAVA SOLUTION
    }

    @Override
    public float getRunTime() {
        return (endtime-startTime)/1000000f;
    }

    @Override
    public String getOutput() {
        return Arrays.toString(output);
    }

    @Override
    public int problem_id() {
        return 344;
    }

    @Override
    public boolean isEqual(ProblemExecutable pxe) {
        return pxe.problem_id()==problem_id();
    }
}
