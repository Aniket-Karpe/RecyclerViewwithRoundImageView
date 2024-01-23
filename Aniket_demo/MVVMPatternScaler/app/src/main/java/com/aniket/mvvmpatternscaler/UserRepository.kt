package com.aniket.mvvmpatternscaler

class UserRepository {
    fun getUser(): User {
        // Fetch user data from a remote data source or database
        return User("1", "Aniket Karpe", "aniket.karpe@example.com")
    }
}

