import java.time.LocalDate;

public class DonationManager {

    public void verifyDonation(Donation donacion, Person persona){
       if (donacion.getDocument().equals(persona.getDocument())){
           System.out.println("Concuerdan los datos de la persona y la donación.");
       }else {
           System.out.println("La donación no ha sido realizada por la persona solicitada.");
       }
//Hago un segundo IF para confirmar si la persona es mayor de edad. Para evitar impresiones si no es la misma persona descarto
//el ELSE y realizo un else if que vuelve a confirmar si es la misma persona y si sumandole 18 la fecha va mas alla de hoy.
        if (donacion.getDocument().equals(persona.getDocument())&&persona.getBirthday().plusYears(18).isBefore(LocalDate.now())) {
            System.out.println("La persona es mayor de edad.");
        } else if (donacion.getDocument().equals(persona.getDocument())&&persona.getBirthday().plusYears(18).isAfter(LocalDate.now())) {
            System.out.println("La persona no es mayor de edad.");
        }
    }


    //class
}
