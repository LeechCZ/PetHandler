package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pet> pets = new ArrayList<>();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println("Spousti se program");
        menu();
    }

    private static void menu() {
        System.out.println("Zadejte 1 pro pridani zviratka:");
        System.out.println("Zadejte 2 pro odebrani zviratka:");
        System.out.println("Zadejte 3 pro vypis:");
        System.out.println("Zadejte 4 pro ukonceni programu:");
        int userInput = Integer.parseInt(sc.nextLine());

        switch (userInput) {
            case 1 -> {
                addPet();
            }
            case 2 -> {
                removePet();
            }
            case 3 -> {
                printAllPets();
            }
            case 4 -> System.exit(1);
            default -> {
                System.out.println("Spatne zadani!");
                menu();
            }
        }

    }

    private static void addPet() {
        System.out.println("Zadejte jmeno:");
        String name = sc.nextLine();
        System.out.println("Zadejte vek:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pohlavi:");
        String gender = sc.nextLine();
        System.out.println("Zadejte druh:");
        String type = sc.nextLine();
        System.out.println("Zadejte pocet nohou:");
        int numberOfLegs = Integer.parseInt(sc.nextLine());
        pets.add(new Pet(name, age, gender, type, numberOfLegs));
        menu();
    }

    private static void removePet() {
        System.out.println("Zadejte jmeno zviratka pro odstraneni:");
        String name = sc.nextLine();
        pets.removeIf(pet -> pet.getName().equals(name));
        menu();
    }

    private static void printAllPets() {
        System.out.println(pets);
        menu();
    }
}
