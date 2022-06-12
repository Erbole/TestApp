package com.geektach.testapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AndroidMathTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void simpleAndroidTest(){
        onView(withId(R.id.first_num_et)).perform(typeText("24"));
        onView(withId(R.id.second_num_et)).perform(typeText("26"));
        onView(withId(R.id.btn)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("50")));
    }

    @Test
    public void checkOnDisplayed(){
        onView(withId(R.id.result)).check(matches(isDisplayed()));
    }
}
