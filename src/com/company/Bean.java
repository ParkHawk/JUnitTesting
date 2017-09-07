package com.company;

public class Bean {

    protected String name;

    protected String action;

    public Bean(String name, String action){
        this.name = name;
        this.action = action;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
