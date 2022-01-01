package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String artist;
    private LocalDateTime startTime;
    private int price;

    public Ticket(String artist, LocalDateTime startTime, int price) {
        this.artist = artist;
        this.startTime = startTime;
        this.price = price;
    }

    public LocalTime entryTime() {
        return startTime.toLocalTime().minusHours(1);
    }

    public String getArtist() {
        return artist;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}