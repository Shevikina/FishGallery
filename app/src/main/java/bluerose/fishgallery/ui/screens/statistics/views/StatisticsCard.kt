package bluerose.fishgallery.ui.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bluerose.fishgallery.ui.theme.FishGalleryTheme
import bluerose.fishgallery.ui.theme.robotoFonts
import bluerose.fishgallery.utils.dashedBorder

@Composable
fun StatisticsCard(label: String, text: String, shape: RoundedCornerShape, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .size(366.dp, 128.dp)
            .background(MaterialTheme.colorScheme.surface, shape = shape)
            .dashedBorder(
                3.dp,
                color = Color.Black.copy(0.1f),
                shape = shape,
                on = 11.dp,
                off = 10.dp)
    ){
        Text(
            text = label,
            fontFamily = robotoFonts,
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFFACACAC),
            modifier = Modifier.padding(start = 20.dp, top=24.dp)
        )
        Text(
            text = buildAnnotatedString {
                withStyle(SpanStyle(
                    color = MaterialTheme.colorScheme.onSecondary,
                    fontSize = 32.sp
                )) {
                    append(text.substringBeforeLast(" "))
                    append(" ")
                }
                withStyle(SpanStyle(
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 24.sp
                )) {
                    append(text.substringAfterLast(" "))
                }
            },
            fontFamily = robotoFonts,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
fun StatisticsCardPreview(){
    FishGalleryTheme{
        StatisticsCard(
            label = "Наш улов",
            text = "~ 108 000 000 тонн",
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 32.dp, bottomEnd = 16.dp),
            modifier = Modifier
        )
    }
}