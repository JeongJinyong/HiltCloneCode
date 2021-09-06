package com.example.hiltclonecode.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoggerLocalDataSource @Inject constructor(private val logDao: LogDao) {

}
