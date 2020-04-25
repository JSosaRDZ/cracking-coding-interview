package com.imbuehub.cci.chapterone;

import java.util.Arrays;

public class ChapterOne {

  /**
   * Interview Question 1.1 - Variation allows for the use of Data Structure.
   *
   * @param s is a string of any size.
   * @return True if the string is made up of unique characters. Otherwise, return false.
   */
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

  /**
   * Interview Question 1.1 - Variation does not allows for the use of Data Structure.
   *
   * @param s is a string of any size.
   * @return True if the string is made up of unique characters. Otherwise, return false.
   */
  public boolean isUniqueNoDataStructure(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i + 1]) return false;
    }
    return true;
  }

  /**
   * Interview Question 1.2 - Variation allows fo the use of Data Structure.
   *
   * @param s1 is a string of any size.
   * @param s2 is a string of any size.
   * @return True if the strings are a permutation of each other. Otherwise, return false.
   */
  public boolean isPermutation(String s1, String s2) {
    if (s1.equals(s2)) return true;
    else if (s1.length() != s2.length()) return false;
    else {
      int[] charCount = addCharsSeenInFirstStringAndSubtractCharsSeenInSecondString(s1, s2);
      return allCharCountsAreZero(charCount);
    }
  }

  /**
   * Interview Question 1.2 - This is a helper method used to sum how many times characters appear
   * in the first string and subtracts how many times Sums how characters appear on the second
   * string.
   *
   * @param s1 is a string of size n.
   * @param s2 is a string of size n.
   * @return int[] where each element position correspond to an ASCII character and each element
   *     value is the result of the sum and subtraction of how many time each corresponding ASCII
   *     character is present in each string.
   */
  private int[] addCharsSeenInFirstStringAndSubtractCharsSeenInSecondString(String s1, String s2) {
    int[] charCount = new int[255];
    Arrays.fill(charCount, 0);
    for (int i = 0; i < s1.length(); i++) {
      charCount[s1.charAt(i)]++;
      charCount[s2.charAt(i)]--;
    }
    return charCount;
  }

  /**
   * Interview Question 1.2 - This is a helper method. If any element is not zero, then it means the
   * strings in the caller method are not permutations of each other.
   *
   * @param charCounts is an array where each element position represents an ASCII character.
   * @return false if any element has contains a number other than zero.
   */
  private boolean allCharCountsAreZero(int[] charCounts) {
    for (int c : charCounts) {
      if (c != 0) return false;
    }
    return true;
  }
}
