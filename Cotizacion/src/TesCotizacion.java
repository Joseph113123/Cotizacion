/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josed
 */
import java.util.Scanner;

public class TesCotizacion {
    public static void main(String[] args) {

        // variables
        int opcion = 0;
        int folio = 0;
        String descripcionAuto = "";
        float precio = 0.0f;
        float porcentaje = 0.0f;
        int plazo = 0;

        Cotizacion cot = new Cotizacion();
        Scanner in = new Scanner(System.in);

        do {
            // menú
            System.out.println("1: Capturar datos");
            System.out.println("2: Mostrar pago inicial");
            System.out.println("3: Mostrar total a financiar");
            System.out.println("4: Mostrar pago mensual");
            System.out.println("5: Imprimir cotización");
            System.out.println("6: Salir");

            opcion = in.nextInt();
            in.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1: // captura
                    System.out.println("Dame el folio:");
                    folio = in.nextInt();
                    cot.setFolio(folio);
                    in.nextLine();

                    System.out.println("Descripción del auto:");
                    descripcionAuto = in.nextLine();
                    cot.setDescripcionAuto(descripcionAuto);

                    System.out.println("Precio del auto:");
                    precio = in.nextFloat();
                    cot.setPrecio(precio);

                    System.out.println("Porcentaje de pago inicial:");
                    porcentaje = in.nextFloat();
                    cot.setPorcentajePagoInicial(porcentaje);

                    System.out.println("Plazo (meses):");
                    plazo = in.nextInt();
                    cot.setPlazo(plazo);
                    break;

                case 2:
                    System.out.println("Pago inicial: " + cot.calcularPagoInicial());
                    break;

                case 3:
                    System.out.println("Total a financiar: " + cot.calcularTotalFin());
                    break;

                case 4:
                    System.out.println("Pago mensual: " + cot.calcularPagoMensual());
                    break;

                case 5:
                    cot.imprimirCotizacion();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("apoco si muy chitosito mijo");
            }

        } while (opcion != 6);

        in.close();
    }
}
