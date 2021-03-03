package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int firstRadioStation;
    private int endRadioStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

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
