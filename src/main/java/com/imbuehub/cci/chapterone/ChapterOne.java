package com.imbuehub.cci.chapterone;

import java.util.Arrays;

public class ChapterOne {

  public boolean isUnique(String s) {
    if (s.length() <= 1) return true;
    else if (s.length() == 2) return s.charAt(0) != s.charAt(1);
    else {
      boolean[] charHasBeenSeen = new boolean[255];
      Arrays.fill(charHasBeenSeen, false);
      for (int i = 0; i < s.length(); i++) {
        if (charHasBeenSeen[s.charAt(i)]) return false;
        else charHasBeenSeen[s.charAt(i)] = true;
      }
      return true;
    }
  }

  public boolean isUniqueNoDataStructure(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i + 1]) return false;
    }
    return true;
  }
}
