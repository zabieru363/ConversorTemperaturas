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
        return Math.round((degrees * 9 / 5) + 32);
    }
    
    /**
     * Método estático para transformar grados
     * Fahrenheit a grados Celsius.
     * @return Los grados Celsius correspondientes.
     */
    public static double f2c(double degrees){
        return Math.round((degrees - 32) * 5 / 9);
    }
    
    /**
     * Método estático para transformar grados
     * Celsius a grados Kelvin.
     * @return Los grados Kelvin correspondientes.
     */
    public static double c2k(double degrees){
        return Math.round(degrees + 273.15);
    }
    
    /**
     * Método estático para transformar grados
     * Kelvin a grados Celsius.
     * @return Los grados Celsius correspondientes.
     */
    public static double k2c(double degrees){
        return Math.round(degrees - 273.15);
    }
    
    /**
     * Método estático para transformar grados
     * Fahrenheit a grados Kelvin.
     * @return Los grados Kelvin correspondientes.
     */
    public static double f2k(double degrees){
        return Math.round((degrees - 32 / 1.8) + 273);
    }
    
    /**
     * Método estático para transformar grados
     * Kelvin a grados Fahrenheit.
     * @return Los grados Fahrenheit correspondientes.
     */
    public static double k2f(double degrees){
        return Math.round((degrees - 273.15) * 9 / 15 + 32);
    }
}
