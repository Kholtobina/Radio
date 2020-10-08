package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int currentRadioStation, int minRadioStation, int maxRadioStation, boolean on) {
        if (currentRadioStation > maxRadioStation)
            return;
        if (currentRadioStation < minRadioStation)
            return;
        this.currentRadioStation = currentRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public Radio(int currentVolume, int minVolume, int maxVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }


    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        }
        else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume)
            currentVolume++;
    }

    public void prevVolume() {
        if (currentVolume > minVolume)
            currentVolume--;
    }
}