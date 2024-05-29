package id.ac.ugm.web.klinisigma

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ac.ugm.web.klinisigma.ui.theme.KlinisigmaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar() {
    TopAppBar(
        title = { Text(text = stringResource(R.string.app_name)) }, navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = stringResource(R.string.label_notification)
                )
            }

            IconButton(onClick = { /* doSomething() */ }) {
                Icon(
                    imageVector = Icons.Outlined.MoreVert,
                    contentDescription = stringResource(R.string.label_more)
                )
            }
        })
}

@Preview(showBackground = true)
@Composable
fun MainTopAppBarPreview() {
    KlinisigmaTheme {
        MainTopAppBar()
    }
}