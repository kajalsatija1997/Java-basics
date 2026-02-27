package hotelTrader1.entities;

import java.time.LocalDate;

public class Booking {

    private String bookingId;
    private String roomId;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Booking(String bookingId, String roomId, LocalDate checkIn, LocalDate checkOut) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getRoomId() {
        return roomId;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }
}
