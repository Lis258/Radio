package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void pressNextRadioStation(){
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void pressPrevRadioStation(){
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void setUpRadioStation(){
        int radioStation = 1;
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.putRadioStation(radioStation);
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void makeLouder(){
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void makeQuieter(){
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


}
