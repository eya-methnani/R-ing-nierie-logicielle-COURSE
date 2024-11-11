import java.util.Enumeration;
import java.util.Vector;

class Customer extends DomainObject {
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    // Méthode qui génère le relevé de location
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + name() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.rentalCost();  // Appel direct à rentalCost()
            
            totalAmount += thisAmount;
            frequentRenterPoints++;

            // Bonus pour une location de deux jours ou plus d'une nouvelle sortie
            if (each.tape().movie().priceCode() == Movie.NEW_RELEASE && each.daysRented() > 1) {
                frequentRenterPoints++;
            }

            // Affichage des détails de chaque location
            result += "\t" + each.movieName() + "\t" + String.valueOf(thisAmount) + "\n";  // Appel direct à movieName()
        }

        // Ajout du total et des points de fidélité
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
}
