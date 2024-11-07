package np.com.bimalkafle.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier= Modifier,
                   wellnessViewModel: WellnessViewModel = viewModel()

){
   Column (modifier = modifier){  }
   StatefulCounter()
   WellnessScreen(
      list = wellnessViewModel.task,
      omCheckedTask = {task, cheked ->
         wellnessViewModel.changeTaskChekesd(task, cheked)
      },
      onCloseTask = {task ->
         wellnessViewModel.remove(task)
      }
   )
}