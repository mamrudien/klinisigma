package id.ac.ugm.web.klinisigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import id.ac.ugm.web.klinisigma.ui.theme.KlinisigmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController()

            KlinisigmaTheme {
                Scaffold(Modifier.fillMaxSize(),
                    { MainTopAppBar() },
                    { MainNavigationBar(navController) }) { innerPadding ->

                    NavHost(
                        navController = navController,
                        startDestination = MainScreen.Timeline.route,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(MainScreen.Timeline.route) {
                            //TimelineScreen()
                        }
                        composable(MainScreen.Message.route) {
                            //MessageScreen()
                        }
                        composable(MainScreen.MyProfile.route) {
                            //MyProfileScreen()
                        }
                    }
                }
            }
        }
    }
}

