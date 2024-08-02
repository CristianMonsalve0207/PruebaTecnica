package co.com.screenplay.project.models;

import co.com.screenplay.project.utils.RandomDataGenerator;
import lombok.Getter;

@Getter
public class Candidate {
    private String primerNombre;
    private String segundoNombre;
    private String apellido;
    private String email;
    private String numeroTelefono;
    private String palabrasClave;
    private String notas;

    public Candidate() {
        this.primerNombre = RandomDataGenerator.generarPrimerNombre();
        this.segundoNombre = RandomDataGenerator.generarSegundoNombre();
        this.apellido = RandomDataGenerator.generarApellido();
        this.email = RandomDataGenerator.generarEmail();
        this.numeroTelefono = RandomDataGenerator.generarNumero();
        this.palabrasClave = RandomDataGenerator.generarPalabrasClaves();
        this.notas = RandomDataGenerator.generarNotas();
    }
}

