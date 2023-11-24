package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        MainMenu mainMenu = new MainMenu();
        String filePath = "C:\\Users\\sinan\\IntelliJ projekter\\SP3\\MiniSP3V2\\src\\main\\java\\100bedstefilm.txt";
        System.out.println(mainMenu.readMoviesFromFile(filePath));

    }
}