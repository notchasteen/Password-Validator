package com.example.chasteenredondo.password_validator;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorTest {

    static Validator check;

    @BeforeClass
    public static void init() {
        check = new Validator();

    }

    @Test
    //password should not be password
    public void NotPassword() {
        assertEquals(2, check.validate("Password"));
    }

    @Test
    //Passes the 2 rules
    public void TwoRule() {
        assertEquals(2, check.validate("abcdefghi"));
    }
    @Test
    //Passes if it has special chars
    public void SpecialChars(){
        assertEquals(3, check.validate("@bcdefghi"));
        assertEquals(3, check.validate("!@bcdefg^"));
    }

    @Test
    //Passes if it has at least one digit
    public void digit(){
        assertEquals(4, check.validate("1@b33defgh"));
    }

    @Test
    //Passes if password passes all the 5 rules
    public void strongPass(){
        assertEquals(5, check.validate("1@bcDefGhi"));
    }

}