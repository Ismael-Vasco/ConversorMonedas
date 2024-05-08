package principal;

import modelos.*;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        // instacias y variables
        Valores inicio = new Valores();
        boolean salir = true;
        // variables
        String paisInicial = "";
        String paisAConvertir = "";
        String paisTres = "";
        Double cantidad = 0.0;

        // Instancias
        ConsultarMoneda consulta = new ConsultarMoneda();
        ListaDePaises pais = new ListaDePaises();
        PrintInicial print = new PrintInicial();
        HistorialDeConsulta historial = new HistorialDeConsulta();


        // Scanner
        Scanner teclado = new Scanner(System.in);

        while (salir){
            print.menu();
            var numeroDeOpcion = teclado.nextInt();

            switch (numeroDeOpcion) {
                case 1:
                    // pesos Latam a USD y EUR
                    print.paisesComunes();
                    paisInicial = inicio.opcionUno();
                    paisAConvertir = "USD";
                    paisTres = "EUR";
                    cantidad = inicio.cantidadAConvertir();

                    Moneda moneda = consulta.buscarMoneda(paisInicial, paisAConvertir, cantidad);
                    Moneda moneda2 = consulta.buscarMoneda(paisInicial, paisTres, cantidad);

                    print.mensajes(paisInicial, paisAConvertir, paisTres, cantidad,
                            moneda.conversion_result(), moneda2.conversion_result());

                    break;
                case 2:
                    inicio.opcionDos();
                    break;
                case 3:
                    double cantidadConvertida;
                    paisInicial = inicio.paisInicial();
                    paisAConvertir = inicio.paisAConvertir();
                    cantidad = inicio.cantidadAConvertir();

                    Moneda moneda3 = consulta.buscarMoneda(paisInicial, paisAConvertir, cantidad);
                    cantidadConvertida = print.decimal(moneda3.conversion_result());

                    System.out.println(String.format("""
                    \n
                        *********************************************************************
                                                    SE CONVIRTIO %s %s
                        *********************************************************************
                    """,cantidad,paisInicial));
                    String mensajeDeCantidad = String.format("""
                                                    EQUIVALE A: %S       %S
                        -----------------------------------------------------------------------
                    """,cantidadConvertida, paisAConvertir);
                    System.out.println(mensajeDeCantidad);

                    //inicio.opciontres();
                    break;
                case 4:
                    historial.print(consulta.retornoLista());
                    break;
                case 5:
                    salir = inicio.opcionCinco();
                    break;
                }
            }
        }
    }


