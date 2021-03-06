package com.codecool.order;

import com.codecool.Basket;

public interface Orderable {
    public boolean checkout();

    public boolean pay();

    public void setStatus(String newStatus);

    public void setIsPaid(boolean newValue);

    public void setIsChecked(boolean newValue);

    public Basket getBasket();
}