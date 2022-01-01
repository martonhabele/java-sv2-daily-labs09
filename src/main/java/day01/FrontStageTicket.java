package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontStageTicket extends Ticket {
    private String extraCode;

    public FrontStageTicket(String artist, LocalDateTime startTime, int price, String extraCode) {
        super(artist, startTime, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return super.entryTime().minusHours(1);
    }

    public String getExtraCode() {
        return extraCode;
    }
}