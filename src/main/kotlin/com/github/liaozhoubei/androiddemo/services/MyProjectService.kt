package com.github.liaozhoubei.androiddemo.services

import com.github.liaozhoubei.androiddemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
