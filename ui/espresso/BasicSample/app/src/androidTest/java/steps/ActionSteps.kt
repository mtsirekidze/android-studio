package steps

import pages.MainPage

class ActionSteps {
    private val mainPage = MainPage()

    fun changeFullName(fullName: String) {
        mainPage.enterFullName(fullName)
    }
}