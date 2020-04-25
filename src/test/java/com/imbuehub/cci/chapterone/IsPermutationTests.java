package com.imbuehub.cci.chapterone;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPermutationTests {
  private final ChapterOne chapterOne = new ChapterOne();

  @Test
  public void testTwoEqualSingleCharStringsArePermutations() {
    assertTrue(
        "String 'a' is permutation of string 'a' and should return true",
        chapterOne.isPermutation("a", "a"));
  }

  @Test
  public void testTwoDifferentSingleCharStringAreNotPermutations() {
    assertFalse(
        "String 'a' is not a permutation of string 'b' and should return false",
        chapterOne.isPermutation("a", "b"));
  }

  @Test
  public void testTwoStringsOfSameLengthThatAreNotEqualButArePermutations() {
    assertTrue(
        "String 'ab' is a permutation of 'ba' and should return true",
        chapterOne.isPermutation("ab", "ba"));
  }

  @Test
  public void testTacoCatAtcoCtaIsPermutation() {
    assertTrue(
        "String 'taco cat' is a permutation of 'atco cta' and should return true",
        chapterOne.isPermutation("taco cat", "atco cta"));
  }
}
