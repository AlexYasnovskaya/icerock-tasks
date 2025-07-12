package com.example.kmmapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kmmapp.ui.theme.KmmappTheme

class RotatingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KmmappTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RotatingGreeting()
                }
            }
        }
    }
}

@Composable
fun RotatingGreeting(modifier: Modifier = Modifier) {
    val padding = 20.dp

    Row {
        Text(
            text = stringResource(R.string.first),
            modifier = modifier.padding(padding)
        )
        Text(
            text = stringResource(R.string.second),
            modifier = modifier.padding(padding)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RotatingGreetingPreview() {
    KmmappTheme {
        Greeting()
    }
}