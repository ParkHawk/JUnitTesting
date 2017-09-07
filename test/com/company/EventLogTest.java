package com.company;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class EventLogTest {

    @Test(expected = IllegalArgumentException.class)
    public void EventIsNull() {
        //arrange
        EventLog eventLog = new EventLog();
        //act
        eventLog.addEvent(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NameIsNull() {
        //arrange
        EventLog eventLog = new EventLog();
        Bean newEvent = new Bean(null, "text");
        //act
        eventLog.addEvent(newEvent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ActionIsNull() {
        //arrange
        EventLog eventLog = new EventLog();
        Bean newEvent = new Bean("text", null);
        //act
        eventLog.addEvent(newEvent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void BothAreNull() {
        //arrange
        EventLog eventLog = new EventLog();
        Bean newEvent = new Bean(null, null);
        //act
        eventLog.addEvent(newEvent);
    }

    @Test
    public void AddedToList() {
        //arrange
        EventLog eventLog = new EventLog();
        Bean newEvent = new Bean("text", "TextMessaging");
        //act
        eventLog.addEvent(newEvent);
        //assert
        assertThat(eventLog.getNumEvents(), equalTo(1));
    }

    @Test
    public void FailToAdd(){
        //arrange
        EventLog eventLog = new EventLog();
        Bean newEvent = new Bean("text", "notListed");
        //assert
        assertThat(newEvent, equalTo( new IllegalArgumentException()));
    }

    @Test
    public void TwoAddedToList() {
        //arrange
        EventLog eventLog = new EventLog();
        Bean newEvent = new Bean("text", "PhoneCall");
        Bean newEvent2 = new Bean("text", "Unknown");
        //act
        eventLog.addEvent(newEvent);
        eventLog.addEvent(newEvent2);
        //assert
        assertThat(eventLog.getNumEvents(), equalTo(2));
    }

}