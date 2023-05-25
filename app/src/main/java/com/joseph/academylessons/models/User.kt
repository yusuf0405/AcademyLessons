package com.joseph.academylessons.models

data class User(
    val name: String,
    val lastName: String,
    val email: String,
    val password: String,
    val isAuth: Boolean,
)