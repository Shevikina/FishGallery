package bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import bluerose.fishgallery.R
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.utils.advancedShadow

@Composable
fun JetRoundImage(
    imageId: Int,
    modifier: Modifier = Modifier,
    withShadow: Boolean = true
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .border(
                3.dp,
                MaterialTheme.colorScheme.surface,
                MaterialTheme.shapes.medium
            )
            .advancedShadow(
                alpha = if (withShadow) 0.05f else 0f,
                shadowBlurRadius = 5.dp,
                offsetY = 4.dp
            )

    ) {
        Image(
            painterResource(id = imageId),
            contentDescription = "Rounded image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(MaterialTheme.shapes.medium)
                .fillMaxWidth()
                .heightIn(min = 136.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFEEF4F3)
@Composable
fun JetRoundImagePreview() {
    FishGalleryTheme {
//        Column(
//            modifier = Modifier
//                .background(MaterialTheme.colorScheme.primary)
//                .fillMaxSize()
//                .verticalScroll(rememberScrollState())
//                .padding(24.dp)
//        ) {
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//            ) {
//                JetRoundImage(
//                    imageId = R.drawable.app1_image1,
//                    true,
//                    modifier = Modifier
//                )
//            }
//        }

        JetRoundImage(
            imageId = R.drawable.app1_image1,
            modifier = Modifier,
            withShadow = true
        )
    }
}