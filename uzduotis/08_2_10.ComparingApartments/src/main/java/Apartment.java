public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    //larger than
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    //  price difference
    public int priceDifference(Apartment compared) {
        int thisTotalPrice = this.squares * this.pricePerSquare;
        int comparedTotalPrice = compared.squares * compared.pricePerSquare;
        return Math.abs(thisTotalPrice - comparedTotalPrice);
    }

    //  which is more expensive
    public boolean moreExpensiveThan(Apartment compared) {
        int thisTotalPrice = this.squares * this.pricePerSquare;
        int comparedTotalPrice = compared.squares * compared.pricePerSquare;
        return thisTotalPrice > comparedTotalPrice;
    }
}
