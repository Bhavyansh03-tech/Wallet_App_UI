package com.example.wallet_app_ui.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wallet_app_ui.mainScreen.actions.ActionSection
import com.example.wallet_app_ui.mainScreen.card.CardSection
import com.example.wallet_app_ui.mainScreen.graph.SpendingGraph
import com.example.wallet_app_ui.mainScreen.spendingBreakdown.SpendingSection

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.verticalScroll((rememberScrollState()))
    ) {

        Spacer(modifier = Modifier.height(30.dp))

        // Card Section :->
        CardSection(modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(30.dp))

        // Action Section :->
        ActionSection(modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(40.dp))

        // Spending Section :->
        SpendingSection(modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(40.dp))

        // Spending Graph Section :->
        SpendingGraph(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(horizontal = 22.dp)
        )

        Spacer(modifier = Modifier.height(100.dp))
    }
}