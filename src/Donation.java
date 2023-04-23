import java.util.Date;

public class Donation {
    private String sucursal;
    private String date;
    private String document;
    private String ngo;
    private String projectCode;
    private double amount;

    public Donation(String donacion) {
String[] fraccionada = donacion.split(";");
if (fraccionada.length == 6){
    this.sucursal = fraccionada[0];
    this.date = fraccionada[1];
    this.document = fraccionada[2];
    this.ngo = fraccionada[3];
    this.projectCode = fraccionada[4];
    this.amount = Double.parseDouble(fraccionada[5]);
}else{
    System.out.println("La donación tiene menos campos de los necesarios.");
}
//constructor
    }

    public String getDonationString(){
        String donacionReconstruida = sucursal+";"+date+";"+document+";"+ngo+";"+projectCode+";"+amount;
        return donacionReconstruida;
    }

    public double getDonationAmount(String donation){
        String[]fraccionada = donation.split(";");
        return Double.parseDouble(fraccionada[5]);
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getDate() {
        return date;
    }

    public String getDocument() {
        return document;
    }

    public String getNgo() {
        return ngo;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public double getAmount() {
        return amount;
    }


//class
}
