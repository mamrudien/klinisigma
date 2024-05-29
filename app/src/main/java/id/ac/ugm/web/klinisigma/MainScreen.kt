package id.ac.ugm.web.klinisigma

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class MainScreen(
    val route: String,
    @StringRes val labelResId: Int,
    @DrawableRes val iconResId: Int
) {
    data object Timeline :
        MainScreen("timeline", R.string.screentitle_timeline, R.drawable.timeline_24px)

    data object Message :
        MainScreen("messages", R.string.screentitle_messages, R.drawable.chat_24px)

    data object MyProfile :
        MainScreen("mine", R.string.screentitle_myprofile, R.drawable.person_24px)
}

val MainScreenList = listOf(MainScreen.Timeline, MainScreen.Message, MainScreen.MyProfile)