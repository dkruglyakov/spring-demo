package com.example.demo.service

import com.example.demo.repository.DemoUser
import com.example.demo.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val repository: UserRepository) {

    fun getUsers(): List<DemoUser> {
        return repository.findAll().toList()
    }
}
