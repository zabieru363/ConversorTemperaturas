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
    public static Double c2f(Double degrees){
        return 1.8 * degrees + 32;
    }
    
    /**
     * Método estático para transformar grados
     * Fahrenheit a grados Celsius.
     * @return Los grados Celsius correspondientes.
     */
    public static Double f2c(Double degrees){
        return (degrees - 32) / 1.8;
    }
    
}
