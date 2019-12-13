package com.tourspel.tourapp.service

import javax.inject.Singleton

@Singleton
class GreetingService {

    fun greet(name: String): String {
        return "Hello $name"
    }
}
