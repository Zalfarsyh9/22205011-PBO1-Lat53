/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205011.pbo.lat53.java;

import java.util.Scanner;

/**
 *
 * @author User
 * Nama : Zalfa Rosiyah Riski 
 * Nim : 22205011
 * Jurusan : Teknik Informatika 
 * Mata kuliah : PBO 1
 * Deskripsi : Membuat program dengan kelas animal kelinci 
 */

// Kelas Animal 
class Animal {

    //Atribut 
    private boolean vegetarian;
    private String eats;
    private int no0fLegs;

    //Constructor 
    public Animal(boolean vegetarian, String eats, int no0fLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.no0fLegs = no0fLegs;
    }
    // Method getVegetarian()

    public boolean isVegetarian() {
        return vegetarian;
    }
    // Method getEats()

    public String getEats() {
        return eats;
    }
    // Method getNo0fLegs()

    public int getNoOfLegs() {
        return no0fLegs;
    }
}
// Kelas Rabbit 

class Rabbit extends Animal {
    // Atribut 

    private String color;
    private String name;
    // Constructor 

    public Rabbit(String name, boolean vegetarian, String eats, int no0fLegs, String color) {
        super(vegetarian, eats, no0fLegs);
        this.name = name;
        this.color = color;
    }
    // Method getName()

    public String getName() {
        return name;
    }
    // Method getColor()

    public String getColor() {
        return color;
    }
}
// Main Class

public class PBOLat53Java {
    // Method main()

    public static void main(String[] args) {
        // Membuat objek Rabbit 
        Rabbit rabbit = new Rabbit("Robby", true, "rumput", 4, "putih");

        // Menampilkan atribut dari objek rabbit 
        System.out.println("Nama: " + rabbit.getName());
        System.out.println("Vegetarian: " + rabbit.isVegetarian());
        System.out.println("Makanan: " + rabbit.getEats());
        System.out.println("Jumlah kaki: " + rabbit.getNoOfLegs());
        System.out.println("Warna: " + rabbit.getColor());
    }
}