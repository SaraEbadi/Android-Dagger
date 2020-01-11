
package com.example.android.dagger.user

import javax.inject.Inject
import kotlin.random.Random

/**
 * UserDataRepository contains user-specific data such as username and unread notifications.
 */
class UserDataRepository @Inject constructor(private val userManager: UserManager) {

    val username: String
        get() = userManager.username

    var unreadNotifications: Int

    init {
        unreadNotifications = randomInt()
    }

    fun refreshUnreadNotifications() {
        unreadNotifications = randomInt()
    }
}

fun randomInt(): Int {
    return Random.nextInt(until = 100)
}
