package id.ac.ugm.web.klinisigma

import androidx.annotation.StringRes

sealed class MainScreen(val route: String, @StringRes val resourceId: Int) {
    data object Timeline: MainScreen("timeline", R.string.screentitle_timeline)
    data object Message : MainScreen("messages", R.string.screentitle_messages)
    data object MyProfile : MainScreen("mine", R.string.screentitle_myprofile)
}