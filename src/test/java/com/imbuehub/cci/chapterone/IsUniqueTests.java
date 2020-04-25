package com.imbuehub.cci.chapterone;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsUniqueTests {
  private final ChapterOne chapterOne = new ChapterOne();

  @Test
  public void testStringWithSingleCharacterAIsUnique() {
    assertTrue("String 'a' is unique and should return true.", chapterOne.isUnique("a"));
  }

  @Test
  public void testStringWithSingleCharacterBIsUnique() {
    assertTrue("String 'b' is unique and should return true.", chapterOne.isUnique("b"));
  }

  @Test
  public void testStringWithTwoCharactersABIsUnique() {
    assertTrue("String 'ab' is unique and should return true", chapterOne.isUnique("ab"));
  }

  @Test
  public void testStringWithTwoCharactersAAIsNotUnique() {
    assertFalse("String 'aa' is not unique and should return false", chapterOne.isUnique("aa"));
  }

  @Test
  public void testStringWithThreeCharactersABAIsNotUnique() {
    assertFalse("String 'aba' is not unique an should return false", chapterOne.isUnique("aba"));
  }

  @Test
  public void testStringWithThreeCharactersABCIsUnique() {
    assertTrue("String 'aaa' is unique and should return true", chapterOne.isUnique("ABC"));
  }

  @Test
  public void testLongStringWithCharactersAPEDNBRIsUnique() {
    assertTrue("String 'APEDNBR' is unique and should return true", chapterOne.isUnique("APEDNBR"));
  }
  @Test
  public void testLongStringWithCharactersABOYPEAIsUnique() {
    assertFalse("String 'ABOYPEA' is not unique and should return false", chapterOne.isUnique("ABOYPEA"));
  }
}
