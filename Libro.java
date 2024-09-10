public class Libro {
    private String titulo;
    private String autor;
    private String propietario;
    private double precio;

    public Libro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getPropietario() {
        return propietario;
    }
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void visualizar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Propietario: " + propietario);
        System.out.println("Precio: $" + precio);
    }
}
class LibroTexto extends Libro {
    private String curso;

    public LibroTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Curso asociado: " + curso);
    }
}

class LibroTextoInstitucion extends LibroTexto {
    private String facultad;

    public LibroTextoInstitucion(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Facultad que lo publicó: " + facultad);
    }
}

class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Tipo de novela: " + tipo);
    }
}