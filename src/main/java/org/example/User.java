package org.example;

import lombok.Getter;

@Getter
public class User {
    private String login;
    private String password;
    private Basket basket;


    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public User(String login, String password) {

        this.login = login;

        this.password = password;

        this.basket = new Basket();

    }


}
