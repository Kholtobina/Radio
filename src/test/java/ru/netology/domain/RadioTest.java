package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio(
                7,
                0,
                10,
                true
        );
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationOverMax() {
        Radio radio = new Radio(
                11,
                0,
                10,
                true
        );
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationUnderMin() {
        Radio radio = new Radio(
                -1,
                0,
                10,
                true
        );
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio(
                10,
                0,
                10,
                true
        );
        assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio radio = new Radio(
                0,
                0,
                10,
                true
        );
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void shouldSwitchCurrentRadioStationNext() {
        Radio radio = new Radio(
                9,
                0,
                10,
                true
        );
        radio.nextRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrev() {
        Radio radio = new Radio(
                1,
                0,
                10,
                true
        );
        radio.prevRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSwitchCurrentRadioStationOverMax() {
        Radio radio = new Radio(
                10,
                0,
                10,
                true
        );
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchCurrentRadioStationUnderMin() {
        Radio radio = new Radio(
                0,
                0,
                10,
                true
        );
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio(
                50,
                0,
                100
        );
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio(
                0,
                0,
                100
        );
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio(
                100,
                0,
                100
        );
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetCurrentVolumeOverMax() {
        Radio radio = new Radio(
                100,
                0,
                100
        );
        radio.nextVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeUnderMin() {
        Radio radio = new Radio(
                0,
                0,
                100
        );
        radio.prevVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchCurrentVolumeToNext() {
        Radio radio = new Radio(
                0,
                0,
                100
        );
        radio.nextVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchCurrentVolumeToPrev() {
        Radio radio = new Radio(
                100,
                0,
                100
        );
        radio.prevVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeOverMax() {
        Radio radio = new Radio(
                101,
                0,
                100
        );
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        Radio radio = new Radio(
                -1,
                0,
                100
        );
        assertEquals(0, radio.getCurrentVolume());
    }
}