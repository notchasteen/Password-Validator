package com.example.chasteenredondo.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.typeText;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import android.widget.TextView;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void VeryWeakPassword() {
        onView(withId(R.id.editTxt)).perform(typeText("abc"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("The Strength of the Password is Very Weak!")));
    }

    @Test
    public void WeakPassword() {
        onView(withId(R.id.editTxt)).perform(typeText("abcdefghi"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("The Strength of the Password is Weak!")));
    }

    @Test
    public void FairPassword() {
        onView(withId(R.id.editTxt)).perform(typeText("@bcdefghi"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("The Strength of the Password is Fair!")));
    }

    @Test
    public void GoodPassword() {
        onView(withId(R.id.editTxt)).perform(typeText("1@b33defgh"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("The Strength of the Password is Good!")));
    }

    @Test
    public void StrongPassword() {
        onView(withId(R.id.editTxt)).perform(typeText("1@bcDefGhi"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("The Strength of the Password is Strong!")));
    }
}
