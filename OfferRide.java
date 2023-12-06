public class OfferRide {
    private String pickupLocation;
    private String dropOffLocation;
    private String preferredDateTime;
    private int availableSeats;
    private double price;

    public OfferRide(String pickupLocation, String dropOffLocation, String preferredDateTime,
                     int availableSeats, double price) {
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.preferredDateTime = preferredDateTime;
        this.availableSeats = availableSeats;
        this.price = price;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public String getPreferredDateTime() {
        return preferredDateTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getPrice() {
        return price;
    }

    public String offerRide() {
        return "Ride offered from " + pickupLocation + " to " + dropOffLocation +
                " on " + preferredDateTime + " with " + availableSeats + " each seat for " + price;
    }
}
