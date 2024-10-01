public class Seat {
    private String seatNumber;
    private String seatType;
    private int price;
    private boolean isAvailable;
    private String reservedBy;

    public Seat(String seatNumber, String seatType, int price) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.price = price;
        this.reservedBy = null;
        this.isAvailable = true;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isReserved() {
        return !isAvailable;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public void reserve(String userId) {
        this.isAvailable = false;
        this.reservedBy = userId;
    }

    public void cancel() {
        this.isAvailable = true;
        this.reservedBy = null;
    }
}
