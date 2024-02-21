package Libro;
 class Main {
    public static void main(String[] args) {
        System.out.println("Stock libreria Ramirez");
        System.out.println();
        
        Libro primerLibro=new Libro();

        primerLibro.valoresIniciales();

        System.out.println("Informacion del 1er libro: ");
        
        primerLibro.mostrarInfo();
        System.out.println();

        System.out.println("-------------------");

        Libro segundoLibro=new Libro();

        segundoLibro.titulo="Ben 10";
        segundoLibro.autor="Israel Ramirez";
        segundoLibro.anoPublicacion=1997;

        System.out.println("Informacion del 2do libro: ");
        System.out.println("Titulo: "+segundoLibro.titulo);
        System.out.println("Autor: "+segundoLibro.autor);
        System.out.println("Ano de publicacion: "+segundoLibro.anoPublicacion);
        System.out.println("-------------------");

        Libro tercerLibro=new Libro();

        tercerLibro.titulo="La mirada de las mil yardas";
        tercerLibro.autor="Antonio Herrera";
        tercerLibro.anoPublicacion=2022;

        System.out.println("Informacion del 3er libro: ");
        System.out.println("Titulo: "+tercerLibro.titulo);
        System.out.println("Autor: "+tercerLibro.autor);
        System.out.println("Ano de publicacion: "+tercerLibro.anoPublicacion);
        System.out.println("-------------------");

        Libro cuartoLibro=new Libro();

        cuartoLibro.titulo="El dia de tu boda...";
        cuartoLibro.autor="EL chachito";
        cuartoLibro.anoPublicacion=1509;

        System.out.println("Informacion del 4to libro: ");
        System.out.println("Titulo: "+cuartoLibro.titulo);
        System.out.println("Autor: "+cuartoLibro.autor);
        System.out.println("Ano de publicacion: "+cuartoLibro.anoPublicacion);
        System.out.println("-------------------");

        }
}
