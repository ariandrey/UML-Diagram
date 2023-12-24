import java.io.*;

class Main {
    public static void main(String[] args) {
        Kiraci kiraci = new Kiraci("Berk", "Dönmez", new Bina("Yapı", 5));
        Daire daire = new Daire("A1", 1, 100);
        EvSahibi evSahibi = new EvSahibi("Ari", "Andrey", kiraci.getEvSahibi());
        Konut konut = new Konut("Merkez");

        kiraci.displayInfo();
        daire.displayInfo();
        evSahibi.displayInfo();
        konut.displayInfo();
    }
}

class Daire {
    private String apartmentNumber;

    public Daire(String apartmentNumber, int floorNumber, int size) {
        this.apartmentNumber = apartmentNumber;
    }

    public void displayInfo() {
        System.out.println("Daire - Apartman Numarası: " + apartmentNumber);
    }

    public int compareTo(Daire other) {
        return this.apartmentNumber.compareTo(other.apartmentNumber);
    }
}

class Bina {
    private int numberOfFloors;

    public Bina(String name, int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void displayInfo() {
        System.out.println("Bina - Kat Numarası: " + numberOfFloors);
    }
}

class Kiraci {
    private String firstName;
    private String lastName;
    private Bina evSahibi;

    public Kiraci(String firstName, String lastName, Bina evSahibi) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.evSahibi = evSahibi;
    }

    public void displayInfo() {
        System.out.println("Kiracı - Adı: " + firstName + " " + lastName);
        evSahibi.displayInfo();
    }

    public Bina getEvSahibi() {
        return evSahibi;
    }
}

class EvSahibi {
    private String firstName;
    private String lastName;
    private Bina bina;

    public EvSahibi(String firstName, String lastName, Bina bina) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bina = bina;
    }

    public void displayInfo() {
        System.out.println("EvSahibi - İsim: " + firstName + " " + lastName);
        bina.displayInfo();
    }

    public void addApartment(Daire daire) {
        // Daire ekleme işlemleri
    }
}

class Konut {
    private String address;

    public Konut(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Konut - Adres: " + address);
    }
}