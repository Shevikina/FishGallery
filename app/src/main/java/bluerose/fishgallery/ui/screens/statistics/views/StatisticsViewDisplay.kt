package bluerose.fishgallery.ui.screens.statistics.views

import bluerose.fishgallery.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.ui.theme.SurfaceColor
import bluerose.fishgallery.ui.theme.components.JetRoundIcon
import bluerose.fishgallery.ui.theme.robotoFonts

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
            fontFamily = robotoFonts,
            fontWeight = FontWeight.Light,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        StatisticsCard(
            stringResource(R.string.our_catch_title),
            stringResource(R.string.our_catch_value).replace("%s", "108 000 000"),
            RoundedCornerShape(16.dp, 32.dp, 16.dp),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        StatisticsCard(
            stringResource(R.string.our_profit_title),
            stringResource(R.string.our_profit_value).replace("%s", "5 400 000"),
            RoundedCornerShape(16.dp, 0.dp, 16.dp, 32.dp),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        StatisticsCard(
            stringResource(R.string.our_partners_title),
            stringResource(R.string.our_partners_value).replace("%s", "1 500"),
            RoundedCornerShape(16.dp, 48.dp, 16.dp),
            modifier = Modifier.height(160.dp)
        )
        Spacer(Modifier.weight(1f)) //занимает весь объем между компонентыми
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(R.string.footer_title),
                fontSize = 24.sp,
                fontFamily = robotoFonts,
                fontWeight = FontWeight.Light,
                color = MaterialTheme.colorScheme.onPrimary
            )
            JetRoundIcon(
                vectorDrawableId = R.drawable.ic_icon,
                color = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun StatisticsViewDisplayPreview() {
    FishGalleryTheme { StatisticsViewDisplay() }
}