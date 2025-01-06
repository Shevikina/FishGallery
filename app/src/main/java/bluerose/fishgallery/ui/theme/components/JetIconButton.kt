package bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.utils.dashedBorder
import com.microsoft.fluent.mobile.icons.R

@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    contentPadding: PaddingValues = PaddingValues(12.dp),
    shape: RoundedCornerShape = RoundedCornerShape(8.dp),
    modifier: Modifier = Modifier.size(48.dp)
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .dashedBorder(
                2.dp,
                color = MaterialTheme.colorScheme.onPrimary,
                shape = shape,
                on = 7.dp,
                off = 7.dp
            )
            .padding(contentPadding)
    ) {
        Icon(
            painter = painterResource(id = vectorDrawableId),
            contentDescription = "Icon button",
            tint = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFEEF4F3)//primary color
@Composable
fun JetIconButtonPreview() {
    FishGalleryTheme {
        JetIconButton(
            vectorDrawableId = R.drawable.ic_fluent_chevron_left_16_filled,
            contentPadding = PaddingValues(12.dp),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.size(48.dp)
        )
    }
}
