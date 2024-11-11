public class Movie extends DomainObject {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private int _priceCode;

    public Movie(String name, int priceCode) {
        _name = name;
        _priceCode = priceCode;
    }

    public int priceCode() {
        return _priceCode;
    }

   
    public double calculateRentalCost(int daysRented) {
        double cost = 0;
        switch (_priceCode) {
            case REGULAR:
                cost += 2;
                if (daysRented > 2) 
                    cost += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                cost += daysRented * 3;
                break;
            case CHILDRENS:
                cost += 1.5;
                if (daysRented > 3)
                    cost += (daysRented - 3) * 1.5;
                break;
        }
        return cost;
    }
}
