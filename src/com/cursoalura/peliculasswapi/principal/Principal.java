package com.cursoalura.peliculasswapi.principal;

import com.cursoalura.peliculasswapi.cliente.PeticionApi;
import com.cursoalura.peliculasswapi.cliente.Serializacion;
import com.cursoalura.peliculasswapi.excepciones.ErrorEnPeticionNullException;
import com.cursoalura.peliculasswapi.modelo.Pelicula;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PeticionApi peticion = new PeticionApi();
        List<Pelicula> peliculas = new ArrayList<>();
        String titulo= """
                                        **************************************************
                                         Descubre el universo de las peliculas Star Wards
                                        **************************************************
                """;
        System.out.print(titulo);
        while (true) {
            System.out.println("\nIngrese un numero del 1 al 7 para conocer mas sobre una pelicula de Star Wars:");

            try {
                int numeroDePelicula = Integer.valueOf(leer.nextLine());
                Pelicula pelicula = peticion.peticionDePelicula(numeroDePelicula);
                System.out.println(pelicula.formatoBonito());
                peliculas.add(pelicula);
                Serializacion generador = new Serializacion();
                generador.guardarJson(peliculas);

                System.out.println("\nDesea salir SI/NO");
                String salida = leer.nextLine();
                if (salida.equalsIgnoreCase("si")) {
                   break;
                }else if (!salida.equalsIgnoreCase("no")){
                    System.out.println("La respuesta ingresada es incorrecta.");
                }

            }catch (ErrorEnPeticionNullException e){
                System.out.println("Película no encontrada: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Número no encontrado: " + e.getMessage());
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
        }
    }

}
