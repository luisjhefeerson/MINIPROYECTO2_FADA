//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: FuncionesAuxiliares.java
//
// FECHA:  23.06.12
//
// AUTORES:
//     Marx Arturo Arias - 0840247-3743
//     marxarturoariasescobar@gmail.com
//
//     Luis Jeferson Gallardo - 0843805-2711
//     luisjhefeerson@gmail.com
//
//     Fidel Herney Palacios - 0832691-3743
//     herney400@gmail.com
//
//     Gustavo Adolfo Rodriguez - 0932979-3743    
//     gustalibreros@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//*************************************************************


package logica;

/**
 * Class description
 *
 *
 * @version        Enter version here..., 23.06.12
 * @author         Enter your name here...    
 */
public class FuncionesAuxiliares {

    /**
     * Method description
     *
     *
     * @param numbers
     *
     * @return
     */
    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        return maxValue;
    }

    /**
     * Method description
     *
     *
     * @param numbers
     *
     * @return
     */
    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        return minValue;
    }
}
