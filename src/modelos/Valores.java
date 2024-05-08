package modelos;


import java.util.*;


public class Valores {
    // variables
    String paisInicial = "";
    String paisAConvertir = "";
    Double cantidad = 0.0;

    // Instancias
    ConsultarMoneda consulta = new ConsultarMoneda();
    ListaDePaises pais = new ListaDePaises();
    PrintInicial print = new PrintInicial();

    // listas
    List lista = Arrays.asList(7,19,20,29,31,32,33,108,109,114,147,149);

    // Scanner
    Scanner teclado = new Scanner(System.in);

    // Metodo inicial de la aplicación
//    public void conversion () {
//        print.menu();
//        var numeroDeOpcion = teclado.nextInt();
//
//        switch (numeroDeOpcion) {
//            case 1:
//                // pesos Latam a USD y EUR
//                print.paisesComunes();
//                paisInicial = this.opcionUno();
//                paisAConvertir = "USD";
//                paisTres = "EUR";
//                cantidad = this.cantidadAConvertir();
//
//                Moneda moneda = consulta.buscarMoneda(paisInicial, paisAConvertir, cantidad);
//                Moneda moneda2 = consulta.buscarMoneda(paisInicial, paisTres, cantidad);
//
//                print.mensajes(paisInicial,paisAConvertir,paisTres,cantidad,
//                        moneda.conversion_result(),moneda2.conversion_result());
//
//                break;
//            case 2:
//                this.opcionDos();
//                break;
//            case 3:
//                this.opciontres();
//                break;
//            case 4:
//                historial.print(consulta.retornoLista());
//                break;
//            case 5:
//                this.opcionCinco();
//                break;
//
//        }
//    }

    public String opcionUno() {
        String salida = "";
        try {
            var numeroDePais = teclado.nextInt();
            int index = lista.indexOf(numeroDePais);
            var valor = (int)lista.get(index);
            salida = pais.InicialesDelPais(valor);

        } catch (Exception e) {
            System.out.println("""
                    \n
                    *********************************************************************
                                    ESTE PAIS NO ESTA EN LA LISTA PRESENTADA
                    *********************************************************************
            """);
            salida = this.opcionUno();
        }
        return salida;
    }

    public void opcionDos() {
        // de USD a Latam
        paisInicial = "USD";
        cantidad = this.cantidadAConvertir();
        System.out.println(String.format("""
                    \n
                    *********************************************************************
                                             SE CONVIRTIO %s %s
                    *********************************************************************
                    """,cantidad,paisInicial));

        for (int i = 0; i < lista.size(); i++) {
            double cantidadConvertida;
            var valor = (int)lista.get(i);
            paisAConvertir = pais.InicialesDelPais(valor);

            Moneda moneda = consulta.buscarMoneda(paisInicial, paisAConvertir, cantidad);

            cantidadConvertida = print.decimal(moneda.conversion_result());
            String mensajeDeCantidad = String.format("""
                                           EQUIVALE A: %S       %S
                    -----------------------------------------------------------------------
                    """,cantidadConvertida, paisAConvertir);
            System.out.println(mensajeDeCantidad);
        }
    }

//    public void opciontres () {
//        double cantidadConvertida;
//        paisInicial = this.paisInicial();
//        paisAConvertir = this.paisAConvertir();
//        cantidad = this.cantidadAConvertir();
//
//        Moneda moneda = consulta.buscarMoneda(paisInicial, paisAConvertir, cantidad);
//
//        cantidadConvertida = print.decimal(moneda.conversion_result());
//
//        System.out.println(String.format("""
//                    \n
//                        *********************************************************************
//                                                    SE CONVIRTIO %s %s
//                        *********************************************************************
//                    """,cantidad,paisInicial));
//        String mensajeDeCantidad = String.format("""
//                                                    EQUIVALE A: %S       %S
//                        -----------------------------------------------------------------------
//                    """,cantidadConvertida, paisAConvertir);
//        System.out.println(mensajeDeCantidad);
//    }

    public boolean opcionCinco () {
        boolean booleano = true;
        System.out.println("""
                    \n
                    *********************************************************************
                                       ¡¡  ESTA SEGURO QUE QUIERE SALIR !!
                    *********************************************************************
                    
                    1   SI
                    2   NO
                    
                    """
        );
        var respuesta = teclado.nextInt();

        if (respuesta == 1){
            booleano = false;
        } else if (respuesta == 2) {
            booleano = true;
        } else {
            System.out.println("""
                        \n
                        *********************************************************************
                                           ¡¡  INGRESA UN NUMERO CORRECTO !!
                        *********************************************************************
                        """
                );
        }
        return booleano;
    }

    public String paisInicial() {
        print.PaisAconvertir();
        int numeroDePais = 0;
        try {
            numeroDePais = teclado.nextInt();
        }catch (Exception e){
            System.out.println("\nINGRESE UN NÚMERO SIN LETRAS INMERSAS\n");


        }
        if (numeroDePais > 161 || numeroDePais == 0) {
            System.out.println("""
                    \n
                        *********************************************************************
                                           !!!!!!! MONEDA NO EXISTENTE¡¡¡¡¡¡¡
                                           
                        POR FAVOR INGRESE EL NUMEROS DE UNA MONEDA DENTRO DEL RANGO PRESENTADO
                        *********************************************************************
                    """
            );
            return this.paisInicial();
        } else {
            return pais.InicialesDelPais(numeroDePais);
        }
    }

    public String paisAConvertir() {
        print.PaisAlQueSeConvertira();
        var numeroDePais = teclado.nextInt();
        if (numeroDePais > 161 || numeroDePais == 0) {
            System.out.println("""
                    \n
                        *********************************************************************
                                           !!!!!!! MONEDA NO EXISTENTE¡¡¡¡¡¡¡
                                           
                        POR FAVOR INGRESE EL NUMEROS DE UNA MONEDA DENTRO DEL RANGO PRESENTADO
                        *********************************************************************
                    """
            );
            return this.paisAConvertir();
        } else {
            return pais.InicialesDelPais(numeroDePais);
        }
    }

    public Double cantidadAConvertir() {
        print.cantidad();
        return teclado.nextDouble();
    }


}
