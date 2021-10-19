package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD", 2048, 1000, 2);
        computer.showInfo();
        computer.on();
    }
}
