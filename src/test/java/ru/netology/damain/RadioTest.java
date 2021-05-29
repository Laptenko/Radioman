package ru.netology.damain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {

    @Test
    public void maxStationDefolt() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void minStationDefolt() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void updateNextStation() {
        Radio radio = new Radio(17, 54);
        radio.next();
        assertEquals(18, radio.getStation());
    }

    @Test
    public void updateOverMaxStation() {
        Radio radio = new Radio(10,10);
        radio.next();
        assertEquals(0, radio.getStation());
    }

    @Test
    public void updatePrevStation() {
        Radio radio = new Radio(7,10);
        radio.prev();
        assertEquals(6, radio.getStation());
    }

    @Test
    public void updateUnderLimitPrevStation() {
        Radio radio = new Radio(0, 50);
        radio.prev();
        assertEquals(50, radio.getStation());
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
        radio.setStation(19);
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
        Radio radio = new Radio(1,100,0);
        radio.plusVolume();
        assertEquals(2, radio.getVolume());
    }

    @Test
    public void volumeMinus() {
        Radio radio = new Radio(50,100,0);
        radio.minusVolume();
        assertEquals(49, radio.getVolume());
    }

    @Test
    public void volumePlusOverLimit() {
        Radio radio = new Radio(100,100,0);
        radio.plusVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void volumeMinusOverLimit() {
        Radio radio = new Radio(0,100,0);
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
