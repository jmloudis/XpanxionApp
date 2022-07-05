package com.example.homework.atchaba.homework2.problem2;

public class Sentence {

    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object obj) {

        Sentence s = (Sentence) obj;

        if (this.sentence.equals((s.getSentence())))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
