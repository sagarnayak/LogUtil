package com.sagar.android.logutilmaster

interface LogUtilContract {
    fun logged(message: String, logLevel: LogLevel, logTag: String)
}