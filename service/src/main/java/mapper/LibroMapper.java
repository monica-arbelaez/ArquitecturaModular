package mapper;


import format.LibroFormat;
import model.Libro;

public class LibroMapper {

    public Libro fromDTO(LibroFormat libroFormat){
        Libro libro = new Libro();
        libro.setId(libroFormat.getId());
        libro.setNombre(libroFormat.getNombre());
        libro.setCategoria(libroFormat.getCategoria());
        return libro;

    }

    public LibroFormat fromModel(Libro libro){
        LibroFormat libroFormat= new LibroFormat();
        libroFormat.setId(libro.getId());
        libroFormat.setNombre(libro.getNombre());
        libroFormat.setCategoria(libro.getCategoria());
        return  libroFormat;
    }
}
