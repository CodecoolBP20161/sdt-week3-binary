package com.codecool.ipbinary.model;

/** Binary representation of a number, smaller than 255 */
public class BinaryInteger {

    public BinaryInteger(int decimal){
        if(decimal > 255){
            throw new RuntimeException("It's enough to handle numbers smaller or equals to 255.");
        }
    }

    public String getStringValue(){
        return "Not implemented yet";
    }

}
