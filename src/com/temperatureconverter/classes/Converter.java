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
    public static Double c2f(double degrees){
        return 1.8 * degrees + 32;
    }
    
    /**
     * Método estático para transformar grados
     * Fahrenheit a grados Celsius.
     * @return Los grados Celsius correspondientes.
     */
    public static double f2c(double degrees){
        return Math.round((degrees - 32) / 1.8);
    }
    
    /**
     * Método estático para transformar grados
     * Celsius a grados Kelvin.
     * @return Los grados Kelvin correspondientes.
     */
    public static double c2k(double degrees){
        return degrees + 273;
    }
    
    /**
     * Método estático para transformar grados
     * Kelvin a grados Celsius.
     * @return Los grados Celsius correspondientes.
     */
    public static double k2c(double degrees){
        return degrees - 273;
    }
}
