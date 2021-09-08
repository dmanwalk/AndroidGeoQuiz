package com.bignerdranch.geoquiz;

public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public Question(int textResId, boolean answerTrue){
        mTextResID = textResId;
        mAnswerTrue = answerTrue;
    }

}
