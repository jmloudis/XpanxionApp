package com.example.homework.atchaba.homework2.problem2;

public class Word extends Sentence {

    private String noVowelsWord;

    public Word(String s, String w) {
        super(s);
        w = w.replaceAll("[aeiouAEIOU]", "");
        this.noVowelsWord = w;


    }

    public String getNoVowelsWord() {
        return noVowelsWord;
    }

    public boolean isSubstring()
    {
        return getSentence().contains(this.noVowelsWord);
    }
}
