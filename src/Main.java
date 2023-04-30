public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Donation laPrimera = new Donation("BBVA;15/04/2023;12345678N;ACN;ACN8455;15.50");

        System.out.println(laPrimera.getAmount());
        System.out.println(laPrimera.getDate());
        System.out.println(laPrimera.getDocument());

        System.out.println(laPrimera.getDonationAmount(laPrimera.getDonationString()));


        Person elPrimero = new Person("12345678A;Patricia;170;+34699999;F;54.6;08001;30/12/2000");

        System.out.println(elPrimero.getName());
        System.out.println(elPrimero.getPhone());
        System.out.println(elPrimero.getCp());
        System.out.println(elPrimero.getBirthday());

DonationManager lo = new DonationManager();
lo.verifyDonation(laPrimera,elPrimero);
        System.out.println(elPrimero.getBirthdayPrint());
        System.out.println(elPrimero.getName()+" "+elPrimero.getDocument());
        elPrimero.getPerson("87654321A;Roger;158;+3460000000;M;54.6;08020;08/06/2023");
        System.out.println(elPrimero.getName()+" "+elPrimero.getDocument());
    }
}