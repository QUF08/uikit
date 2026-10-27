package com.pgkchamps.uikitlib.compomnents

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pgkchamps.uikitlib.ui.UikitTheme

@Composable
fun ButtonDefault(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick,
        modifier
    ) {
        Text(
            text
        )
    }
}


@Preview
@Composable
private fun PrevButton() {
    UikitTheme {
        ButtonDefault(
            "Let’s Combat!",
            {

            }
        )
    }
}