package com.example.ej7_lab03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.ej7_lab03.ui.theme.Ej7_Lab03Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ej7_Lab03Theme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Jetpack Compose Demo") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            item {
                GridExample()
                ConstraintLayoutExample()
                SurfaceExample()
                ChipExample()
                BackdropScaffoldExample()
                FlowRowExample()
                FlowColumnExample()
                AlertDialogExample()
                CardExample()
                CheckboxExample()
                ProgressBarExample()
                RadioButtonExample()
                SliderExample()
                SpacerExample()
                SwitchExample()
                BottomNavigationExample()
                DialogExample()
                DividerExample()
                DropDownMenuExample()
                LazyVerticalGridExample()
                NavigationRailExample()
                OutlinedTextFieldExample()
                PagerExample()
                SnackbarExample()
                TabRowExample()
                TooltipExample()
            }
        }
    }
}
@Composable
fun LazyColumnExample() {
    LazyColumn {
        items(10) { index ->
            Text("Item #$index", modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun LazyRowExample() {
    LazyRow {
        items(10) { index ->
            Text("Item #$index", modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun GridExample() {
    // Aquí puedes implementar un Grid sencillo usando Column y Row
}

@Composable
fun ConstraintLayoutExample() {
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        val (text, button) = createRefs()

        Text("Hello ConstraintLayout",
            Modifier.constrainAs(text) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)
            }
        )

        Button(onClick = {}, modifier = Modifier.constrainAs(button) {
            top.linkTo(text.bottom, margin = 16.dp)
            start.linkTo(parent.start, margin = 16.dp)
        }) {
            Text("Button")
        }
    }
}

@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Scaffold Example") }) },
        content = { Text("Content") }
    )
}

@Composable
fun SurfaceExample() {
    Surface(color = MaterialTheme.colorScheme.primary, modifier = Modifier.padding(8.dp)) {
        Text("Surface", modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun ChipExample() {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(8.dp)
    ) {
        Text("Chip", modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun BackdropScaffoldExample() {
    // BackdropScaffold is a bit complex, this is a placeholder
    Text("BackdropScaffold Example")
}

@Composable
fun FlowRowExample() {
    // Placeholder
    Text("FlowRow Example")
}

@Composable
fun FlowColumnExample() {
    // Placeholder
    Text("FlowColumn Example")
}
@Composable
fun AlertDialogExample() {
    var showDialog = remember { mutableStateOf(true) }

    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false },
            title = { Text("Dialog Title") },
            text = { Text("This is a dialog.") },
            confirmButton = {
                TextButton(onClick = { showDialog.value = false }) {
                    Text("OK")
                }
            }
        )
    }
}

@Composable
fun CardExample() {
    Card(modifier = Modifier.padding(8.dp)) {
        Text("Card Example", modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun CheckboxExample() {
    var checked = remember { mutableStateOf(false) }

    Checkbox(
        checked = checked.value,
        onCheckedChange = { checked.value = it }
    )
}

@Composable
fun ProgressBarExample() {
    CircularProgressIndicator()
}

@Composable
fun RadioButtonExample() {
    var selected = remember { mutableStateOf(false) }

    RadioButton(
        selected = selected.value,
        onClick = { selected.value = !selected.value }
    )
}

@Composable
fun SliderExample() {
    var sliderValue = remember { mutableStateOf(0f) }

    Slider(
        value = sliderValue.value,
        onValueChange = { sliderValue.value = it }
    )
}

@Composable
fun SpacerExample() {
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
fun SwitchExample() {
    var checked = remember { mutableStateOf(false) }

    Switch(
        checked = checked.value,
        onCheckedChange = { checked.value = it }
    )
}

@Composable
fun BottomNavigationExample() {
    BottomNavigation {
        BottomNavigationItem(
            selected = true,
            onClick = {},
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") }
        )
    }
}

@Composable
fun DialogExample() {
    // Placeholder
    Text("Dialog Example")
}

@Composable
fun DividerExample() {
    Divider(color = MaterialTheme.colorScheme.primary)
}

@Composable
fun DropDownMenuExample() {
    // Placeholder
    Text("DropDownMenu Example")
}

@Composable
fun LazyVerticalGridExample() {
    // Placeholder
    Text("LazyVerticalGrid Example")
}

@Composable
fun NavigationRailExample() {
    // Placeholder
    Text("NavigationRail Example")
}

@Composable
fun OutlinedTextFieldExample() {
    var text = remember { mutableStateOf("") }

    OutlinedTextField(
        value = text.value,
        onValueChange = { text.value = it },
        label = { Text("OutlinedTextField") }
    )
}

@Composable
fun PagerExample() {
    // Placeholder
    Text("Pager Example")
}

@Composable
fun SnackbarExample() {
    Snackbar {
        Text("Snackbar Example")
    }
}

@Composable
fun TabRowExample() {
    // Placeholder
    Text("TabRow Example")
}

@Composable
fun TooltipExample() {
    // Placeholder
    Text("Tooltip Example")
}
