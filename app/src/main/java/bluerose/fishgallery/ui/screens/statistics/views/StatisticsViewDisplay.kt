package bluerose.fishgallery.ui.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bluerose.fishgallery.R
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.ui.theme.components.JetRoundIcon

@Composable
fun StatisticsViewDisplay() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
            .padding(24.dp, 32.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(SpanStyle(fontSize = 24.sp)) {
                    append(stringResource(R.string.header_title).substringBefore(" "))
                    append(" ")
                }
                withStyle(SpanStyle(fontSize = 32.sp)) {
                    append(stringResource(R.string.header_title).substringAfter(" "))
                }
            },
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Light),
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        StatisticsCard(
            stringResource(R.string.our_catch_title),
            stringResource(R.string.our_catch_value).replace("%s", "108 000 000"),
            RoundedCornerShape(16.dp, 32.dp, 16.dp),
            modifier = Modifier.padding(bottom = 24.dp)
        ){}
        StatisticsCard(
            stringResource(R.string.our_profit_title),
            stringResource(R.string.our_profit_value).replace("%s", "5 400 000"),
            RoundedCornerShape(16.dp, 0.dp, 16.dp, 32.dp),
            modifier = Modifier.padding(bottom = 24.dp)
        ){}
        StatisticsCard(
            stringResource(R.string.our_partners_title),
            stringResource(R.string.our_partners_value).replace("%s", "1 500"),
            RoundedCornerShape(16.dp, 48.dp, 16.dp),
            modifier = Modifier.height(160.dp)
        )
        Spacer(Modifier.weight(1f))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(R.string.footer_title),
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Light
                ),
                color = MaterialTheme.colorScheme.onPrimary
            )
            Spacer(modifier = Modifier.width(16.dp))
            JetRoundIcon(
                vectorDrawableId = R.drawable.ic_icon,
                color = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.size(64.dp).clip(CircleShape).clickable(onClick = {})
            )
        }
    }
}

@Preview(showBackground = false, locale = "Ru")
@Composable
fun StatisticsViewDisplayPreview() {
    FishGalleryTheme { StatisticsViewDisplay() }
}