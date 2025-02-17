package bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import bluerose.fishgallery.R
import bluerose.fishgallery.ui.theme.FishGalleryTheme

@Composable
fun JetRoundIcon(
    vectorDrawableId: Int,
    color: Color,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(shape = CircleShape)
            .border(
                width = 3.dp,
                color = color,
                shape = CircleShape
            )
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = vectorDrawableId),
            tint = color,
            contentDescription = null
        )
    }
}

@Preview(showBackground = false, showSystemUi = false)
@Composable
fun JetRoundIconPreview() {
    FishGalleryTheme {
        JetRoundIcon(
            vectorDrawableId = R.drawable.ic_icon,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.size(64.dp)
        )
    }
}