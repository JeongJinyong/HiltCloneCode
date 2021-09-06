package com.example.hiltclonecode

import android.app.Application
import com.example.hiltclonecode.data.LoggerLocalDataSource
import com.example.hiltclonecode.util.DateFormatter
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class ExampleApplication : Application() {

    @Inject lateinit var logger: LoggerLocalDataSource
    @Inject lateinit var dateFormatter: DateFormatter

}