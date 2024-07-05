import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoeda {

    public Moeda ConversorMoedaSelecionada(int moeda, int valor) {
        String moedaBase = "";
        String moedaFinal = "";

        switch(moeda){
            case 1:
                moedaBase = "USD";
                moedaFinal = "ARS";
                break;
            case 2:
                moedaBase = "ARS";
                moedaFinal = "USD";
                break;
            case 3:
                moedaBase = "USD";
                moedaFinal = "BRL";
                break;
            case 4:
                moedaBase = "BRL";
                moedaFinal = "USD";
                break;
            case 5:
                moedaBase = "USD";
                moedaFinal = "COP";
                break;
            case 6:
                moedaBase = "COP";
                moedaFinal = "USD";
                break;
            case 7:
                System.out.println("Saindo");
        }
        try {
            URI endereco = URI.create("https://v6.exchangerate-api.com/v6/fe5fb419dfcb4ec1a48cff85/pair/" + moedaBase + "/" + moedaFinal + "/" + valor);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson((response.body()), Moeda.class);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
