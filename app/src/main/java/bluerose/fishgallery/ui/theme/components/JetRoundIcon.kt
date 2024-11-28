package bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import bluerose.fishgallery.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import bluerose.fishgallery.ui.theme.OnPrimaryColor
import bluerose.fishgallery.ui.theme.SurfaceColor
import bluerose.fishgallery.ui.theme.back_logo

@Composable
fun JetRoundIcon(vectorDrawableId: Int, modifier: Modifier)
{
    Box(
        modifier = modifier
            .clip(shape= CircleShape) //обрезали по форме круга
            .background(color= back_logo) //заполнили светло-голубым
            .border(width= 2.dp, color= OnPrimaryColor, shape= CircleShape) //сделали темную рамку
            .size(100.dp), //ограничили в размере, иконка ж
        contentAlignment = Alignment.Center //выравнивание по центру
    ){
        Icon(
            imageVector = ImageVector.vectorResource(id= vectorDrawableId),
            contentDescription = "",
            modifier = modifier
                .background(color = back_logo),
            tint = SurfaceColor
        )
    }
}

@Preview(showBackground = false, showSystemUi = false)
@Composable
fun JetRoundIconPreview(){
    JetRoundIcon(
        vectorDrawableId = R.drawable.ic_icon,
        modifier = Modifier)
}