package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // тесты на сеттеры для поля stationId, граничные значения
    @Test
    public void shouldSetIdToMinWhenIdBelowLowerLimit() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setStationId(-1);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIdToMinWhenIdEqualsLowerLimit() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setStationId(0);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectIdWhenIdAboveLowerLimit() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setStationId(1);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectIdWhenIdBelowUpperLimit() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setStationId(8);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIdToMaxWhenIdEqualsUpperLimit() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setStationId(9);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIdToMaxWhenIdAboveUpperLimit() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setStationId(10);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    // тесты на метод next(), граничные значения
    @Test
    public void shouldSetNextStationWhenIdEqualsLowerLimit() {
        Radio radio = new Radio();
        radio.setStationId(0);
        radio.next();
        int expected = 1;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationWhenIdAboveLowerLimit() {
        Radio radio = new Radio();
        radio.setStationId(1);
        radio.next();
        int expected = 2;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationWhenIdBelowUpperLimit() {
        Radio radio = new Radio();
        radio.setStationId(8);
        radio.next();
        int expected = 9;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStationWhenIdAEqualsUpperLimit() {
        Radio radio = new Radio();
        radio.setStationId(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    // тесты на метод prev(), граничные значения
    @Test
    public void shouldSetMaxStationWhenIdEqualsLowerLimit() {
        Radio radio = new Radio();
        radio.setStationId(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationWhenIdAboveLowerLimit() {
        Radio radio = new Radio();
        radio.setStationId(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationWhenIdBelowUpperLimit() {
        Radio radio = new Radio();
        radio.setStationId(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationWhenIdEqualsUpperLimit() {
        Radio radio = new Radio();
        radio.setStationId(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    // тесты на сеттеры для поля volume, граничные значения
    @Test
    public void shouldSetVolumeToMinWhenVolumeBelowLowerLimit() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setVolume(-1);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMinWhenVolumeEqualsLowerLimit() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setVolume(0);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectVolumeWhenVolumeAboveLowerLimit() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setVolume(1);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectVolumeWhenVolumeBelowUpperLimit() {
        Radio radio = new Radio();
        int expected = 99;
        radio.setVolume(99);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMaxWhenVolumeEqualsUpperLimit() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setVolume(100);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMinWhenVolumeAboveUpperLimit() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setVolume(101);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тесты на метод volumeUp(), граничные значения
    @Test
    public void shouldSetNextVolumeWhenVolumeEqualsLowerLimit() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeUp();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolumeWhenVolumeAboveLowerLimit() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.volumeUp();
        int expected = 2;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolumeWhenVolumeBelowUpperLimit() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolumeWhenVolumeEqualsUpperLimit() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тесты на метод volumeDown(), граничные значения
    @Test
    public void shouldSetMinVolumeWhenVolumeEqualsLowerLimit() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousVolumeWhenVolumeAboveLowerLimit() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousVolumeWhenVolumeBelowUpperLimit() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.volumeDown();
        int expected = 98;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousVolumeWhenVolumeEqualsUpperLimit() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.volumeDown();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
