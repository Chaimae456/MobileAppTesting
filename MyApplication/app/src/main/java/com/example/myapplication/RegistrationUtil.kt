package com.example.myapplication

object RegistrationUtil {
    private val existingUsers = listOf("peter","carle")


    /*
    * the input is not valid if
    * the inputs are empty
    * the user name is already token
    * comfirmed password is not equal the password
    * password is less then 6 characters
    *
     */
    fun validateRegistrationInput (
        userName: String,
        password: String,
        repeatPassword: String
    ): Boolean{
        if (userName.isEmpty() || password.isEmpty()){
            return false
        }
        if (userName in existingUsers){
            return false
        }
        if (password != repeatPassword){
            return false
        }
        if(password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}