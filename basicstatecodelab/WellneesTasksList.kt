package np.com.bimalkafle.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier


//fun getWellnessTasks()= List(30){i -> WellnessTask(i,"Task # $i") }
@Composable
fun WellnessTasksList(
    list: List<WellnessTask> ,
    onChwckedTask: (WellnessTask, Boolean)-> Unit,
    onClosedTask: (WellnessTask )-> Unit ,
    modifier: Modifier = Modifier
){
    LazyColumn (
        modifier = modifier
        //state: LazyListState = rememberLazyListState(),
    ){
        items(
            items = list,
            key = {task -> task.id }
            ) { task ->
            WellenessTaskItem(
                taskName = task.label,
                cheked = task.checked,
                onCheckedChange = {checked -> onClosesTask(task, checked) },
                onClose = {onClosedTask(task)}
            )
        }
    }
}