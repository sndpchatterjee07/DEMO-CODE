package com.github.sndpchatterjee07;

/**
 * @author sandeep
 * @version 1.0
 *
 */
public class Welcome{

    private String greetingMessage;

    // CONSTRUCTOR.
    public Welcome(String greetingMessage){
        this.greetingMessage = greetingMessage;
    }

    // ACCESSORS & MUTATORS.
    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }
}
