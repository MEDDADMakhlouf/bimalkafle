package np.com.bimalkafle.basicstatecodelab

import android.R.attr.top
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun StatelessCounter (count : Int ,onIncrement : () -> Unit , modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
      // var count by rememberSaveable { mutableStateOf(0) }
        if (count > 0){
            Text(
                "you've had ${count} glasses.",
            )
        }
          Button(onClick = onIncrement, Modifier.padding(top= 8.dp), enabled = count < 10) {
                Text("Add one")
             }

         }
    }
@Composable
fun StatefulCounter(modifier: Modifier = Modifier){
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(count,{count++},modifier)
}
