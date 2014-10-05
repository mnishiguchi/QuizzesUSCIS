package com.example.quizzesuscis;

public class Quiz
{
    private String question;
    private String answer;
    
    /** CONSTRUCTOR */
    public Quiz(String question, String answer)
    {
        this.question = question;
        this.answer = answer;
    }

    public String getAnswer()
    {
        return answer;
    }

    public String getQuestion()
    {
        return question;
    }
    
}
