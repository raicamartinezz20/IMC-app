package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.ImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        modifier = Modifier.fillMaxHeight()

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFFE91E63)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(
                    id = R.drawable.imc
                ),
                contentDescription = "Calculadora de peso e altura",
                modifier = Modifier
                    .width(70.dp)
                    .height(100.dp)
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontSize = 28.sp
            )
        }
        Card(
            modifier = Modifier
                .width(350.dp)
                .height(400.dp)
                .padding(start = 30.dp)
                .offset(y = 45.dp),
            colors = CardDefaults.cardColors(Color(0x52FFEB3B)),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp)
                    .fillMaxHeight()
            ) {
                Text(
                    text = "Seus Dados",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFE91E63),
                    modifier = Modifier.padding(start = 50.dp)
                )
                Spacer(
                    modifier = Modifier.height(24.dp)
                )
                Text(
                    text = "Seu peso",
                    color = Color(0xFFE91E63)
                )
                Spacer(
                    modifier = Modifier.height(12.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "Seu peso em Kg")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White,
                        unfocusedBorderColor = Color(0xFFE91E63),
                        focusedBorderColor = Color(0xFFE91E63)
                    )
                )
                Spacer(
                    modifier = Modifier.height(24.dp)
                )
                Text(
                    text = "Sua altura",
                    color = Color(0xFFE91E63)
                )
                Spacer(
                    modifier = Modifier.height(12.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(
                            text = "Sua altura em cm"
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White,
                        unfocusedBorderColor = Color(0xFFE91E63),
                        focusedBorderColor = Color(0xFFE91E63),

                        )
                )
                Spacer(
                    modifier = Modifier.height(32.dp)
                )
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xFFE91E63)),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.width(275.dp)
                ) {
                    Text(
                        text = "CALCULAR",
                        fontSize = 18.sp,
                        letterSpacing = 1.sp
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .width(400.dp)
                .height(150.dp)
                .padding(30.dp),
            colors = CardDefaults.cardColors(Color(0xff329F68)),
            elevation = CardDefaults.cardElevation(defaultElevation = 16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 20.dp, start = 40.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)
                ) {
                    Text(
                        text = "Resultado",
                        color = Color.White
                    )
                    Text(
                        text = "Peso Ideal",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
                Spacer(
                    modifier = Modifier
                        .width(50.dp)
                )
                Text(
                    text = "21.3",
                    fontSize = 36.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        ImcTheme {
            Greeting()
        }

    }

