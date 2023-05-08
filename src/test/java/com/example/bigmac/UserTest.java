package com.example.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testUserConstructor() {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "123456789";
        String userName = "johndoe";
        String password = "password123";

        User user = new User(firstName, lastName, phoneNumber, userName, password);

        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(phoneNumber, user.getPhoneNumber());
        assertEquals(userName, user.getUserName());
        assertEquals(password, user.getPassword());
    }

}