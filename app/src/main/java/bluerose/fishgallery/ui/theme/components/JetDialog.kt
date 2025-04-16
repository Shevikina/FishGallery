package bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.utils.advancedShadow

@Composable
fun JetDialog(
    title: String = "Наши контакты",
    body: String = "E-mail ...",
    buttonText: String = "ОК",
    onClose: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(381.dp)
            .advancedShadow(
                color = Color.Black,
                alpha = 0.1f,
                offsetY = 4.dp,
                shadowBlurRadius = 4.dp,
                cornersRadius = 64.dp
            )
            .background(
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(64.dp, 65.dp, 32.dp, 32.dp)
            )
            .padding(top = 19.dp)
    ) {
        Column(Modifier.width(IntrinsicSize.Max)) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            )
            Divider(color = MaterialTheme.colorScheme.onSurface)
        }

        Spacer(modifier = Modifier.height(9.dp))

        Text(
            text = body,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onPrimary,
                textAlign = TextAlign.Center,
                letterSpacing = 0.em,
                lineHeight = 1.em
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = onClose,
            shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
            colors = ButtonDefaults.textButtonColors(
                contentColor = MaterialTheme.colorScheme.secondary,
                containerColor = MaterialTheme.colorScheme.onPrimary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 48.dp)
        ) {
            Text(
                text = buttonText,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.em,
                    lineHeight = 1.em
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JetDialogPreview() {
    FishGalleryTheme {
        JetDialog(
            title = "Наши контакты",
            body = "E-mail: blue-rose@our.galaxy\nАдресат: Джонни Сильверхэд",
            buttonText = "ОК",
            onClose = {}
        )
    }
}