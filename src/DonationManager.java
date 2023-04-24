import java.time.LocalDate;

public class DonationManager {

    public void verifyDonation(Donation donacion, Person persona){
       if (donacion.getDocument().equals(persona.getDocument())){
           System.out.println("Concuerdan los datos de la persona y la donación.");
       }else {
           System.out.println("La donación no ha sido realizada por la persona solicitada.");
       }

        if (donacion.getDocument().equals(persona.getDocument())&&persona.getBirthday().plusYears(18).isBefore(LocalDate.now())) {
            System.out.println("La persona es mayor de edad.");
        }else{
            System.out.println("La persona no es mayor de edad.");
        }
    }


    //class
}
