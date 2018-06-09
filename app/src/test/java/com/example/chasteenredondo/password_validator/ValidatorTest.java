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
        assertEquals(1, check.validate("Password"));
    }

    @Test
    //Passes the 2 rules
    public void TwoRule() {
        assertEquals(2, check.validate("abcdefghi"));
    }
}