public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Donation laPrimera = new Donation("BBVA;15/04/2023;12345678N;ACN;ACN8455;15.50");

        System.out.println(laPrimera.getAmount());
        System.out.println(laPrimera.getDate());
        System.out.println(laPrimera.getDocument());

        System.out.println(laPrimera.getDonationAmount(laPrimera.getDonationString()));


        Person elPrimero = new Person("12345678A;Patricia;170;+34699999999;F;54.6;08001;30/12/2000");




    }
}