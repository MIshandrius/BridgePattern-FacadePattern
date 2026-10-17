package org.example.Facade;

import org.example.Art.Sculpture;
import org.example.Exhibition.Exhibition;
import org.example.Exhibition.Museum;
import org.example.ObjectType.Physical;

public class MuseumFacade {
    Exhibition museum = new Museum(
            new Sculpture("David"),
            new Physical("Marble statue"));

    public void showMuseum() {
        museum.show();
    }
}
