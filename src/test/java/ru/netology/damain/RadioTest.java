package ru.netology.damain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {

    @Test
    public void maxStation() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void minStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void updateNextStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.next();
        assertEquals(6, radio.getStation());
    }

    @Test
    public void updateLimitMaxStation() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();
        assertEquals(0, radio.getStation());
    }

    @Test
    public void updateOverMaxStation() {
        Radio radio = new Radio();
        radio.setStation(523);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void updatePrevStation() {
        Radio radio = new Radio();
        radio.setStation(6);
        radio.prev();
        assertEquals(5, radio.getStation());
    }

    @Test
    public void updateUnderLimitPrevStation() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();
        assertEquals(9, radio.getStation());
    }

    @Test
    public void updateStation() {
        Radio radio = new Radio();
        radio.setStation(0);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void updateStationOverLimit() {
        Radio radio = new Radio();
        radio.setStation(11);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void updateStationUnderLimit() {
        Radio radio = new Radio();
        radio.setStation(-10);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void volumePlus() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.plusVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    public void volumeMinus() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.minusVolume();
        assertEquals(9, radio.getVolume());
    }

    @Test
    public void volumePlusOverLimit() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.plusVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void volumeMinusOverLimit() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.minusVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void MaxVolume() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void MinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
    }

}
