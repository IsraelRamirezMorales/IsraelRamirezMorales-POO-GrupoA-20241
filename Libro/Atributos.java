package Libro;
class Libro {

    String titulo;
    String autor;
    int anoPublicacion;
    
    void valoresIniciales(){
        titulo= "Game of thrones";
        autor="Diego Alexis";
        anoPublicacion= 2005;
    }
    
    void mostrarInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano de publicacion: "+anoPublicacion);
    }


}
