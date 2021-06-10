
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
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros+addition.euros, this.cents+addition.cents); // create a new Money object that has the correct worth
        // return the new Money object
        return newMoney;
        
        /*
        //Another solution
        
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();

        if (cents > 99) {
            cents = cents - 100;
            euros = euros + 1;
        }
        return new Money(euros, cents);*/
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decreaser){
        int newEuros = this.euros-decreaser.euros();
        int newCents = this.cents-decreaser.cents();
        
        if(newCents < 0){
            newEuros = newEuros - 1;
            newCents = newCents + 100;
        }

        // if the value becomes negative, return zero
        if (euros < 0) {
            newEuros = 0;
            newCents = 0;
            
            //or return new Money(0,0);
        }
        
        return new Money(newEuros, newCents);

    }

}
