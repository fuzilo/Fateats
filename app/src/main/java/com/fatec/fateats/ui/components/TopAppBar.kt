package com.fatec.fateats.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.fatec.fateats.ui.theme.Indigo500

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(title: String){
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Indigo500),
        title = { Text(
                text = title,
            color = Color.White)}

    )






}