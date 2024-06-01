package id.ac.ugm.web.klinisigma.post

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import id.ac.ugm.web.klinisigma.R
import id.ac.ugm.web.klinisigma.physician.PhysicianListItem
import id.ac.ugm.web.klinisigma.ui.ContentCard

@Composable
fun PostSummaryCard(uiState: PostUiState) {
    ContentCard(header = {
        PhysicianListItem(uiState.author)
    }, thumbnail = {
        if (uiState.thumbnailUrl != null) {
            AsyncImage(
                model = uiState.thumbnailUrl, contentDescription = null, Modifier.fillMaxWidth()
            )
        }
    }, title = { Text(uiState.title) }, actions = {
        IconToggleButton(checked = false, onCheckedChange = { /*TODO*/ }) {
            Icon(
                painter = painterResource(R.drawable.favorite_outline_24px),
                contentDescription = stringResource(R.string.label_like)
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(R.drawable.comment_24px),
                contentDescription = stringResource(R.string.label_comments)
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(R.drawable.share_24px),
                contentDescription = stringResource(R.string.label_share)
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        IconToggleButton(checked = false, onCheckedChange = { /*TODO*/ }) {
            Icon(
                painter = painterResource(R.drawable.bookmark_outline_24px),
                contentDescription = stringResource(R.string.label_save)
            )
        }
    }) {
        Text(uiState.content)
    }
}