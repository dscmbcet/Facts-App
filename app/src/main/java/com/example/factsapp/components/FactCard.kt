package com.example.factsapp.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.factsapp.R
import com.example.factsapp.model.Fact
import com.example.factsapp.model.FactType
import com.example.factsapp.ui.theme.jetBrainsMonoFamily

@Composable
fun FactCard(fact: Fact, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (expanded) MaterialTheme.colors.secondary else MaterialTheme.colors.surface
    )
    Card(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = 8.dp,
        shape = RoundedCornerShape(24.dp),
        backgroundColor = color
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = fact.info,
                fontFamily = jetBrainsMonoFamily,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.background
            )

            if (expanded) {
                CardExpandedContent(fact)
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(MaterialTheme.colors.background)
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = fact.type.toString(),
                        color = MaterialTheme.colors.surface
                    )
                }
                FactButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded }
                )
            }

        }
    }
}

@Composable
fun CardExpandedContent(fact: Fact) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(id = fact.imageId),
            contentDescription = "image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = "Source: ${fact.source}",
            fontSize = 14.sp,
        )
        Text(
            text = "Submitted by: ${fact.submittedBy}",
            fontFamily = jetBrainsMonoFamily,
            fontSize = 14.sp,
            fontWeight = FontWeight.Light
        )
    }
}

@Composable
fun FactButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = onClick,
    ) {
        Text(
            text = if (expanded) "View Less" else "View More",
            color = MaterialTheme.colors.background,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CardPreview() {
    FactCard(
        fact = Fact(
            info = "There once lived a Viking called Harald Bluetooth. " +
                    "He was called that because he loved blueberries. " +
                    "The Bluetooth technology we know nowadays, has been named after him. " +
                    "And the symbol are the runic H and B put together",
            source = "r/funfacts",
            imageId = R.drawable.bluetooth,
            type = FactType.FUN,
            submittedBy = "BenGeorgeNetto"
        ),
        modifier = Modifier
    )
}