package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int endRadioStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > endRadioStation) {
            return;
        }
        if (currentRadioStation < firstRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == endRadioStation) {
            currentRadioStation = firstRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == firstRadioStation) {
            currentRadioStation = endRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public void putRadioStation(int radioStation) {

        if (radioStation > endRadioStation) {
            return;
        }
        if (radioStation < firstRadioStation) {
            return;
        }
        currentRadioStation = radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void plusVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void minusVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }
}
