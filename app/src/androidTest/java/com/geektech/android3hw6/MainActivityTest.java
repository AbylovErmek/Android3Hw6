package com.geektech.android3hw6;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void resultVisible() {
        onView(withId(R.id.add)).perform(click());
        onView(withId(R.id.result)).check(matches(isDisplayed()));
    }
    @Test
    public void add(){
        onView(withId(R.id.first_edt)).perform(typeText("2"));
        onView(withId(R.id.second_edt)).perform(typeText("4"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.add)).perform(click());
        onView(withId(R.id.result)).check(matches( withText("6")));
    }
    @Test
    public void subtract(){
        onView(withId(R.id.first_edt)).perform(typeText("5"));
        onView(withId(R.id.second_edt)).perform(typeText("7"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.subtract)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("-2")));
    }
    @Test
    public void multiply(){
        onView(withId(R.id.first_edt)).perform(typeText("5"));
        onView(withId(R.id.second_edt)).perform(typeText("5"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.multiply)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("25")));
    }
    @Test
    public void divide(){
        onView(withId(R.id.first_edt)).perform(typeText("100"));
        onView(withId(R.id.second_edt)).perform(typeText("100"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.divide)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("1")));
    }

}
