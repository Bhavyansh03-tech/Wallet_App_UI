package com.example.wallet_app_ui.mainScreen.actions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ActionSection(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ActionItem(
            icon = Icons.Rounded.ArrowUpward,
            text = "Send",
            color = MaterialTheme.colorScheme.secondaryContainer,
            iconColor = MaterialTheme.colorScheme.onSecondaryContainer
        )

        ActionItem(
            icon = Icons.Rounded.ArrowDownward,
            text = "Receive",
            color = MaterialTheme.colorScheme.secondaryContainer,
            iconColor = MaterialTheme.colorScheme.onSecondaryContainer
        )

        ActionItem(
            icon = Icons.Outlined.GridView,
            text = "More",
            color = MaterialTheme.colorScheme.inverseSurface,
            iconColor = MaterialTheme.colorScheme.inverseOnSurface
        )
    }
}