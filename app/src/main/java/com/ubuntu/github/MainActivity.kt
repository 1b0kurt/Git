package com.ubuntu.github

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ubuntu.github.ui.theme.GitHubTheme
var a=5
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "asdasdasdasd $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "asdasdasdasd $name!")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GitHubTheme {
        Greeting("Android")

        Greeting("ikinci")

        Greeting("üçüncü")

        Greeting("dört")

        Greeting("beşinci")

        Greeting("beşinci")

        Greeting("beşinci")
        Greeting("branch")
        Greeting("1")
        Greeting("2")
    }
}

