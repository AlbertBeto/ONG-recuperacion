import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Person {
    private String document;
    private String name;
    private int heigth;
    private String phone;
    private String gender;
    private double weight;
    private String cp;
    private LocalDate birthday;

    public Person(String persona) {
        String[] personaDesglosada = persona.split(";");

        this.document = personaDesglosada[0];
        this.name  = personaDesglosada[1];

        //Para la altura convierto el String en Integer con el parseInt.
        this.heigth = Integer.parseInt(personaDesglosada[2]);

        //El teléfono tiene que ser dígitos y viene con el carácter "+".
        //Confirmamos que el teléfono sea un String de 12 caracteres y que empiece con un "+" y que sin el + sean solo dígitos.
        //Me encuentro con el problema que no puede guardar con INT un valor de 11 dígitos, es demasiado grande para un int.
        //Con lo que se presentan de primeras dos opciones o guardo el código internacional en otro campo y guardo los 9 dígitos
        //restantes como int o lo guardo tot como String. Tras volver a leer decido guardarlo como String, pero confirmando que son
        //digitos. Creo un pack de else If que comprueben si son 11 dígitos sin el "+" o si son 9 dígitos sin el "+"
        String digitos = "\\d+";
        if (personaDesglosada[3].substring(0,1).equals("+")&&personaDesglosada[3].length()==12&&personaDesglosada[3].substring(1,11).matches(digitos)){
            this.phone  = personaDesglosada[3];
            //Otra opción es que venga sin el "+" o que sea el número pelado y que sean tot digitos. Confirmamos con el siguiente elseIf
        } else if (!personaDesglosada[3].substring(0,1).equals("+")&&(personaDesglosada[3].length()==11)&&personaDesglosada[3].matches(digitos)) {
            this.phone = "+"+personaDesglosada[3];
            System.out.println("Posible error en el dato teléfono. Confirmar información.");
            System.out.println("Se ha guardado como +"+personaDesglosada[3]);
        }else if (!personaDesglosada[3].substring(0,1).equals("+")&&(personaDesglosada[3].length()==9)&&personaDesglosada[3].matches(digitos)) {
            this.phone = "+34"+personaDesglosada[3];
            System.out.println("Posible error en el dato teléfono. Confirmar información.");
            System.out.println("Se ha guardado como +34"+personaDesglosada[3]);
        }else{
        System.out.println("El telefono es erroneo. Por favor, confirme los datos, borre el usuario y vuelva a introducirlos");}


        //Los campos de Gender solo pueden ser F o M.
        if (personaDesglosada[4].equals("F")||personaDesglosada[4].equals("M")){
        this.gender  = personaDesglosada[4];
        }else{
            System.out.println("Error en el genero de la persona. Confirme los datos, borre el usuario y vuelva a introducirlos.");
            System.out.println(personaDesglosada[4]);
        }

        this.weight = Double.parseDouble(personaDesglosada[5]);

        //El cp son 5 dígitos y debe poder haber "0" en la primera posición.
        //Tras darle vueltas creo que nunca vamos a hacer cálculos matemáticos con el cp con lo que lo guardaría como String que permite los 0 al principio.
        //Si fuese obligatorio lo convertiría en Int y si al sacarlo para imprimirlo en pantalla es menor que 5 le pondría 0s delante
        // hasta llegar a un length de 5.
        this.cp  = personaDesglosada[6];

        //Vamos a guardar la fecha de cumpleaños como atributo Date.
        //Primero montamos el formato de Date con el que vamos a trabajar.
        DateTimeFormatter formatoEuropa = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Le doy valor a birthday con el formato preestablecido y convirtiendo el String en LocalDate.
        //EEEEEEEEEEEERRRRRRRRRRRRROOOOOOOORRRRRRRRRRRR - IMPRIME EL FORMATO USA
        LocalDate fecha = LocalDate.parse(personaDesglosada[7],formatoEuropa);
           this.birthday  = fecha;

        //CONSTRUCTOR
    }


    //GETS

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public int getHeigth() {
        return heigth;
    }

    public String getPhone() {
        return phone;
    }


    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public String getCp() {
        return cp;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    //METODOS

    public String getPersonString(){
        String personaReconstuida = document+";"+name+";"+heigth+";"+phone+";"+gender+";"+weight+";"+cp+";"+birthday;
        return personaReconstuida;
    }

    public void getPerson(String person){

    }

    //class
}
