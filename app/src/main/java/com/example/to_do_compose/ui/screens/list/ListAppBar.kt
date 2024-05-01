package com.example.to_do_compose.ui.screens.list

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_do_compose.R
import com.example.to_do_compose.ui.theme.topAppBarBackgroundColor
import com.example.to_do_compose.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar() {
    DefaultListAppBar(
        onSearchClicked = {

        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar(
    onSearchClicked: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = Color.topAppBarContentColor
            )
        },
        actions = {
            ListAppBarActions(onSearchClicked = onSearchClicked)
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.topAppBarBackgroundColor
        )
    )
}

@Composable
fun ListAppBarActions(onSearchClicked: () -> Unit) {
    SearchAction(onSearchClicked = onSearchClicked)
}

@Composable
fun SearchAction(
    onSearchClicked: () -> Unit
) {
    IconButton(onClick = onSearchClicked) {
        Icon(
            contentDescription = stringResource(R.string.search_action),
            imageVector = Icons.Filled.Search,
            tint = Color.topAppBarContentColor
        )
    }
}

@Composable
fun SortAction(
    onSortClicked: () -> Unit
) {
    IconButton(onClick = onSortClicked) {
        Icon(
            contentDescription = stringResource(R.string.sort_action),
            imageVector = Icons.Filled.Search,
            tint = Color.topAppBarContentColor
        )
    }
}


@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar(
        onSearchClicked = {}
    )
}