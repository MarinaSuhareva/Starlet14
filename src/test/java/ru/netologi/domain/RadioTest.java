package ru.netologi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio receiver = new Radio(100, 0, 9, 0, 10);

    @Test
    public void setRangeVolumeMax() {

        receiver.setRangeVolume(100);

        int actual = receiver.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRangeVolumeMin() {

        int actual = receiver.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setIncreaseVolume() {

        receiver.setRangeVolume(7);
        receiver.setIncreaseVolume();
        int actual = receiver.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseVolume2() {
        receiver.setRangeVolume(99);
        receiver.setIncreaseVolume();
        int actual = receiver.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseVolume3() {
        receiver.setRangeVolume(100);
        receiver.setIncreaseVolume();
        int actual = receiver.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setVolumeReduction() {
        receiver.setRangeVolume(2);
        receiver.setVolumeReduction();
        int actual = receiver.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeReduction2() {
        receiver.setRangeVolume(100);
        receiver.setVolumeReduction();
        int actual = receiver.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeReduction3() {
        receiver.setRangeVolume(0);
        receiver.setVolumeReduction();
        int actual = receiver.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setRadioСhannel1() {
        receiver.setCurrentStation(-1);
        int actual = receiver.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioСhannel2() {
        receiver.setCurrentStation(15);
        int actual = receiver.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioСhannel3() {
        receiver.setCurrentStation(3);
        int actual = receiver.getCurrentStation();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSwitchTheRadioStationMax() {
        receiver.setCurrentStation(9);
        receiver.setNext();

        int actual = receiver.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setSwitchTheRadioStationMin() {
        receiver.setCurrentStation(-1);
        receiver.setPrev();

        int actual = receiver.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousRadioStation() {
        receiver.setCurrentStation(1);
        receiver.setPrev();
        int actual = receiver.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStation() {
        receiver.setCurrentStation(6);
        receiver.setNext();
        int actual = receiver.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationNumber() {
        receiver.setCurrentStation(9);
        receiver.setStationNumber();
        int actual = receiver.getCurrentStation();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumber() {
        receiver.getStationNumber();
        receiver.setStationNumber();
        int actual = receiver.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

}
