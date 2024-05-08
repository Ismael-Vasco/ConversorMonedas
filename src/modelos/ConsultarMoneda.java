package modelos;

import com.google.gson.Gson;
import modelos.Valores;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;


public class ConsultarMoneda {
    //instancia para llamar el historial
    HistorialDeConsulta historial = new HistorialDeConsulta();
    // lista para guardar los datos
    List fecha;

    // metodo para consultar moneda
    public Moneda buscarMoneda(String monedaSinConvertir,
                               String monedaConvertida,
                               Double cantidad) {


        URI direccion = URI
                .create("https://v6.exchangerate-api.com/v6/46017d2c7d1b49ae85d0689b/pair/"+
                        monedaSinConvertir + "/"+
                        monedaConvertida + "/"+
                        cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            fecha = historial.marcaTemporal(monedaSinConvertir,monedaConvertida);

            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("Moneda no Admitida");
        }
    }

    // metodo para consultar lista llena con las consultas
    public List retornoLista() {
        return fecha;
    }
}
