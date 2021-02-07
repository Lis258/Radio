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
        int currentRadioStation = this.getCurrentRadioStation();
        if (currentRadioStation == endRadioStation) {
            this.currentRadioStation = firstRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void prevRadioStation() {
        int currentRadioStation = this.getCurrentRadioStation();
        if (currentRadioStation == firstRadioStation) {
            this.currentRadioStation = endRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void putRadioStation(int radioStation){
        if (radioStation > endRadioStation){
            return;
        }
        if (radioStation < firstRadioStation){
            return;
        }
        this.currentRadioStation = radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume){
            return;
        }
        if (currentVolume < minVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void plusVolume (){
        int currentVolume = this.getCurrentVolume();
        if (currentVolume >= maxVolume){
            return;
        }
        this.currentVolume++;
    }

    public void minusVolume (){
        int currentVolume = this.getCurrentVolume();
        if (currentVolume <= minVolume){
            return;
        }
        this.currentVolume--;
    }
}
