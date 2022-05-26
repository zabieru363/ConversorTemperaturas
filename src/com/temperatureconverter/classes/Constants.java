package com.temperatureconverter.classes;

import javax.swing.JOptionPane;

/**
 * Clase de constantes para la aplicación.
 * Todo lo que se repite irá aquí.
 * @author Zabieru.
 * @version 1.0
 */
public class Constants {
    
    /**
     * Array de strings que contiene los diferentes
     * sistemas de grados disponibles.
     * Se utilizará para cargar los valores en los jcomboboxes.
     */
    public static final String[] DEGREES_SYSTEMS = {
        "Celsius", "Fahrenheit", "Kelvin"
    };
    
    /**
     * Método que permite salir de la aplicación
     * @return Codigo de respuesta 0 = si, 1 = no
     */
    public static Integer close(){
        Object[] options = {"Si", "No"};
        
        Integer response = JOptionPane.showOptionDialog(null, "¿Quieres salir de la aplicación?",
                "Salir", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, null);
        
        return response;
    }
}
