package com.example.final_screenshoot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.final_screenshoot.ui.theme.Final_ScreenshootTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Final_ScreenshootTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FinalScreenshotApp()
                }
            }
        }
    }
}

@Composable
fun FinalScreenshotApp() {
    FinalScreenShot(
        image = painterResource(id = R.drawable.ic_task_completed),
        textCompleted = stringResource(id = R.string.all_tasks_completed) , 
        textCongratulations = stringResource(id = R.string.nice_work))

}

@Composable
fun FinalScreenShot(image: Painter, textCompleted: String, textCongratulations: String){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            painter = image,
            contentDescription = null,

        )
        Text(
            text = textCompleted,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )

        Text(
            text = textCongratulations,
            fontSize = 16.sp
        )


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Final_ScreenshootTheme {
        FinalScreenshotApp(        )
    }
}