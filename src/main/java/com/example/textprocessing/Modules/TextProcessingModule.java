package com.example.textprocessing.Modules;

public class TextProcessingModule {

    public boolean findPattern(String text, String regex) {
        return RegexModule.searchPattern(text, regex);
    }

    public String replacePattern(String text, String regex, String replacement) {
        return RegexModule.replacePattern(text, regex, replacement);
    }
}
