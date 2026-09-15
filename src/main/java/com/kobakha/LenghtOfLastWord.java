package com.kobakha;

public class LenghtOfLastWord {

    int LenghtOfLastWord(String s) {
        
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
    public static void main(String[] args) {
        String s = "";
        LenghtOfLastWord lengthOfLastWord = new LenghtOfLastWord();
        System.out.println("Length of last word: " + lengthOfLastWord.LenghtOfLastWord(s));
    }

}
