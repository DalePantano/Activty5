package com.example.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test
import com.example.tiptime.ui.theme.TipTimeTheme
import java.text.NumberFormat

var composeTestRule: Nothing? = null

@Test
fun calculate_20_percent_tip() {
    composeTestRule = null
    composeTestRule.setContent {
        TipTimeTheme {
            TipTimeLayout()
        }
    }
    composeTestRule.onNodeWithText("Bill Amount")
        .performTextInput("10")
    composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")
    val expectedTip = NumberFormat.getCurrencyInstance().format(2)
    composeTestRule.onNodeWithText("Tip Amount: $expectedTip").performTextInput(
        "No node with this text was found.")
}

private fun Nothing?.setContent(function: Function<com.example.tiptime.TipTimeTheme>) {
    TODO("Not yet implemented")
}

private fun Any.performTextInput(s: String) {
    TODO("Not yet implemented")
}

private fun Nothing?.onNodeWithText(s: String): Any {
    TODO("Not yet implemented")
}

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()
}