package com.temperatureconverter.classes;

/**
 * Clase que realiza los cálculos correspondientes
 * de la aplicación.
 * @author Zabieru
 * @version 1.0
 */
public class Converter {
    
    /**
     * Método estático para transformar grados
     * Celsius a grados Fahrenheit.
     * @return Los grados Fahrenheit correspondientes.
     */
    public static double c2f(double degrees){
        return 1.8 * degrees + 32;
    }
    
}
