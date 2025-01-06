package bluerose.fishgallery.ui.screens.custom_catch.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.ui.theme.components.JetRoundImage
import bluerose.fishgallery.ui.theme.robotoFonts

@Composable
fun CatchCard(label: String, text: String, imageId: Int, modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        JetRoundImage(imageId)
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 5.dp)
        ) {
            Text(
                text = label,
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 16.sp,
                fontFamily = robotoFonts,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.weight(0.1f))
            Text(
                text = text,
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 16.sp,
                fontFamily = robotoFonts,
                fontWeight = FontWeight.Light,
                modifier = Modifier
            )
        }
    }
}

//@Preview(showBackground = false)
@Preview(showBackground = true, backgroundColor = 0xFFEEF4F3) //primary color
@Composable
fun CatchCardPreview() {
    FishGalleryTheme {
//        Column(
//            modifier = Modifier
//                .background(MaterialTheme.colorScheme.primary)
//                .fillMaxSize()
//                .verticalScroll(rememberScrollState())
//                .padding(24.dp)
//        ) {
//            CatchCard(
//                label = "Призрачный дельфи",
//                text = "50 000 000 тонн",
//                imageId = bluerose.fishgallery.R.drawable.app1_image1,
//                modifier = Modifier
//                .padding(top = 24.dp)
//            )
//        }

        CatchCard(
            label = "Призрачный дельфи",
            text = "50 000 000 тонн",
            imageId = bluerose.fishgallery.R.drawable.app1_image1,
            modifier = Modifier
        )
    }
}