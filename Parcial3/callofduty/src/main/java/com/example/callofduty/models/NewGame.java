package com.example.callofduty.models;

public class NewGame {
    private String url, name, description;

    public NewGame(String url, String name, String description) {
        this.url = url;
        this.name = name;
        this.description = description;
    }
    
    public NewGame() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
