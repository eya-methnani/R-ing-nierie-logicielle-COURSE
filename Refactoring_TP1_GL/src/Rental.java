class Rental extends DomainObject {
    private Tape _tape;
    private int _daysRented;

    public Rental(Tape tape, int daysRented) {
        _tape = tape;
        _daysRented = daysRented;
    }

    public int daysRented() {
        return _daysRented;
    }

    public Tape tape() {
        return _tape;
    }

    // Masquer l'accès à Movie pour le calcul du coût
    public double rentalCost() {
        return tape().movie().calculateRentalCost(daysRented());
    }

    // Masquer l'accès à Movie pour obtenir le nom
    public String movieName() {
        return tape().movie().name();
    }
}
