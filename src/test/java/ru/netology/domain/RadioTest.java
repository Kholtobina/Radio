package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchCurrentRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        assertEquals(8, radio.getCurrentRadioStation());
        radio.nextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        assertEquals(2, radio.getCurrentRadioStation());
        radio.prevRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setMaxRadioStation(9);
        assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setMinRadioStation(0);
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void shouldSwitchToTheNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());
        radio.nextRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToThePrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
        radio.prevRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(3);
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetCurrentVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.prevVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchCurrentVolumeToNext() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
        radio.nextVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchCurrentVolumeToPrev() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
        radio.prevVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}
