package pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId

class MainPage {
    fun enterFullName(fullName: String) {
        onView(withId(R.id.text_field)).perform(typeText(fullName))
    }
}