package ru.netology.damain;

public class Radio {
    private int station;
    private int maxStation = 9;
    private int minStation = 0;
    private int volume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station > maxStation) {
            return;
        }
        if (station < minStation) {
            return;
        }
        this.station = station;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void next() {
        if (station >= maxStation) {
            station = minStation;
            return;
        }
        station = station + 1;
    }

    public void prev() {
        if (station <= minStation) {
            station = maxStation;
            return;
        }
        station = station - 1;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void plusVolume() {
        if (volume >= maxVolume) {
            volume = maxVolume;
            return;
        }
        volume = volume + 1;
    }

    public void minusVolume() {
        if (volume <= minVolume) {
            volume = minVolume;
            return;
        }
        volume = volume - 1;
    }
}
