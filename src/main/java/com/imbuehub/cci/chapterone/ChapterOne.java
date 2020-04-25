package com.imbuehub.cci.chapterone;

public class ChapterOne {
    public boolean isUnique(String s) {
        if (s.length() == 1)
            return true;
        else
            return s.charAt(0) != s.charAt(1);
    }
}
