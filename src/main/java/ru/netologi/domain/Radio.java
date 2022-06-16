package ru.netologi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
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

}




