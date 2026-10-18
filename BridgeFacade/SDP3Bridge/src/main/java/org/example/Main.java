package org.example;

import org.example.Facade.GalleryFacade;
import org.example.Facade.MuseumFacade;
import org.example.Price.IPrice;
import org.example.Price.PriceEur;
import org.example.Price.PriceKzt;
import org.example.Price.PriceUsd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GalleryFacade gallery = new GalleryFacade("Starry Night", 100000, "KZT");

        gallery.showGallery();

        gallery.presentVirtualGallery();
        gallery.presentPhysicalGallery();


        MuseumFacade museum = new MuseumFacade("DAVID");
        museum.showMuseum();

        museum.presentPhysicalMuseum();
        museum.presentVirtualMuseum();


    }


}
