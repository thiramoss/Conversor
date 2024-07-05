import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int moedaConverter;
        int valor;
        ConversorMoeda moedaSelecionada = new ConversorMoeda();

                System.out.println("Seja bem vindo(a) ao Conversor de moeda \n");
        System.out.println("1) Dólar =>> Peso argentino. \n2) Peso argentino =>> Dólar \n3) Dólar =>> Real brasileiro \n4) Real brasileiro =>> Dólar \n5) Dólar =>> Peso colombiano \n6) Peso colombiano =>> Dólar \n7) sair\n");
        System.out.println("Digite uma opção válida: ");
        moedaConverter = leitura.nextInt();
        System.out.println("Digite o valor que deseja converter: ");
        valor = leitura.nextInt();

        Moeda conversaoMoeda = moedaSelecionada.ConversorMoedaSelecionada(moedaConverter, valor);
        System.out.println(conversaoMoeda);

        }
    }