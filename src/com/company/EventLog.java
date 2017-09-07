package com.company;

import java.util.List;
import java.util.ArrayList;

public class EventLog {

    private List<Bean> eventList = new ArrayList<>();

    public boolean addEvent(Bean event){
        if (event == null){
            throw new IllegalArgumentException();
        } else if(event.name == null || event.action == null){
            throw new IllegalArgumentException("Cannot have blank name");
        } else if(!event.action.equals("Face2Face") && !event.action.equals("TextMessaging") && !event.action.equals("Unknown") && !event.action.equals("PhoneCall")){
            throw new IllegalArgumentException("Don't forget about the action type!");
        }
        else{
            System.out.println(event);
            eventList.add(event);
            return true;
        }
    }

    public int getNumEvents(){
        return eventList.size();
    }

    public EventLog(){
        eventList = new ArrayList<>();
    }



}
