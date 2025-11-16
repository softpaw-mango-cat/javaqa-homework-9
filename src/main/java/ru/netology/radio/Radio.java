package ru.netology.radio;

public class Radio {
    private int stationId;
    private int volume;
    private int stationAmount;

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public Radio() {
        this.stationAmount = 10;
    }

    public void setStationId(int stationId) {
        if (stationId < 0) {
            this.stationId = 0;
        } else {
            this.stationId = stationId;
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
        int maxStationId = stationAmount - 1;
        if (stationId == maxStationId) {
            stationId = 0;
        } else {
            stationId++;
        }
    }

    public void prev() {
        int maxStationId = stationAmount - 1;
        if (stationId == 0) {
            stationId = maxStationId;
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
