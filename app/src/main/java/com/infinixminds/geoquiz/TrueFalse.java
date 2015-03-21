package com.infinixminds.geoquiz;

//class true false will carry an array of the true or false questions
//to ask the user

public class TrueFalse {
    private int mQuestion;
    private Boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public Boolean getTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(Boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }
}
