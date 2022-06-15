package ru.netologi.domain;

public class Radio {

    private int maxVolume = 100;
    private int currentVolume;
    private int minVolume;
    private int currentStation;
    private int stationNumber = 10;
    private int minStation;

    public Radio(int stationNumber) {

        this.stationNumber = stationNumber;
    }

    public Radio() {
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setRangeVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume++;
    }

    public void setVolumeReduction() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }

    // Station
    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > stationNumber - 1) {
            this.currentStation = stationNumber - 1;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNext() {
        if (currentStation == stationNumber - 1) {
            this.currentStation = minStation;
        } else {
            this.currentStation++;
        }
    }

    public void setPrev() {
        if (currentStation == minStation) {
            this.currentStation = stationNumber - 1;
        } else {
            this.currentStation--;
        }
    }

    public void setStationNumber() {
        this.stationNumber = currentStation++;
    }

}




