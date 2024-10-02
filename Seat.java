/**
 * Seat class represents a seat in an airplane.
 * It stores information about the seat number, type, price, availability,
 * and the user who reserved the seat.
 *
 * Programmed by: Nathan Dinh
 * Date: 10/02/2024
 */
public class Seat {
    // Declares variables
    private String seatNumber;
    private String seatType;
    private int price;
    private boolean isAvailable;
    private String reservedBy;

    /**
     * Constructs a Seat object with the specified seat number, type, and price.
     *
     * @param seatNumber The number of the seat (e.g., "1A").
     * @param seatType   The type of the seat (e.g., "First", "EPlus", "Economy").
     * @param price      The price of the seat.
     */
    public Seat(String seatNumber, String seatType, int price) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.price = price;
        this.reservedBy = null;
        this.isAvailable = true;
    }

    /**
     * Returns the seat number.
     *
     * @return The seat number.
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Returns the type of the seat.
     *
     * @return The type of the seat ("First", "EPlus", "Economy").
     */
    public String getSeatType() {
        return seatType;
    }

    /**
     * Returns the price of the seat.
     *
     * @return The price of the seat.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Checks if the seat is reserved.
     *
     * @return True if the seat is reserved, false otherwise.
     */
    public boolean isReserved() {
        return !isAvailable;
    }

    /**
     * Returns the ID of the user who reserved the seat.
     *
     * @return The user ID of the person who reserved the seat, or null if the seat is not reserved.
     */
    public String getReservedBy() {
        return reservedBy;
    }

    /**
     * Reserves the seat for a specific user.
     *
     * @param userId The ID of the user reserving the seat.
     */
    public void reserve(String userId) {
        this.isAvailable = false;
        this.reservedBy = userId;
    }

    /**
     * Cancels the reservation of the seat, making it available again.
     */
    public void cancel() {
        this.isAvailable = true;
        this.reservedBy = null;
    }
}
