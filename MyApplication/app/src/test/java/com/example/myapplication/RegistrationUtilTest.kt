package com.example.myapplication

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "123",
            repeatPassword ="123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Sam",
            password = "123",
            repeatPassword ="123"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun `username already excist return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "peter",
            password = "123",
            repeatPassword ="123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password input is empty return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Sam",
            password = "",
            repeatPassword =""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Sam",
            password = "123456",
            repeatPassword ="azerttyy"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `passsword input is less then 2 characters returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Sam",
            password = "A",
            repeatPassword ="A"
        )
        assertThat(result).isFalse()
    }


}
