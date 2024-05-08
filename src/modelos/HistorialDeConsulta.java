package modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HistorialDeConsulta {

    // variable de tipo lista
    public static ArrayList<String> fechas = new ArrayList<>();

    // Hace el String que almacena la Lista
    public List marcaTemporal (String paisInicial,
                               String paisAConvertir) {
        String fecha = String.valueOf(LocalDate.now());
        String hora = String.valueOf(LocalTime.now());
        String mensaje = String.format("El %s a las %s se convirtio de %s a %s", fecha,
                hora, paisInicial, paisAConvertir);
        fechas.add(mensaje);
        return fechas;
    }

    // devuelve el print de la lista
    public void print(List listaDeFechas) {

        try {
            System.out.println("""
                    \n    
                        *********************************************************************
                                                        HISTORIAL 
                        *********************************************************************
                    """);
            listaDeFechas.forEach(System.out::println);
        }catch (Exception e) {
            System.out.println("""
                    \n
                        *********************************************************************
                                                    HISTORIAL VACIO
                        *********************************************************************
                    """
            );
        }

    }
}
