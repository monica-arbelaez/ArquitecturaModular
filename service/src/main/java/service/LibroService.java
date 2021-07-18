package service;

import format.LibroFormat;
import mapper.LibroMapper;
import model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.webservices.WebServicesProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import repository.LibroRepository;

@Service
@EnableConfigurationProperties(WebServicesProperties.class)
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    LibroMapper libroMapper = new LibroMapper();

    public LibroFormat crearLibro(LibroFormat libroFormat){
        Libro libro = libroMapper.fromDTO(libroFormat);
        return libroMapper.fromModel(libroRepository.save(libro));
    }
}
