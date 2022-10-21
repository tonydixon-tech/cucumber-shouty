package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person<T>{
    private List<T> messages = new ArrayList<>();
    public void moveTo(final Integer distance) {
        System.out.format("distance is %d metres.\n", distance);
    }

    public void shout(final T message) {
        System.out.println(message);
    }

    public <T> List<T> getMessagesHeard() {
        return (List<T>) this.messages;
    }

    public void hears(final T message) {
        messages.add(message);
    }

    public void heard(final T messageFromSean) {
        System.out.println(messageFromSean);
    }
}
