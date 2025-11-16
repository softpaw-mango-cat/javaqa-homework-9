package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RadioTest {

    public Radio radio;

    @BeforeEach
    public void setUp() {
        radio = new Radio();
    }

    // тесты на сеттеры для поля stationId, граничные значения
    @Test
    public void shouldSetIdToMinWhenIdBelowLowerLimit() {
        int expected = 0;
        radio.setStationId(-1);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIdToMinWhenIdEqualsLowerLimit() {
        int expected = 0;
        radio.setStationId(0);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectIdWhenIdAboveLowerLimit() {
        int expected = 1;
        radio.setStationId(1);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectIdWhenIdBelowUpperLimit() {
        int expected = 8;
        radio.setStationId(8);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIdToMaxWhenIdEqualsUpperLimit() {
        int expected = 9;
        radio.setStationId(9);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIdToMaxWhenIdAboveUpperLimit() {
        int expected = 10;
        radio.setStationId(10);
        int actual = radio.getStationId();

        Assertions.assertEquals(expected, actual);
    }

    // тесты на метод next(), граничные значения
    @Test
    public void shouldSetNextStationWhenIdEqualsLowerLimit() {
        radio.setStationId(0);
        radio.next();
        int expected = 1;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationWhenIdAboveLowerLimit() {
        radio.setStationId(1);
        radio.next();
        int expected = 2;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationWhenIdBelowUpperLimit() {
        radio.setStationId(8);
        radio.next();
        int expected = 9;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStationWhenIdAEqualsUpperLimit() {
        radio.setStationId(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    // тесты на метод prev(), граничные значения
    @Test
    public void shouldSetMaxStationWhenIdEqualsLowerLimit() {
        radio.setStationId(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationWhenIdAboveLowerLimit() {
        radio.setStationId(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationWhenIdBelowUpperLimit() {
        radio.setStationId(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationWhenIdEqualsUpperLimit() {
        radio.setStationId(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getStationId();
        Assertions.assertEquals(expected, actual);
    }

    // тесты на сеттеры для поля volume, граничные значения
    @Test
    public void shouldSetVolumeToMinWhenVolumeBelowLowerLimit() {
        int expected = 0;
        radio.setVolume(-1);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMinWhenVolumeEqualsLowerLimit() {
        int expected = 0;
        radio.setVolume(0);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectVolumeWhenVolumeAboveLowerLimit() {
        int expected = 1;
        radio.setVolume(1);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectVolumeWhenVolumeBelowUpperLimit() {
        int expected = 99;
        radio.setVolume(99);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMaxWhenVolumeEqualsUpperLimit() {
        int expected = 100;
        radio.setVolume(100);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMinWhenVolumeAboveUpperLimit() {
        int expected = 0;
        radio.setVolume(101);
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тесты на метод volumeUp(), граничные значения
    @Test
    public void shouldSetNextVolumeWhenVolumeEqualsLowerLimit() {
        radio.setVolume(0);
        radio.volumeUp();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolumeWhenVolumeAboveLowerLimit() {
        radio.setVolume(1);
        radio.volumeUp();
        int expected = 2;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolumeWhenVolumeBelowUpperLimit() {
        radio.setVolume(99);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolumeWhenVolumeEqualsUpperLimit() {
        radio.setVolume(100);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тесты на метод volumeDown(), граничные значения
    @Test
    public void shouldSetMinVolumeWhenVolumeEqualsLowerLimit() {
        radio.setVolume(0);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousVolumeWhenVolumeAboveLowerLimit() {
        radio.setVolume(1);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousVolumeWhenVolumeBelowUpperLimit() {
        radio.setVolume(99);
        radio.volumeDown();
        int expected = 98;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousVolumeWhenVolumeEqualsUpperLimit() {
        radio.setVolume(100);
        radio.volumeDown();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
