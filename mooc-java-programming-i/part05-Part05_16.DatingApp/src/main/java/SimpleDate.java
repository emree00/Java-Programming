
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }
         // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if(this.day==30 && this.month==12){
            this.day=0;
            this.month=1;
            this.year++;
        }
        if(this.day==30){
            this.day=0;
            this.month++;
        }
        this.day++;
    }
    
    public void advance(int howManyDays){
        for(int i=0; i<howManyDays;i++){
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day,this.month, this.year);

        newDate.advance(days);

        return newDate;
    }

}

/*    public void advance() {

        this.day = this.day + 1;

        if (this.day > 30) {

            this.month = this.month + 1;
            this.day = 1;

            if (this.month > 12) {

                this.year = this.year + 1;
                this.month = 1;
            }
        }
    }

    public void advance(int howManyDays) {

        int counter = 0;

        while (counter < howManyDays) {

            this.advance();
            counter = counter + 1;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {

        SimpleDate date = new SimpleDate(this.day, this.month, this.year);

        int counter = 0;

        while (counter < days) {
            date.advance();
            counter = counter + 1;
        }
        return date;

    }
*/
