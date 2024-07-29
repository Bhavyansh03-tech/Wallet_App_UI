package com.example.wallet_app_ui.mainScreen.spendingBreakdown.dataClass

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material.icons.rounded.Subscriptions
import androidx.compose.ui.graphics.vector.ImageVector

data class SpendingItemList(
    val name: String,
    val amount: Float,
    val icon: ImageVector
)

val spendingItemList = listOf(
    SpendingItemList(
        name = "Food",
        amount = 50.0f,
        icon = Icons.Default.Restaurant
    ),
    SpendingItemList(
        name = "Shopping",
        amount = 89f,
        icon = Icons.Rounded.ShoppingBag
    ),
    SpendingItemList(
        name = "Subscriptions",
        amount = 150.0f,
        icon = Icons.Rounded.Subscriptions
    ),
    SpendingItemList(
        name = "Health",
        amount = 100.0f,
        icon = Icons.AutoMirrored.Filled.DirectionsRun
    )
)