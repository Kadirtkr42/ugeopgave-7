public class Drink {

    double price;

    public void setPrice(double price) {
        if (price<0 ){
            throw new IllegalArgumentException(
                    "Prisen må ikke være negativ" + " " + price
            );
        } this.price = price;
}
}
