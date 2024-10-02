package com.cursoalura.peliculasswapi.cliente;

import com.cursoalura.peliculasswapi.excepciones.ErrorEnPeticionNullException;
import com.cursoalura.peliculasswapi.modelo.Pelicula;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PeticionApi{

    public Pelicula peticionDePelicula(int numeroDePelicula){

        URI direccion = URI.create("https://swapi.py4e.com/api/films/"+numeroDePelicula+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String body = response.body();
            if (body == null || body.isBlank()) {
                throw new ErrorEnPeticionNullException("El cuerpo de la respuesta está vacío o contiene datos inválidos.");
            }

            Pelicula pelicula = new Gson().fromJson(response.body(), Pelicula.class);
            if(pelicula.title()==null||pelicula.opening_crawl()==null||pelicula.title().isEmpty()||pelicula.opening_crawl().isEmpty()){
                throw new ErrorEnPeticionNullException("La película tiene títulos en blanco o nulos.");
            }

            return pelicula;
        }catch (ErrorEnPeticionNullException e){
            throw e;
        }catch (Exception e) {
            throw new RuntimeException("Error inesperado al realizar la solicitud: ");
        }
    }
}
