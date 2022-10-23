package com.example.factsapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.factsapp.components.FactCard
import com.example.factsapp.data.Datasource
import com.example.factsapp.model.Fact
import com.example.factsapp.ui.theme.jetBrainsMonoFamily

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Home() {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "FACTS APP",
                fontSize = 48.sp,
                fontFamily = jetBrainsMonoFamily,
                color = MaterialTheme.colors.surface,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
        FactList(factList = Datasource().loadFacts())
    }
}

@Composable
private fun FactList(factList: List<Fact>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier
            .padding(8.dp),
    ) {
        items(factList) { fact ->
            FactCard(fact)
        }
    }
}