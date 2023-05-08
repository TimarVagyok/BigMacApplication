package com.example.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    @Test
    void testSetUser() {
        // Create a new User object
        User user = new User("John", "Doe", "123456789", "johndoe", "password");

        // Create a new Model object and set the user
        Model model = new Model();
        model.setUser(user);
        assertEquals(user, model.getUser());
    }

}