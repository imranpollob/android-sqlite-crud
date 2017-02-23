package com.codalo.datastore;

/**
 * Created by Dell on 22-Feb-17.
 */

public class Contact {
    //private variables
    int _id;
    String _name;
    String _phone_number;

    //empty constructor
    public Contact(){

    }

    //constructor
    public Contact(int id,String name,String phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = phone_number;
    }

    //constructor
    public Contact(String name,String phone_number){
        this._name = name;
        this._phone_number = phone_number;
    }

    //getting id
    public int getID(){
        return this._id;
    }

    //setting id
    public void setID(int id){
        this._id = id;
    }

    //getting name
    public String getName(){
        return this._name;
    }

    //setting name
    public void setName(String name){
        this._name = name;
    }

    // getting phone number
    public String getPhoneNumber(){
        return this._phone_number;
    }

    // setting phone number
    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    }

}
