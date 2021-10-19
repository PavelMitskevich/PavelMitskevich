package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private int ram;
    private int disc;
    private int cycles;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    boolean burned;

    public Computer(String cpu, int ram, int disc, int cycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.disc = disc;
        this.cycles = cycles;
    }

    public void showInfo() {
        System.out.println("Processor - " + cpu + ", Memory = " + ram + ", Disc = " + disc + ", Cycles = " + cycles);
    }

    public void on() {
        if (!burned) {
            System.out.println("Turning on...");
            if (cycles > 0 && checkAction()) {
                off();
            } else {
                computerIsBurned();
            }
        } else {
            computerIsBurned();
        }
    }

    private void computerIsBurned() {
        System.out.println("Computer burned out!");
        burned = true;
    }

    private boolean checkAction() {
        int value = -1;
        System.out.println("Attention! Enter 0 or 1");
        do {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Incorrect value, please enter 0 or 1");
                scanner.next();
            }
        } while (!(value == 0 || value == 1));
        return random.nextInt(2) == value;
    }

    public void off() {
        cycles--;
        System.out.println("Shutdown...");
        if (!burned) {
            System.out.println("Computer is off");
            System.out.println("Number of cycles remaining: " + cycles);
            on();
        } else {
            computerIsBurned();
        }
    }
}
