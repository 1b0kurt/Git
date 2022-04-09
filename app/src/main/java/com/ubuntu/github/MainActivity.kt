package com.ubuntu.github

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ubuntu.github.ui.theme.GitHubTheme
var ahmet="mehmet"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitHubTheme {
                Column(
                    Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    Column(
                        Modifier
                            .size(100.dp, 100.dp)
                            .background(Color.Yellow)
                            .padding(10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {

                        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.aaaa), contentDescription =null )
                    }
                    var sana2="kim"
                    Column(
                        Modifier
                            .size(100.dp,100.dp)
                            .background(Color.Yellow).padding(10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Bu gitHubtaki")
                        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.aaaa), contentDescription =null )
                    }
                    var sana="bana"
                    Column(
                        Modifier
                            .size(100.dp, 100.dp)
                            .background(Color.Yellow)
                            .padding(10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "bu normaldeki işte")
                        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.aaaa), contentDescription =null )
                    }
                    
                    Column(
                        Modifier
                            .size(100.dp,100.dp)
                            .background(Color.Yellow).padding(10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "2.Bu gitHubtaki")
                        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.aaaa), contentDescription =null )
                    }
                    Text(text = "4.Bu gitHubtaki")
                    Text(text = "3.Bu gitHubtaki")
                    Text(text = "3. bu normaldeki işte")
                    Column(
                        Modifier
                            .size(100.dp, 100.dp)
                            .background(Color.Yellow)
                            .padding(10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "ikinci bu normaldeki işte")
                        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.aaaa), contentDescription =null )
                    }

                }
                var a="ahmet"
                var m="Mehmet"
                Column(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.Yellow)
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "son bu normaldeki işte")
                    Image(bitmap = ImageBitmap.imageResource(id = R.drawable.aaaa), contentDescription =null )
                }
                var sana2="deneme"




                
            }
        }

        var b="ahmet"
        var cak="kim bu"
        var c="mehmet"


    }
}




