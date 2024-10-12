package io.github.uxlabspk.syncbox.View.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import io.github.uxlabspk.syncbox.R

sealed class TextFieldType(val placeholder: String, val keyboardType: KeyboardType) {
    object Text : TextFieldType("Enter your name", KeyboardType.Text)
    object Email : TextFieldType("Enter your email", KeyboardType.Email)
    object Password : TextFieldType("Enter your password", KeyboardType.Password)
}

@Composable
fun InputField(
    inputState: String,
    onValueChange: (String) -> Unit,
    textFieldType: TextFieldType,
    modifier: Modifier = Modifier
) {
    var passwordVisibility by remember { mutableStateOf(false) }
    val icon = when(textFieldType.keyboardType) {
        KeyboardType.Email -> Icons.Default.Email
        KeyboardType.Text -> Icons.Default.Person
        else -> Icons.Default.Lock
    }


    // if (textFieldType.keyboardType == KeyboardType.Email) Icons.Default.Email else Icons.Default.Lock
    val eyeIcon = if (passwordVisibility) painterResource(id = R.drawable.ic_invisible) else painterResource(id = R.drawable.ic_visible)

    TextField(
        value = inputState,
        onValueChange = onValueChange,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        label = {
            Text(
                text = textFieldType.placeholder,
                color = MaterialTheme.colorScheme.primary
            )
        },
        isError = false,
        leadingIcon = {
            Icon(imageVector = icon, contentDescription = "Icon")
        },
        trailingIcon = {
            if (textFieldType is TextFieldType.Password) {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(
                        painter = eyeIcon,
                        contentDescription = "Visibility icon"
                    )
                }
            }
        },
        colors = TextFieldDefaults.colors(
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedLabelColor = Color.DarkGray,
            focusedLabelColor = Color.DarkGray,
            focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
            unfocusedLeadingIconColor = MaterialTheme.colorScheme.primary,
            focusedTextColor = MaterialTheme.colorScheme.primary,
            unfocusedTextColor = MaterialTheme.colorScheme.primary,
            disabledIndicatorColor = Color.Transparent,
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            cursorColor = MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(5.dp),
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = textFieldType.keyboardType,
            imeAction = ImeAction.Go
        ),
        visualTransformation = if (textFieldType is TextFieldType.Password && !passwordVisibility) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        }
    )
}