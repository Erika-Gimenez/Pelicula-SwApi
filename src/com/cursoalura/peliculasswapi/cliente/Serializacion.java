package com.cursoalura.peliculasswapi.cliente;

import com.cursoalura.peliculasswapi.modelo.Pelicula;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Serializacion {

    public void guardarJson(List<Pelicula> peliculas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("peliculas_star_wars.json");
        escritura.write(gson.toJson(peliculas));
        escritura.close();
    }

}
