package com.kuit.ourmenu.ui.addmenu.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.ourmenu.ui.addmenu.component.AddMenuBottomSheetContent
import com.kuit.ourmenu.ui.addmenu.component.AddMenuTopAppBar
import com.kuit.ourmenu.ui.common.SearchBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddMenuScreen(modifier: Modifier = Modifier) {
    val scaffoldState = rememberBottomSheetScaffoldState()
    val showBottomSheet by remember { mutableStateOf(true) }
    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AddMenuTopAppBar {
                Text(
                    "OURMENU",
                    color = Color(0xFFFF5420),
                    fontWeight = FontWeight.Bold
                )
            }
        },
        sheetContainerColor = Color.White,
        sheetContent = {
            //bottom sheet 구성
            AddMenuBottomSheetContent()
        },
        //조건 만족하면 bottom sheet 보여주고, 아니면 화면에 안보이도록 처리
        sheetPeekHeight = if (showBottomSheet) 100.dp else 0.dp,
        sheetDragHandle = {
            // 커스텀 핸들
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .height(4.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(Color(0xFFE5E5E7))
                )
            }
        }
    ) {
        //전체 화면 구성, 지도는 추가 예정
        Column(modifier = Modifier.padding(horizontal = 12.dp)) {
            Spacer(modifier = Modifier.height(12.dp))
            SearchBar(onSearch = { })
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AddMenuScreenPreview() {
    AddMenuScreen()
}