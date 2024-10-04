# Proyecto de Práctica: PeliculasSWAPI

<p align="center">
   <img src="http://img.shields.io/static/v1?label=STATUS&message=En%20Desarrollo&color=RED&style=for-the-badge" #vitrinedev/>
</p>

## Descripción

Este proyecto permite al usuario interactuar con la API de SWAPI (Star Wars API) para obtener información sobre las películas de la saga. El usuario ingresa un número del 1 al 7 para seleccionar una película, y el programa muestra los detalles como el título, director, productor, entre otros. Los datos también se serializan en archivos JSON para su almacenamiento local.

## 🔧 Tecnologías Utilizadas

- **Lenguaje de programación**: Java ☕
- **Entorno de desarrollo**: IntelliJ IDEA 🖥️
- **HttpClient**: Utilizado para realizar solicitudes HTTP a la API.
- **Gson (de Google)**: Librería utilizada para convertir los datos JSON obtenidos de la API en objetos Java y viceversa.

## 🚀 Instalación

### 📋 Pre-requisitos 
1. Instala en tu ordenador: Java JDK 17 o superior.

* Puedes descargarlo desde aqui:
  ```
  https://www.oracle.com/ar/java/technologies/downloads/#java17
  
  ```
2. Tener acceso a Internet para realizar las solicitudes a la API de SWAPI.
3. Abre tu IDE o editor de codigo favorito.
   * Aunque el proyecto fue desarrollado en **IntelliJ IDEA**, puedes utilizar cualquier IDE o entorno de desarrollo de tu preferencia (como Eclipse, NetBeans, Visual Studio Code, etc.).
   * Si prefieres IntelliJ IDEA, puedes descargarlo aquí.
   
     
    ```
    https://www.jetbrains.com/es-es/idea/
    
    ```
4. **Librería Gson**: Necesitas agregar la librería Gson para el manejo de JSON.
* Puedes descargarla desde aqui:
  ```
  https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0
  
  ```
* Una vez estes ahi ve a `file` y descarga el archivo `jar (291 KB)`, agrégalo a tu proyecto en el IDE que estés usando.
  
> [!NOTE]
>  Esta es la forma en que instalé la biblioteca, aunque también se puede hacer utilizando gestores de dependencias como Maven u otros.

###  📁 📂 Clonar el repositorio 

1. Crea una carpeta en tu ordenador y luego clona este repositorio:
   
   ```
   https://github.com/Erika-Gimenez/Pelicula-SwApi.git
   
   ```
2. Navega hasta la carpeta del proyecto.

    ```
    cd PeliculasSwApi
    
    ```
4. Ejecuta la clase Principal que contiene el método main y sigue las intrucciones de la consola.

##  🔩 Funcionalidades

- **Peticiones de películas a la API Star Wars:** Al ingresar un número entre 1 y 7, el programa recupera la información correspondiente de esa película como título, número de episodio, director, productores y fecha de lanzamiento.
- **Deserializacion a Objeto:** Cada vez que se consulta una película, los datos recibidos desde la API se deserializan a un objeto Java de tipo Pelicula.
- **Formato de presentación mejorado:** Se implementó una interfaz con un único método en el record Pelicula, que formatea y muestra la información de manera legible, mejorando la experiencia del usuario al visualizar los datos.
- **Serialización a JSON:** Cada consulta se guarda en un archivo JSON con la información completa de la película.
- **Manejo de excepciones:** El programa maneja excepciones como entradas inválidas y se implementaron excepciones personalizadas para gestionar respuestas vacías o nulas para mejorar la experiencia del usuario.
- **Menú interactivo:** Tras cada consulta, el usuario puede decidir si seguir buscando más películas o salir del programa mediante un menú simple.

## 🛠️ Uso del Programa

1. Inicia el programa.
2. Introduce un número entre 1 y 7 para obtener información sobre una película específica de Star Wars.
3. Los detalles de la película se mostrarán en formato legible en la consola.
4. La información se guardará en un archivo JSON con el título `peliculas_star_wars.json`.
5. Puedes optar por continuar consultando o salir del programa.

## 🏠 Estructura del Proyecto

* El proyecto está organizado en los siguientes paquetes:

1. **principal:** Contiene la clase Principal que maneja el flujo de la aplicación.
2. **modelo:** Contiene el record Pelicula que representa los datos de cada película y una interfaz Configurable para formatear el toString de record.
3. **cliente:** Contiene la clase PeticionApi que maneja la solicitud HTTP a la API y la clase Serializacion para guardar la información de la película en un archivo JSON..
4. **excepciones:** Contiene excepciones personalizadas como ErrorEnPeticionNullException.


## 🙌🏽 Contribuciones 

¡Me encantaría tu ayuda para mejorar este proyecto! Puedes contribuir de varias maneras:
* Si encuentras algún error o problema.
* Si tienes ideas para nuevas funcionalidades o mejoras.
- Porfavor crea un issue para discutirlo. Me encanta recibir nuevas ideas.

## ✒️ Autores 

[<img src="https://github.com/user-attachments/assets/1e99f8e5-f229-4128-837a-554d2844c64c" width=115><br><sub>Gimenez Erika</sub>](https://github.com/Erika-Gimenez)

## 😊 Contacto 

* [Linkedin](https://www.linkedin.com/in/erika-gimenez/).
* [GitHub](https://github.com/Erika-Gimenez).
