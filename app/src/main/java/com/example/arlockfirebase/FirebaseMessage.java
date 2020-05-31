package com.example.arlockfirebase;
public class FirebaseMessage {

    public String name;
    public String text;

    public FirebaseMessage() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public FirebaseMessage(String username, String text) {
        this.name = username;
        this.text = text;
    }

}