package main.clients;

import java.time.LocalDate;

public class Duck extends Animal {

    //Todo напомнить в чём разница в double
    Double discount;

    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); //Todo сначала конструктор Супер-класса
        this.discount = discount;
    }

    public Duck() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    //Todo статикой пользоваться аккуратно ( пароли там не хранить :-) )
    public static void meow(){
        System.out.println("Апп - Апп!");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }
}