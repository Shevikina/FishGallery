package bluerose.fishgallery.ui.screens.custom_catch.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.ui.theme.components.JetIconButton
import bluerose.fishgallery.R
import bluerose.fishgallery.ui.screens.custom_catch.models.CatchEvent

@Composable
fun CatchViewDisplay(dispatcher: (CatchEvent) -> Unit) {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp)
    ) {
        Row {
            JetIconButton(
                vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_chevron_left_16_filled
            ) { dispatcher.invoke(CatchEvent.CloseScreen) }
            Box(
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = stringResource(R.string.our_catch_title),
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    ),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
        CatchCard(
            label = "Призрачный дельфи",
            text = stringResource(R.string.our_catch_value)
                .replace("%s", "50 000 000"),
            imageId = R.drawable.app1_image1,
            modifier = Modifier
                .padding(top = 24.dp)
        )
        CatchCard(
            label = "Алмазный ус",
            text = stringResource(R.string.our_catch_value)
                .replace("%s", "48 000 000"),
            imageId = R.drawable.app1_image2,
            modifier = Modifier
                .padding(top = 24.dp)
        )
        CatchCard(
            label = "Шестиперая аку",
            text = stringResource(R.string.our_catch_value)
                .replace("%s", "10 000 000"),
            imageId = R.drawable.app1_image3,
            modifier = Modifier
                .padding(top = 24.dp)
        )
    }
}

@Preview
@Composable
fun CatchViewDisplayPreview() {
    FishGalleryTheme {
        CatchViewDisplay {}
    }
}