
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class ServiceAPI {
    private String apikey;

    public ServiceAPI(String apikey) {
        this.apikey = apikey;
    }

    public String obtenerTasaCambio(String monedaOrigen, String monedaDestino, double valor){
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String urlString = "https://v6.exchangerate-api.com/v6/b575db0233e6b2debd49edb2/pair/"+monedaOrigen+"/"+monedaDestino+"/"+valor;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlString))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            String base = json.get("base_code").getAsString();
            String destino = json.get("target_code").getAsString();
            double valorFinal = json.get("conversion_result").getAsDouble();
            TipoMoneda tipo = new TipoMoneda(base, destino, valor, valorFinal);
            return tipo.toString();

        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la API", e);
        }
    }
}
