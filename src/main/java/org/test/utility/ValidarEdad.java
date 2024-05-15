package org.test.utility;

import java.time.LocalDate;
import java.time.Period;

public class ValidarEdad {
    public static boolean esMayorDeEdad(LocalDate fechaNacimiento, int edadMinima) {
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, ahora);

        return periodo.getYears() >= edadMinima;
    }

   // public static void main(String[] args) {
    //    LocalDate fechaNacimiento = LocalDate.of(2000, 5, 15);
     //   int edadMinima = 18;

        //if (esMayorDeEdad(fechaNacimiento, edadMinima)) {
      //      System.out.println("La persona es mayor de edad.");
      //  } else {
      //      System.out.println("La persona no es mayor de edad.");
// }
//}

}
