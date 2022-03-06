package com.github.benwatson528.templatetest.services

import com.intellij.openapi.project.Project
import com.github.benwatson528.templatetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
