package org.leetcode.ckplace;

public class LeetProblem implements LeetCode{

    private final int problemNumber;
    private final String problemLink;
    private final String problemDescription;
    private final ProblemExecutable pxe;
    static ProblemFinder pfe = new ProblemFinder();
    /**
     * This default constructor is used to ensure the main driver works correctly
     */
    public LeetProblem(){
        this.problemNumber = 0;
        this.problemLink = "www.ckplace.org";
        this.problemDescription = "null";
        this.pxe = pfe.find(problemNumber);
    }

    /**
     * This constrcutor requires all information to be passed in directly.
     * @param problemNumber the problem number of the leetcode question
     * @param problemLink the link to the leetcode problem
     * @param problemDescription the description of the leetcode problem
     */
    public LeetProblem(int problemNumber,String problemLink, String problemDescription){
        this.problemNumber = problemNumber;
        this.problemLink = problemLink;
        this.problemDescription = problemDescription;
        this.pxe = pfe.find(problemNumber);
    }
    public LeetProblem(int problemNumber,String problemLink, String problemDescription, Object[] input){
        this.problemNumber = problemNumber;
        this.problemLink = problemLink;
        this.problemDescription = problemDescription;
        this.pxe = pfe.find(problemNumber,input);
    }
    /**
     * @return the problem number of the leet code question
     */
    @Override
    public int getProblemNumber() {
        return problemNumber;
    }

    /**
     *
     * @return the problem link of the leet code question
     */
    @Override
    public String getProblemLink() {
        return problemLink;
    }

    /**
     * @return the problem description of the leet code question
     */
    @Override
    public String getProblemDescription() {
        return problemDescription;
    }

    /**
     * @return the problem exeutable of the leet code question
     */
    @Override
    public ProblemExecutable getProblemExectable() {
        return pxe;
    }
}
