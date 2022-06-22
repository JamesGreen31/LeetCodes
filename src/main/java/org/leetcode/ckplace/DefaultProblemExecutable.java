package org.leetcode.ckplace;

public abstract class DefaultProblemExecutable implements ProblemExecutable{
    private long starttime;
    private long endtime;
    protected Object output;
    protected Object input;

    public DefaultProblemExecutable(){
        //should always be overridden
    }

    public DefaultProblemExecutable(Object[] input){
        catchDefaultInput(input);
        run();
    }

    private void catchDefaultInput(Object[] input) {
        try{
            catchInput(input);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    protected abstract void catchInput(Object[] input) throws Exception;

    @Override
    public void run(){
        starttime = System.nanoTime();
        runSolution();
        endtime = System.nanoTime();
    }
    protected abstract void runSolution();

    @Override
    public float getRunTime() {
        return (endtime-starttime)/1000000f;
    }

    @Override
    public Object getOutput() {
        return null;
    }

    @Override
    public abstract int problem_id();

    @Override
    public boolean isEqual(ProblemExecutable pxe) {
        return problem_id() == pxe.problem_id();
    }
}
