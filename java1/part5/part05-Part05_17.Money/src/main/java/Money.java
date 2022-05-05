
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents > 99) {
            newEuros = newEuros + newCents / 100;
            newCents = newCents % 100;
        }
        Money plusMoney = new Money(newEuros, newCents);
        return plusMoney;
    }

    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        } else {
            return false;
        }

        return false;

    }
    
    public Money minus(Money decreaser) {
        int newEuros = 0;
        int newCents = 0;
        
        if (!this.lessThan( decreaser)) {
            if( decreaser.cents > this.cents) {
                newEuros -= 1;
                newCents += 100;
                
            }
            newEuros += (this.euros - decreaser.euros);
            newCents += (this.cents - decreaser.cents);
    }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;

}
}
