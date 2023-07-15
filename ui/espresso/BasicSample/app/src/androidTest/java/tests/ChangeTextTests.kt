package tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import steps.ActionSteps

@RunWith(AndroidJUnit4::class)
class ChangeTextTests {

    @Test
    fun changeFullNameTest() {
        val actionSteps = ActionSteps()
        actionSteps.changeFullName("mate tsirekidze")
    }

    @Test
    fun changeTextActivityTest() {
        onView(withId(R.id.button_open_activity)).perform(click())

        onView(withId(R.id.text_field)).perform(typeText("bounty"))    }
}