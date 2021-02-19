package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void pressNextStationIfCurrentMax() {
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void pressNextStationIfCurrentOverMax() {
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void pressPrevStationIfCurrentUnderMin() {
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void pressPrevStationIfValidCurrentValue() {
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void setUpStationValidValue() {
        int radioStation = 1;
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.putRadioStation(radioStation);
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void setUpStationOverMax() {
        int radioStation = 10;
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.putRadioStation(radioStation);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void setUpStationUnderMin() {
        int radioStation = -1;
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.putRadioStation(radioStation);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void makeLouderIfCurrentMax() {
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void makeLouderIfCurrentOverMax() {
        int currentVolume = 15;
        radio.setCurrentVolume(currentVolume);
        radio.plusVolume();
        assertEquals(1, radio.getCurrentVolume());
    }


    @Test
    public void makeQuieterIfValidCurrentValue() {
        int currentVolume = 1;
        radio.setCurrentVolume(currentVolume);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void makeQuieterIfCurrentUnderMin() {
        int currentVolume = -5;
        radio.setCurrentVolume(currentVolume);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


}
