package br.com.vaske.integratis.service

import br.com.vaske.integratis.model.User
import org.springframework.stereotype.Service

@Service
class UserService(var users: List<User> = ArrayList()) {
    /**
     * This method is responsible for returning a list of users.
     * @return List<User>
     */
    fun getAllUsers(): List<User> {
        return users
    }

    /**
     * This method is responsible for returning a user by id.
     * @param id Long
     * @return User
     */
    fun getUserById(id: Long): User {
        return users.stream().filter({ it ->
            it.id == id
        }).findFirst().get()
    }

}
