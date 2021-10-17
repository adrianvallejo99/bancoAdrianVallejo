package banco;

import java.util.Scanner;

public class Hipoteca {
    public static void main(String[] args) {
        /*
            El Banco Tetimo quiere desarrollar un programa de estudio de viabilidad hipotecaria para potenciales
            clientes de la entidad. Este programa debe decidir si un cliente es "apto" para ser timado por el banco o
            por el contrario, según los datos aportados por el cliente, el banco lo rechaza y lo declara "no apto" por
            no ser rentable.
            Según los gerentes de Tetimo, cuando un cliente aterriza en su web para solicitar una hipoteca, lo primero
            que deben saber es su edad y su sueldo bruto mensual. Hay que tener en cuenta que no se conceden préstamos
            a menores de edad y a mayores de 65 años.
            Si la edad es válida, el programa solicita al cliente la cantidad total de pasta que necesita para su
            hipoteca. Si esa cantidad que se solicita supera la cantidad resultante de multiplicar el sueldo bruto
            anual del cliente por el factor multiplicativo, entonces la hipoteca se rechaza. En Tetimo el factor
            multiplicativo es de 5,85. Por ejemplo, si un cliente gana al año 30000 pavos, no podría pedir más de
            30000*5,85.
            Si el cliente ha pasado el filtro de edad y el filtro de la cantidad a solicitar, el programa le solicita
            el número de años en los que quiere devolver la hipoteca. Tetimo no concede hipotecas a más de 30 años y
            a menos de cinco. Además, si la edad de la persona sumada a los años a devolver el préstamo supera los
            75 años, el préstamo se rechaza.
         */
        // Clase Scanner
        Scanner teclado = new Scanner(System.in);

        // Pedimos por teclado la edad y guardamos en variable entera
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        // Comparamos la edad, para que realice la estructura del if si está dentro del rango
        if (edad >= 18 && edad <= 65) {
            // Pedimos por teclado el sueldo bruto mensual y guardamos en variable entera
            System.out.println("Introduce tu sueldo bruto mensual:");
            int sueldo = teclado.nextInt();
            // Calculamos el sueldo anual factor
            int sueldoAnualFactor = sueldo * 12;
            // Pedimos por teclado el prestamo y guardamos en variable double
            System.out.println("Cantidad del prestamo: ");
            double prestamo = teclado.nextDouble() * 5.85;

            // Comparamos la edad, para que realice la estructura del if si está dentro del rango
            if (sueldoAnualFactor > prestamo) {
                // Pedimos por teclado los años a pagar el prestamo y guardamos en variable int
                System.out.println("En cuantos años quieres pagarlo? ");
                int year = teclado.nextInt();

                // Comparamos la edad, para que realice la estructura del if si está dentro del rango
                if (year > 5 || year < 30) {
                    // Comparamos la edad, para que realice la estructura del if si está dentro del rango
                    if ((edad + year) < 75) {
                        System.out.println("Prestamo Concedido");
                    } else {
                        System.out.println("Lo sentimos no podemos concedertelo");
                    }
                } else {
                    System.out.println("Lo sentimos el tiempo para pagarlo no entra en nuestros servicios");
                }
            } else {
                System.out.println("Lo sentimos no cobras lo suficiente como para pagar");
            }
            // else if para que si la edad es menor 18 salte un mensaje
        } else if (edad < 18) {
            System.out.println("Niño a estudiar");
            // else if para que si la edad es menor 18 salte un mensaje
        } else if (edad > 65) {
            System.out.println("Abuelete el prestamo a tu hijo");
        }
    }
}
