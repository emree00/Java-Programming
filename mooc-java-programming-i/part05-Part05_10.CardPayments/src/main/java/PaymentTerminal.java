public class PaymentTerminal {

    // This is how a constant is defined in Java
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTY_PRICE = 4.3;

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money=1000;
       
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        if(payment < AFFORDABLE_PRICE){
            return payment;
        }
        this.money+=AFFORDABLE_PRICE;
        this.affordableMeals++;
        return payment-AFFORDABLE_PRICE;
       
    }

 

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
       
        if(payment >= HEARTY_PRICE){
            this.money+=HEARTY_PRICE;
            payment-=HEARTY_PRICE;
            heartyMeals++;
            return payment;
        }
        return payment;
    }

 

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        if(card.balance() >= AFFORDABLE_PRICE){
            card.takeMoney(AFFORDABLE_PRICE);
            affordableMeals++;
            return true;
        }
        return false;
        
        
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
       
        if(card.balance()  >= HEARTY_PRICE){
            card.takeMoney(HEARTY_PRICE);
            heartyMeals++;
            return true;
        }
        return false;
        
        /* if (card.balance() < HEARTY_PRICE) {
            return false;

        }
        card.takeMoney(HEARTY_PRICE);
        this.heartyMeals++;
        return true;*/
    }

 

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum<0){
            return;
        }
        card.addMoney(sum);
        this.money+=sum;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}