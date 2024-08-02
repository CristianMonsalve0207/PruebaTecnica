package co.com.screenplay.project.utils;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

public class RandomDataGenerator {

    private static final Random random = new Random();

    public static String generarPrimerNombre() {
        return RandomStringUtils.randomAlphabetic(8);
    }

    public static String generarSegundoNombre() {
        return RandomStringUtils.randomAlphabetic(8);
    }

    public static String generarApellido() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    public static String generarEmail() {
        return RandomStringUtils.randomAlphabetic(5) + "@example.com";
    }

    public static String generarNumero() {
        return RandomStringUtils.randomNumeric(10);
    }

    public static String generarPalabrasClaves() {
        return RandomStringUtils.randomAlphabetic(15);
    }

    public static String generarNotas() {
        return RandomStringUtils.randomAlphabetic(20);
    }
}