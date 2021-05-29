package ru.netology.damain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {

    @Test
    public void maxStationDefolt() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void minStationDefolt() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void updateNextStation() {
        Radio radio = new Radio(10);
        radio.setStation(5);
        radio.next();
        assertEquals(6, radio.getStation());
    }

    @Test
    public void updateOverMaxStation() {
        Radio radio = new Radio(15);
        radio.setStation(14);
        radio.next();
        assertEquals(0, radio.getStation());
    }

    @Test
    public void updatePrevStation() {
        Radio radio = new Radio(41);
        radio.setStation(25);
        radio.prev();
        assertEquals(24, radio.getStation());
    }

    @Test
    public void updateUnderLimitPrevStation() {
        Radio radio = new Radio(36);
        radio.setStation(0);
        radio.prev();
        assertEquals(35, radio.getStation());
    }

    @Test
    public void updateStationOverLimit() {
        Radio radio = new Radio(10);
        radio.setStation(19);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void updateStationUnderLimit() {
        Radio radio = new Radio(10);
        radio.setStation(-10);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void volumePlus() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.plusVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void volumeMinus() {
        Radio radio = new Radio();
        radio.setVolume(56);
        radio.minusVolume();
        assertEquals(55, radio.getVolume());
    }

    @Test
    public void volumePlusOverLimit() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void volumeMinusOverLimit() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void MaxVolume() {
        Radio radio = new Radio();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void MinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void showVolume(){
        Radio radio = new Radio();
        radio.setVolume(74);
        assertEquals(74, radio.getVolume());
    }



}
