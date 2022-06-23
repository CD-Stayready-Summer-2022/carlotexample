package com.codedifferently.lot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Lot> lots;

    public Main(){
        lots = new ArrayList<>();
        Lot lot = new Lot("Kenna's Kars");
        lots.add(lot);
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        boolean continueFlag = true;
        while(continueFlag){
            print("Please select a Car lot by number");
            for (int x =  0; x < lots.size(); x++) {
                Lot lot = lots.get(x);
                String msg = String.format("Press %d for %s",x, lot.getName());
                print(msg);
            }
            Integer input = scanner.nextInt();
            Lot selectedLot = lots.get(input);

            print("You selected " + selectedLot.getName());

            print("Would you like to quit ? Y/N");
            String quit =scanner.next();
            continueFlag = (!quit.equals("Y"));
        }
    }

    private void print(String msg){
        System.out.println(msg);
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
