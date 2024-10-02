package com.cursoalura.peliculasswapi.modelo;

public record Pelicula(String title,
                       int episode_id,
                       String opening_crawl,
                       String director,
                       String producer,
                       String release_date) implements Configurable {


    @Override
    public String formatoBonito() {
        return String.format( "Título: %s%n" +
                "Número de episodio: %d%n" +
                "Introducción: %s%n" +
                "Director: %s%n" +
                "Productor: %s%n" +
                "Fecha de lanzamiento: %s", title, episode_id, opening_crawl, director, producer, release_date);
    }
}
