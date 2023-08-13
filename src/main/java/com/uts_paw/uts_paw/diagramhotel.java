package com.uts_paw.uts_paw;

public class diagramhotel {
    String name;
    String address;
    final int noktp = 23750936;
    final int nokmr = 204;

    public void infoTamu() {
        System.out.println("Info Tamu:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("No KTP: " + noktp);
        System.out.println("No Kamar: " + nokmr);
    }

    public void waktuCheckin(String checkinTime) {
        System.out.println("Waktu Check-in: " + checkinTime);
    }

    public void waktuCheckout(String checkoutTime) {
        System.out.println("Waktu Check-out: " + checkoutTime);
    }

    public void informasiPembayaran(double amount) {
        System.out.println("Informasi Pembayaran:");
        System.out.println("Total Amount: $" + amount);
        // Add payment processing logic here
    }

    public void pesananMakanan(String foodOrder) {
        System.out.println("Pesanan Makanan: " + foodOrder);
        // Add food order processing logic here
    }

     public static void main(String[] args) {
        var customer = new diagramhotel();  // Create an instance of CustomerHotel
        customer.name = "Moh Firdaus";
        customer.address = "Wonogiri";

        customer.infoTamu();
        customer.waktuCheckin("21 Mei 2023 10:00 AM");
        customer.waktuCheckout("25 Mei 2023 12:00 PM");
        customer.informasiPembayaran(940000);
        customer.pesananMakanan("Ramen");
}
}