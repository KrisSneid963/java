public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents = newCents % 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int currentCents = this.euros * 100 + this.cents;
        int decreaserCents = decreaser.euros * 100 + decreaser.cents;

        if (currentCents < decreaserCents) {
            return new Money(0, 0);
        }

        int newCents = currentCents - decreaserCents;
        int newEuros = newCents / 100;
        newCents = newCents % 100;

        return new Money(newEuros, newCents);
    }

    @Override
    public String toString() {
        String zero = this.cents < 10 ? "0" : "";
        return this.euros + "." + zero + this.cents + "e";
    }
}
