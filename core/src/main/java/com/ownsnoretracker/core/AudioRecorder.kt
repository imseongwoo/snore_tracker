package com.ownsnoretracker.core

import java.io.File

interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}