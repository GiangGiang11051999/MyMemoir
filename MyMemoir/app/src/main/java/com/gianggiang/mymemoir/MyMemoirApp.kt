package com.gianggiang.mymemoir

import android.app.Application
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf

@Stable
@HiltAndroidApp
class MyMemoirApp  : Application() {

    val isDark = mutableStateOf(false)

    fun toggleTheme() {
        isDark.value = !isDark.value
    }
}
