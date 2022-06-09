package ru.netologi.domain;

public class Radio {

    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int stationNumber;


    public Radio(int maxVolume, int minVolume, int maxStation, int minStation, int stationNumber) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.stationNumber = stationNumber;
    }


    public int getCurrentVolume() {
        return currentVolume;

    }

    public void setRangeVolume(int CurrentVolume) {
        this.currentVolume = CurrentVolume;
    }


    public void setIncreaseVolume() {
        if (currentVolume >= maxVolume) {
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
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setNext() {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation++;
        }
    }

    public void setPrev() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation--;

        }
    }

    public void setStationNumber() {
        this.stationNumber = currentStation++;
    }

    public int getStationNumber() {
        return stationNumber;
    }
}



