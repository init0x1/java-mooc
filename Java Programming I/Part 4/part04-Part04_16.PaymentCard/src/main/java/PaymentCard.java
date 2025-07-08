public class PaymentCard {
    private double balance;


    public PaymentCard(double openingBalance ){
        balance = openingBalance;
    }

    public void eatAffordably(){
        if(this.balance >= 2.60){
          this.balance-= 2.60;
        }
    }

    public void eatHeartily(){
        if(this.balance >= 4.60){
            this.balance -= 4.60;
        }

    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }


    public void addMoney(double money){
        if(money < 0){
            return;
        }
        this.balance += money;
        if(this.balance>150){
            this.balance = 150;
        }
    }


}
