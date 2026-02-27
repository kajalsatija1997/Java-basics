package hotelTrader1.entities;

import java.util.List;

public class Hotel {

    private String hotelId;
    private List<Booking> bookings;

    public Hotel(String hotelId, List<Booking> bookings) {
        this.hotelId = hotelId;
        this.bookings = bookings;
    }

    public String getHotelId() {
        return hotelId;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
