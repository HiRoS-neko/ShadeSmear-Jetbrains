package com.github.hirosneko.shadesmearjetbrains.services

import com.intellij.openapi.project.Project
import com.github.hirosneko.shadesmearjetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
