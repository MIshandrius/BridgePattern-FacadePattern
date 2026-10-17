package org.example.Exhibition;

import org.example.Art.IArt;
import org.example.ObjectType.IObjectFormat;
import org.example.Price.IPrice;

public class Gallery extends Exhibition{
    public Gallery(
            IArt artwork,
            IObjectFormat form,
            double priceUsd,
            IPrice price
    ) {
        super(artwork, price, priceUsd, form);
    }

    @Override
    public void show() {
        System.out.println("This artwork is available for sale");
        showDetails();
        System.out.println("Price: " + price.format(priceUsd));
    }
}
