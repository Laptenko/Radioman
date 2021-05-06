package ru.netology.damain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {

    @Test
    public void createRadio(){
        Radio radio = new Radio();
        radio.maxStation = 9;
        radio.minStation = 0;
        assertEquals(9, radio.maxStation);
        assertEquals(0, radio.minStation);
    }

}
