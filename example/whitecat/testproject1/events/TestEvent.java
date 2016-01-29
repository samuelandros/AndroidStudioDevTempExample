package com.example.whitecat.testproject1.events;

public class TestEvent {
    private String mMessage;

    public TestEvent(String message){
        mMessage = message;
    }

    public String getMessage() {
        return mMessage;
    }
}
