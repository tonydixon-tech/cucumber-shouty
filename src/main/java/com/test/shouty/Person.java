package com.test.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person<T>{
    private List<T> messages = new ArrayList<>();
    public void moveTo(Integer distance) {
        System.out.format("distance is %d metres.\n", distance);
    }

    public void shout(T message) {
        System.out.println(message);
    }

    public <T> List<T> getMessagesHeard() {
        return (List<T>) this.messages;
    }

    public void hears(final T message) {
        messages.add(message);
    }

    public void heard(String messageFromSean) {
        System.out.println(messageFromSean);
    }
}
