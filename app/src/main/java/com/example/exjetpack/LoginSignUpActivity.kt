package com.example.exjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exjetpack.ui.theme.ExJetpackTheme

class LoginSignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExJetpackTheme {
                LoginSignUpScreen()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun LoginSignUpScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(20.dp)
        ) {
            Spacer(
                modifier = Modifier
                    .height(60.dp)
            )
            Text(
                text = "Sign In",
                fontSize = 36.sp,
                color = Color.Blue,
                fontFamily = FontFamily(Font(R.font.pt_serif_regular, FontWeight.Bold)),
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = "Sign in now to access your exercises and saved music.",
                fontSize = 22.sp,
                color = Color.Blue,
                fontFamily = FontFamily(Font(R.font.pt_sans_regular)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 20.dp, 0.dp, 0.dp)
            )
        }
    }
}