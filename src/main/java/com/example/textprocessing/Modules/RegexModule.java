package com.example.textprocessing.Modules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexModule {

    // Method to search for patterns in text
    public static boolean searchPattern(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    // Method to replace patterns in text
    public static String replacePattern(String text, String regex, String replacement) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(replacement);
    }
}
