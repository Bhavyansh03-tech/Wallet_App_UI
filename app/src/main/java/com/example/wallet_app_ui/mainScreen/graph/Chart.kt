package com.example.wallet_app_ui.mainScreen.graph

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wallet_app_ui.randomColor
import me.bytebeats.views.charts.bar.BarChart
import me.bytebeats.views.charts.bar.BarChartData
import me.bytebeats.views.charts.bar.render.label.SimpleLabelDrawer
import me.bytebeats.views.charts.bar.render.xaxis.SimpleXAxisDrawer
import me.bytebeats.views.charts.bar.render.yaxis.SimpleYAxisDrawer

@Composable
fun Chart(
    modifier: Modifier = Modifier
) {
    BarChart(
        modifier = modifier,
        barChartData = BarChartData(spendingByDay),
        xAxisDrawer = SimpleXAxisDrawer(
            axisLineThickness = 2.dp,
            axisLineColor = MaterialTheme.colorScheme.onSurface.copy(0.2f)
        ),
        yAxisDrawer = SimpleYAxisDrawer(
            labelValueFormatter = {"$ ${it.toInt()}"},
            labelTextColor = MaterialTheme.colorScheme.onSurface,
            axisLineThickness = 2.dp,
            axisLineColor = MaterialTheme.colorScheme.onSurface.copy(0.2f)
        ),
        labelDrawer = SimpleLabelDrawer(
            drawLocation = SimpleLabelDrawer.DrawLocation.Outside,   // Displaying the label outside the bar.
            labelTextColor = MaterialTheme.colorScheme.onSurface
        )
    )
}

val spendingByDay = listOf(
    BarChartData.Bar(
        label = "Dec 1",
        value = 123f,
        color = randomColor(50)
    ),
    BarChartData.Bar(
        label = "Dec 2",
        value = 160f,
        color = randomColor(50)
    ),
    BarChartData.Bar(
        label = "Dec 3",
        value = 205f,
        color = randomColor(50)
    ),
    BarChartData.Bar(
        label = "Dec 4",
        value = 34f,
        color = randomColor(50)
    ),
    BarChartData.Bar(
        label = "Dec 5",
        value = 75f,
        color = randomColor(50)
    )

)