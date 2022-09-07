package org.example;

public class Word {
    private int id;  //같은 클래스 내부에서만 접근 가능하고 외부에서는 접근할 수 없음.
    private int level;
    private String word;

    private String meaning;

    Word(){}
    Word(int id, int level, String word, String meaning) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        String slevel = "";
        for(int i=0; i<level; i++) slevel += "*";
        String str = String.format("%-3s", slevel)
                + String.format("%15s", word) + " " + meaning;
        return str;
    }
}


/*
 * 1. 멤버 변수 - 접근한정자(public, protected, default, private)
 * 2. getter & setter
 * 3. 생성자
 * 4. method
 * */