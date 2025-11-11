package ru.netology.radio;

public class Radio {
    public int stationId;
    public int volume;

    public void setStationId(int stationId) {
        if (stationId >= 0 && stationId <= 9) {
            this.stationId = stationId;
        } else {
            this.stationId = 0;
            System.out.println("Номер радиостанции должен быть от 0 до 9");
        }
    }

    public int getStationId() {
        return stationId;
    }

    public void setVolume(int volume) {

        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            this.volume = 0;
            System.out.println("Громкость звука должна быть от 0 до 100");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (stationId == 9) {
            stationId = 0;
        } else {
            stationId++;
        }
    }

    public void prev() {
        if (stationId == 0) {
            stationId = 9;
        } else {
            stationId--;
        }
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
        } else {
            volume = 100;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 0;
        }
    }
}
