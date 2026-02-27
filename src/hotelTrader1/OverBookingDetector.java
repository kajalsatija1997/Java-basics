package hotelTrader1;

import hotelTrader1.entities.Booking;
import hotelTrader1.entities.Hotel;

import java.time.LocalDate;
import java.util.*;

/*Java App Problem — Hotel Overbooking Detector
Problem Description
You are building a validator to detect overbooking risk in a hotel.
Each room can have at most one active booking per night.
Given bookings across rooms, detect dates where any room is double-booked.

        Classes
        Booking

String bookingId;
String roomId;
LocalDate checkIn;   // inclusive
LocalDate checkOut;  // exclusive

Hotel

String hotelId;
List<Booking> bookings;

Task
Detect overbooked dates per room
        Signature

static Map<String, List<LocalDate>> findOverbookedDates(
        Hotel hotel,
        LocalDate from,
        LocalDate to
)
Rules
Consider dates d ∈ [from, to)
A room is overbooked on date d if it has 2 or more bookings covering d
Return:
roomId → sorted list of overbooked dates
Only include rooms that have at least one overbooked date

Example Input

Booking b1 = new Booking("B1", "R1",
        LocalDate.of(2025,10,10),
        LocalDate.of(2025,10,13));

Booking b2 = new Booking("B2", "R1",
        LocalDate.of(2025,10,12),
        LocalDate.of(2025,10,14));

Booking b3 = new Booking("B3", "R2",
        LocalDate.of(2025,10,11),
        LocalDate.of(2025,10,12));

Hotel h = new Hotel("H1", List.of(b1, b2, b3));

LocalDate from = LocalDate.of(2025,10,10);
LocalDate to   = LocalDate.of(2025,10,15);

Expected Output

R1 → [2025-10-12]
Explanation:
R1 has two active bookings on 2025-10-12
R2 never overlaps*/
public class OverBookingDetector {

    public static Map<String, List<LocalDate>> findOverBookedDates(Hotel hotel,
                                                                   LocalDate from,
                                                                   LocalDate to)
    {
        Map<String,Map<LocalDate,Integer>> roomDateCount=new HashMap<>();

        for(Booking booking: hotel.getBookings())
        {
            //skip bookings outside range
            if(booking.getCheckOut().isBefore(from)||
                    booking.getCheckIn().isAfter(to.minusDays(1)))
            {
                continue;
            }

            LocalDate start=booking.getCheckIn().isBefore(from)
                    ? from
                    : booking.getCheckIn();

            LocalDate end=booking.getCheckOut().isAfter(to)
                    ? to
                    : booking.getCheckOut();

            roomDateCount.putIfAbsent(booking.getRoomId(),new HashMap<>());
            Map<LocalDate,Integer> dateCount=roomDateCount.get(booking.getRoomId());


            for(LocalDate date=start;date.isBefore(end);date=date.plusDays(1))
            {
                dateCount.put(date,dateCount.getOrDefault(date,0)+1);
            }

        }

        Map<String, List<LocalDate>> result=new HashMap<>();

        for(Map.Entry<String, Map<LocalDate,Integer>> entry: roomDateCount.entrySet())
        {

            List<LocalDate> overBookedDates= new ArrayList<>();

            for(Map.Entry<LocalDate,Integer> dateEntry: entry.getValue().entrySet())
            {
                if(dateEntry.getValue()>1)
                {
                    overBookedDates.add(dateEntry.getKey());
                }
            }

            if(!overBookedDates.isEmpty())
            {
                Collections.sort(overBookedDates);
                result.put(entry.getKey(),overBookedDates);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Booking b1 = new Booking("B1", "R1",
                LocalDate.of(2025,10,10),
                LocalDate.of(2025,10,13));

        Booking b2 = new Booking("B2", "R1",
                LocalDate.of(2025,10,12),
                LocalDate.of(2025,10,14));

        Booking b3 = new Booking("B3", "R2",
                LocalDate.of(2025,10,11),
                LocalDate.of(2025,10,12));

        Booking b4 = new Booking("B4", "R2",
                LocalDate.of(2025,10,11),
                LocalDate.of(2025,10,16));

        Booking b5 = new Booking("B5", "R1",
                LocalDate.of(2025,10,9),
                LocalDate.of(2025,10,13));

        Hotel h = new Hotel("H1", List.of(b1, b2, b3,b4,b5));

        LocalDate from = LocalDate.of(2025,10,10);
        LocalDate to   = LocalDate.of(2025,10,15);


        Map<String,List<LocalDate>> result=
                findOverBookedDates(h,
                      from,to);

        System.out.println(result);
    }
}
