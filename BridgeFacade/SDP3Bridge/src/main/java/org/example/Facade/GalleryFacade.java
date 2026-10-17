package org.example.Facade;

import org.example.Art.Painting;
import org.example.Exhibition.Exhibition;
import org.example.Exhibition.Gallery;
import org.example.ObjectType.Physical;
import org.example.Price.IPrice;

import java.util.Objects;

public class GalleryFacade {
    private final IPrice price;
    private final Exhibition gallery;

    public GalleryFacade(IPrice price) {
        this.price = Objects.requireNonNull(price);

        this.gallery = new Gallery(
                new Painting("Starry Night"),
                new Physical("Canvas"),
                100000,
                this.price
        );
    }
    public void showGallery(){
        gallery.show();

    }





}
