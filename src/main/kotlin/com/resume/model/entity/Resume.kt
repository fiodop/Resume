package com.resume.model.entity


data class Resume(
    val name : String,
    val surname : String,
    val experience : String,
    val education : String,
    val skills : String,
    val PetProjects : HashMap<String, String>
)