package ru.netologi.domain;

public class Radio {
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;


    public void setRangeVolume(int CurrentVolume) {
        this.currentVolume = CurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++; //= currentVolume + 1;
    }

    public void setVolumeReduction() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }


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


}
