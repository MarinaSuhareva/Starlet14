package ru.netologi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRangeVolumeMax() {
        Radio receiver = new Radio();

        receiver.setRangeVolume(10);
        receiver.setIncreaseVolume();

        int actual = receiver.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRangeVolumeMin() {
        Radio receiver = new Radio();
        receiver.setRangeVolume(0);
        receiver.setVolumeReduction();
        int actual = receiver.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setIncreaseVolume() {
        Radio receiver = new Radio();
        receiver.setRangeVolume(7);
        receiver.setIncreaseVolume();
        int actual = receiver.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolumeReduction() {
        Radio receiver = new Radio();
        receiver.setRangeVolume(2);
        receiver.setVolumeReduction();
        int actual = receiver.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioСhannel1() {
        Radio receiver = new Radio();
        receiver.setCurrentStation(-1);
        int actual = receiver.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioСhannel2() {
        Radio receiver = new Radio();
        receiver.setCurrentStation(15);
        int actual = receiver.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioСhannel3() {
        Radio receiver = new Radio();
        receiver.setCurrentStation(3);
        int actual = receiver.getCurrentStation();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setSwitchTheRadioStationMax() {
        Radio receiver = new Radio();
        receiver.setCurrentStation(9);
        receiver.setNext();

        int actual = receiver.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setSwitchTheRadioStationMin() {
        Radio receiver = new Radio();
        receiver.setCurrentStation(-1);
        receiver.setPrev();

        int actual = receiver.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousRadioStation() {
        Radio receiver = new Radio();
        receiver.setCurrentStation(1);
        receiver.setPrev();
        int actual = receiver.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStation() {
        Radio receiver = new Radio();
        receiver.setCurrentStation(6);
        receiver.setNext();
        int actual = receiver.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }


}
