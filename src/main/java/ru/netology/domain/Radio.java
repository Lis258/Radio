package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation;
    private int endRadioStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

    public Radio(int currentRadioStation, int firstRadioStation, int endRadioStation, int currentVolume, int minVolume, int maxVolume) {
        this.currentRadioStation = currentRadioStation;
        this.firstRadioStation = firstRadioStation;
        this.endRadioStation = endRadioStation;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radio() {
    }

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
