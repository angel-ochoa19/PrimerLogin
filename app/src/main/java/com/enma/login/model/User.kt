package com.enma.login.model

import android.provider.ContactsContract.CommonDataKinds.Email

data class User(
    val email: String,
    val userId: String,
    val name: String
){
    fun toMap(): MutableMap<String, Any>{
        return mutableMapOf(
            "email" to email,
            "UserId" to userId,
            "name" to name
        )
    }
}
