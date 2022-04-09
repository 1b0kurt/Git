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
var ahmet="mehmet"
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
    Greeting("ikinci")
    Greeting("ikinci")
    Greeting("ikinci")
    Greeting("aaa")
    Greeting("bbb")
    Greeting("ccc")
    Greeting("DDD")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GitHubTheme {

        Greeting("1")
        Greeting("2")
        Greeting("3")
        Greeting("4")
        Greeting("ges")
        Greeting("777")
        Greeting("666")
        Greeting("222")
        Greeting("1234")

        Greeting("aaa")

        Greeting("bbb")

        Greeting("ccc")
        Greeting("DDD")


    }
}

