import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void TestStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void TestStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void TestStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void TestVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void TestVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void TestVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);

        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void PrevStationValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        assertEquals(8, radio.getCurrentStation());

    }

    @Test
    public void MaxStationValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void NextStationValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void MinStationValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void NextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void MinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void MaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void PrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.reduceVolume();

        assertEquals(9, radio.getCurrentVolume());
    }
}