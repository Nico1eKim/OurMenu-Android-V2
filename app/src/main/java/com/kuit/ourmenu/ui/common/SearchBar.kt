package com.kuit.ourmenu.ui.common

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.ourmenu.R

@Composable
fun SearchBar(
    onSearch: () -> Unit,
) {
    Card(
        modifier = Modifier
            .shadow(elevation = 4.dp, shape = RoundedCornerShape(8.dp))
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        CustomTextField(
            modifier = Modifier
                .fillMaxWidth()
                .border(0.8.dp, Color.Gray, RoundedCornerShape(8.dp))
                .clip(RoundedCornerShape(8.dp))
                .height(44.dp)
            ,
            shape = RoundedCornerShape(8.dp),
            placeHolder = { Text(text = "placeholder", fontSize = 20.sp, color = Color.Gray) },
            textStyle = TextStyle(fontSize = 20.sp, color = Color(0xFF666668)),
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_searchbar_search),
                    contentDescription = "Search Icon",
                    tint = Color.Unspecified,
                    modifier = Modifier.clickable { onSearch() }
                )
            },
            paddingValues = PaddingValues(start = 28.dp, top = 0.dp, bottom = 0.dp),
            cursorColor = Color(0xFFFF5420)
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun SearchBarPreview() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        SearchBar(
            onSearch = { }
        )
    }
}