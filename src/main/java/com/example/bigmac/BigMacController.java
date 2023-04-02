package com.example.bigmac;

import javafx.fxml.FXML;


import java.io.IOException;

public class BigMacController {
    Model model = new Model();


    public void setModel(Model model) {
        this.model = model;
    }
    @FXML
    void menuButtonPressedHandle() throws IOException {
        MainBigMac.setRoot("Menu.fxml");
    }


    @FXML
    void burgersButtonPressed() throws IOException{
        MainBigMac.setRoot("Burgers.fxml");

    }

    @FXML
    void drinksButtonPressed() throws IOException{
        MainBigMac.setRoot("Drinks.fxml");

    }

    @FXML
    void gyrosButtonPressed() throws IOException{
        MainBigMac.setRoot("Gyros.fxml");

    }

    @FXML
    void pizzasButtonPressed() throws IOException{
        menuButtonPressedHandle();
    }

//Add to Cart Method Should be implemented by : if price not discounted then use price text value to be added to the cart value
//                                              if price ie discounted then use discounted price label value to be added to the cart value
    @FXML
    void addToCartPressed() {
        //Not Implemented method;
    }


    @FXML
    void loginButtonPressed() throws IOException {
        MainBigMac.setRoot("Login.fxml");
    }

    @FXML
    void aboutUsButtonPressed( ) throws IOException {
        MainBigMac.setRoot("AboutUs.fxml");
    }
//This is method below is used to load the SignUP.fxml file , Signing up will be handled with another method
    @FXML
    void signUpButtonPressed() throws IOException {
        MainBigMac.setRoot("SignUp.fxml");
    }



}