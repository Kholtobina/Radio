package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;


    public int getMinRadioStation() {
        return minRadioStation;
    }
    public void setMinRadioStation(int minRadioStation){
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public void setMaxRadioStation(int maxRadioStation){
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }
    public void setMinVolume(int minVolume){
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume){
        this.maxVolume = maxVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation)
            return;
        if (currentRadioStation < minRadioStation)
            return;
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation)
            currentRadioStation++;
        if (currentRadioStation == maxRadioStation)
            currentRadioStation = minRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation)
            currentRadioStation--;
        if (currentRadioStation == minRadioStation)
            currentRadioStation = maxRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
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
