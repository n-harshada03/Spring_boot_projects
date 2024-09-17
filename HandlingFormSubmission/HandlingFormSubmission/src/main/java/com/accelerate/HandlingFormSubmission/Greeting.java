package com.accelerate.HandlingFormSubmission;

public class Greeting {

    private long id;
    private String content;

    private long getId(){
        return id;
    }
    private long setId(long id ){
        this.id=id;
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
