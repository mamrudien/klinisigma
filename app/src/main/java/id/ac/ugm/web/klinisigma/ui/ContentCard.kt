package id.ac.ugm.web.klinisigma.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ac.ugm.web.klinisigma.ui.theme.KlinisigmaTheme

@Composable
fun ContentCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    header: @Composable () -> Unit = { Spacer(Modifier.height(8.dp)) },
    thumbnail: @Composable () -> Unit = {},
    title: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    content: @Composable () -> Unit
) {
    OutlinedCard(onClick, modifier) {

        header()

        thumbnail()

        Column(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            CompositionLocalProvider(
                LocalTextStyle provides MaterialTheme.typography.bodyLarge, title
            )

            Spacer(Modifier.height(16.dp))

            CompositionLocalProvider(
                LocalTextStyle provides MaterialTheme.typography.bodyMedium, content
            )

            Spacer(Modifier.height(16.dp))

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End, content = actions)
        }
    }
}

@Preview
@Composable
fun ContentCardPreview() {
    KlinisigmaTheme {
        ContentCard(title = { Text("Lorem Ipsum") }) {
            Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor")
        }
    }
}