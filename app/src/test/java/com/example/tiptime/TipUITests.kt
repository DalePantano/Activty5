package com.example.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import com.example.tiptime.ui.theme.TipTimeTheme
import org.junit.Test

@Test
fun calculate_20_percent_tip() {
    composeTestRule.setContent {
        TipTimeTheme {
            TipTimeLayout()
        }
    }
}
class TipUITests {
    @get:Rule
    val composeTestRule = createComposeRule()
}