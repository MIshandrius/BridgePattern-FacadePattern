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
        IPrice price;

        try(Scanner scanner = new Scanner(System.in)) {
            price = choosePrice(scanner);
        }

        MuseumFacade museum = new MuseumFacade();
        museum.showMuseum();

        System.out.println("--------------");

        GalleryFacade gallery = new GalleryFacade(price);
        gallery.showGallery();

    }

    private static IPrice choosePrice(Scanner scanner) {
        while (true) {
            System.out.println(
                    "Choose your currency: 1 - USD, 2 - EUR, 3 - KZT"
            );

            if (!scanner.hasNextLine()) {
                System.out.println("No input. Using USD.");
                return new PriceUsd();
            }

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    return new PriceUsd();
                case "2":
                    return new PriceEur();
                case "3":
                    return new PriceKzt();
                default:
                    System.out.println(
                            "Invalid choice. Please enter 1, 2 or 3."
                    );
            }
        }
    }


}
