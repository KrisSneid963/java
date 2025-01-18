public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        double affordableMealCost = 2.50;
        if (payment >= affordableMealCost) {
            this.money += affordableMealCost;
            this.affordableMeals++;
            return payment - affordableMealCost;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        double heartyMealCost = 4.30;
        if (payment >= heartyMealCost) {
            this.money += heartyMealCost;
            this.heartyMeals++;
            return payment - heartyMealCost;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // deduct the price of the meal from the card balance if possible
        double affordableMealCost = 2.50;
        if (card.takeMoney(affordableMealCost)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // deduct the price of the meal from the card balance if possible
        double heartyMealCost = 4.30;
        if (card.takeMoney(heartyMealCost)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double amount) {
        // add the given amount to the card balance if positive
        // increase the terminal's money by the same amount
        if (amount > 0) {
            card.addMoney(amount);
            this.money += amount;
        }
    }

    @Override
    public String toString() {
        // return a string representation of the terminal's state
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals +
                ", number of sold hearty meals: " + this.heartyMeals;
    }
}
