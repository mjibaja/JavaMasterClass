package com.migueljibaja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Marsano", 8, 12);
        //theatre.getSeats();
        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13));
        priceSeats.add(theatre.new Seat("A00",13));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" "  + seat.getSeatNumber() + " " + seat.getPrice() );
        }
        System.out.println();
        System.out.println("==============================================================");
    }
}
