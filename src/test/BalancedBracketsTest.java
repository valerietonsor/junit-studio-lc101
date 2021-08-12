package test;

import org.junit.Test;

import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringInBracketsReturnsTrue(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringInAndOutReturnsTrue(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void stringPlusBracketsReturnsTrue(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets(""));

    }

    @Test
    public void frontBracketOnlyReturnsFalse(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void backBracketOnlyReturnsFalse(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void frontPlusStringReturnsFalse(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void backPlusStringReturnsFalse(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsGoNegative(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[][[]]]"));
    }

    @Test
    public void StringPlusNegBracketsReturnsFalse (){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }


}
