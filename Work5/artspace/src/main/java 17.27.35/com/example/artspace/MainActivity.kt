package com.example.artspace

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { ArtSpaceApp() } }
    }
}

data class Artwork(
    val image: Int,
    @param:StringRes val titleRes: Int,
    @param:StringRes val artistRes: Int,
    val year: Int
)

@Composable
fun ArtSpaceApp() {
    val artworks = listOf(
        Artwork(R.drawable.art_1, R.string.art_1_title, R.string.art_1_artist, 1930),
        Artwork(R.drawable.art_2, R.string.art_2_title, R.string.art_2_artist, 2026),
        Artwork(R.drawable.art_3, R.string.art_3_title, R.string.art_3_artist, 2026)
    )
    var current by rememberSaveable { mutableIntStateOf(0) }
    val artwork = artworks[current]
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.weight(1f).fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Surface(shadowElevation = 8.dp, color = Color.White) {
                Image(
                    painter = painterResource(artwork.image),
                    contentDescription = stringResource(artwork.titleRes),
                    modifier = Modifier.padding(24.dp).size(280.dp),
                    contentScale = ContentScale.Fit
                )
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth().background(Color(0xFFECEBF4)).padding(16.dp)
        ) {
            Text(stringResource(artwork.titleRes), fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(
                stringResource(
                    R.string.artwork_credit,
                    stringResource(artwork.artistRes),
                    artwork.year
                ),
                fontSize = 16.sp
            )
        }
        Spacer(Modifier.height(24.dp))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = {
                current = if (current > 0) current - 1 else artworks.size - 1
            }) {
                Text(stringResource(R.string.previous))
            }

            Button(onClick = {
                current = if (current < artworks.size - 1) current + 1 else 0
            }) {
                Text(stringResource(R.string.next))
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtSpaceAppPreview() {
    MaterialTheme {
        ArtSpaceApp()
    }
}
