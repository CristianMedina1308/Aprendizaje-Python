public class Main {
    public static void main(String[] args) {
       
        LibroTextoInstitucion libroTexto = new LibroTextoInstitucion(
                "Matemáticas Avanzadas", 
                "Juan Pérez", 
                "Matemáticas", 
                "Facultad de Ingeniería"
        );
        libroTexto.setPrecio(120.000);
        
       
        Novela novela = new Novela("Cien Años de Soledad", "Gabriel García Márquez", "Realista");
        novela.setPrecio(45.000);

        
        System.out.println("Información del Libro de Texto:");
        libroTexto.visualizar();

        System.out.println("\nInformación de la Novela:");
        novela.visualizar();

        // Indicación de entrega del parcial
        System.out.println("\nParcial entregado por: Andrés Felipe Astudillo y Cristian Camilo Medina");
    }
}