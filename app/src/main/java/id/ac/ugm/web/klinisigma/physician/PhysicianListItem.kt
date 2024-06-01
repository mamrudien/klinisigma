package id.ac.ugm.web.klinisigma.physician

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import id.ac.ugm.web.klinisigma.R

@Composable
fun PhysicianListItem(uiState: PhysicianUiState) {
    ListItem(headlineContent = {
        Text("dr. ${uiState.firstname} ${uiState.lastname}", softWrap = false)
    }, modifier = Modifier.clickable { /* TODO */ }, supportingContent = {
        Text(
            uiState.subSpeciality ?: (uiState.speciality
                ?: stringResource(R.string.label_generalpractitioner)),
            softWrap = false,
            overflow = TextOverflow.Ellipsis
        )
    }, leadingContent = {
        FilledTonalIconButton(onClick = { /*TODO*/ }) {
            if (uiState.photoUrl != null) {
                AsyncImage(
                    model = uiState.photoUrl,
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                )
            } else {
                Text(uiState.firstname[0].toString().uppercase())
            }
        }
    }, trailingContent = {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
        }
    })
}