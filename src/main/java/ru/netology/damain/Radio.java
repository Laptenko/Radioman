package ru.netology.damain;

public class Radio {
    private int station;
    private int maxStation = 9;
    private int minStation = 0;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
      if (station > maxStation){
          return;
      }
      if (station < minStation){
          return;
      }
      this.station = station;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void next(int station) {
        if (station >= maxStation) {
            this.station = 0;
            return;
        }
        this.station = station + 1;
    }

    public void prev(int station) {
        if (station <= minStation) {
            this.station = 9;
            return;
        }
        this.station = station - 1;
    }

    private int volume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getVolume() {
        return volume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }

    public void plusVolume(int volume){
        if (volume >= maxVolume){
            this.volume = maxVolume;
            return;
        }
        this.volume = volume + 1;
    }

    public void minusVolume(int volume){
        if (volume <= minVolume){
            this.volume = minVolume;
            return;
        }
        this.volume = volume - 1;
    }
}
