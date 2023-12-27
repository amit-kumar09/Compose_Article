package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle(stringResource(R.string.title),
                        stringResource(R.string.p_graph1),
                        stringResource(R.string.p_graph2)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(title: String,text1: String,text2: String ) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(painter = image, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp),
            textAlign = TextAlign.Center
            )
        Text(text = text1,
            modifier = Modifier.padding(start = 16.dp,
                end = 16.dp),
            textAlign = TextAlign.Justify
            )
        Text(text = text2,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp),
            textAlign = TextAlign.Justify
            )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        ComposeArticle(stringResource(R.string.title),
            stringResource(R.string.p_graph1),
            stringResource(R.string.p_graph2))
    }
}