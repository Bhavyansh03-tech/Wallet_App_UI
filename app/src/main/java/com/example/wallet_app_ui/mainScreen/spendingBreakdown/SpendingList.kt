package com.example.wallet_app_ui.mainScreen.spendingBreakdown

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wallet_app_ui.mainScreen.spendingBreakdown.dataClass.spendingItemList

@Composable
fun SpendingList(
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        itemsIndexed(spendingItemList) { _, spendingItem ->
            SpendingItem(spendingItemList = spendingItem)
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}